package com.cashew.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public Department(Department department) {
        departmentId = department.departmentId;
        departmentName = department.departmentName;
        departmentAddress = department.departmentAddress;
        departmentCode = department.departmentCode;
    }

}
