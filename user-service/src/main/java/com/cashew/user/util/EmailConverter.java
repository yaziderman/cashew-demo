package com.cashew.user.util;

import com.cashew.user.VO.EmailAddress;

import javax.persistence.AttributeConverter;

public class EmailConverter implements AttributeConverter<EmailAddress, String> {
    @Override
    public String convertToDatabaseColumn(EmailAddress emailAddress) {
        return emailAddress.getEmail();
    }

    @Override
    public EmailAddress convertToEntityAttribute(String s) {
        return new EmailAddress(s);
    }
}
