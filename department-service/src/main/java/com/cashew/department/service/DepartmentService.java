package com.cashew.department.service;

import com.cashew.department.entity.Department;
import com.cashew.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside Save Department of Department Service");
        return departmentRepository.save(department);
    }


    public Department findDepartmentById(Long departmentId) {
        log.info("Inside Save Department of Department Service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
