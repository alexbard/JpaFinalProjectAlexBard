package org.humber.project.exceptions;

import lombok.Getter;

@Getter
public class EmployeeUpdateValidationException extends RuntimeException {
    private final ErrorCode errorCode;

    public EmployeeUpdateValidationException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

}
