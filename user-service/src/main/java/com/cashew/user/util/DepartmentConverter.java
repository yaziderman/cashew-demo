package com.cashew.user.util;

import com.cashew.user.VO.Department;
import com.cashew.user.VO.EmailAddress;

import javax.persistence.AttributeConverter;

public class DepartmentConverter implements AttributeConverter<Department, Long> {
    @Override
    public Long convertToDatabaseColumn(Department department) {
        return department.getDepartmentId();
    }

    @Override
    public Department convertToEntityAttribute(Long aLong) {
        Department department = new Department();
        department.setDepartmentId(aLong);
        return department;
    }
}
