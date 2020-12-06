package com.cashew.user.VO;

import com.cashew.user.util.ValueObject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class EmailAddress implements ValueObject {
    private String email;

    private void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid e-mail address.");
        }

        this.email = email;
    }
    private Boolean isValidEmail(String email){
        return true;
    }

    public String getEmail() {
        return email;
    }
}