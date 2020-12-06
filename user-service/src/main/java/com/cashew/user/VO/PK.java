package com.cashew.user.VO;

import com.cashew.user.util.ValueObject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class PK implements Serializable {

    private Long userId;

    private String emirateId;

    public PK(Long userId, String emirateId) {
        this.userId = userId;
        this.emirateId = emirateId;
    }

    private PK() {
    }

    //Getters and setters omitted for brevity

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        PK pk = (PK) o;
        return Objects.equals( userId, pk.userId ) &&
                Objects.equals( emirateId, pk.emirateId );
    }

    @Override
    public int hashCode() {
        return Objects.hash( userId, emirateId );
    }
}