package org.humber.project.exceptions;

import lombok.Getter;

@Getter
public enum ErrorCode {
    EMPLOYEE_FIELD_NULL("One or more employee fields are null"),
    INVALID_EMPLOYEE_PASSWORD("Password must be at least 8 characters long"),
    INVALID_EMPLOYEE_PHONE_NUMBER("Phone number does not follow proper format"),
    INVALID_EMPLOYEE_RATE("Rate is greater than 150");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

}
