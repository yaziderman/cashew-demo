package com.cashew.user.service;

import antlr.debug.DebuggingParser;
import com.cashew.user.VO.Department;
import com.cashew.user.VO.ResponseTemplateVO;
import com.cashew.user.entity.User;
import com.cashew.user.repository.UserRepository;
import com.google.gson.Gson;
import com.sun.xml.bind.v2.TODO;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();

        User user = userRepository.findByUserId(userId);
        Department department = null;
        if (user != null && user.getDepartment() != null){
            department = restTemplate.getForObject(
                    "http://localhost:9003/departments/" + user.getDepartment().getDepartmentId(),
                    Department.class
            );
            user.setDepartment(department);
            vo.setDepartment(department);
        }

        vo.setUser(user);

        return vo;
    }

    public User saveUser(User user) throws JSONException {
        log.info("Inside Save User of UserService");

        if (user.getDepartment() != null){
            Department department = new Department(user.getDepartment());
            if (department.getDepartmentId() == null){
                /* #TODO
                *  Register a new event for creating the department if not available.
                * */
                restTemplate = new RestTemplate();
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                JSONObject personJsonObject = new JSONObject();
                personJsonObject.put("departmentName", user.getDepartment().getDepartmentName());
                personJsonObject.put("departmentCode", user.getDepartment().getDepartmentCode());
                personJsonObject.put("departmentAddress", user.getDepartment().getDepartmentAddress());

                HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
                String url = "http://localhost:9003/departments/";

                Department dep = new Department(user.getDepartment());
                HttpEntity<Department> request = new HttpEntity<>(dep, headers);
                ResponseEntity<String> result = restTemplate.postForEntity("http://localhost:9003/departments/", request, String.class);

                Gson g = new Gson();
                Department createdDepartment = g.fromJson(result.getBody(), Department.class);
                user.setDepartment(createdDepartment);
            }
        }

        return userRepository.save(user);
    }


}
