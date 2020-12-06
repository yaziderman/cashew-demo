package com.cashew.user.entity;

import com.cashew.user.VO.Department;
import com.cashew.user.VO.EmailAddress;

import com.cashew.user.VO.PK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass( PK.class )
public class User{


    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private Long userId;

    @Id
    @Column(name = "emirate_id")
    private String emirateId;

    private String firstName;
    private String lastName;
    private EmailAddress email;
    @Embedded
    private Department department;

}
