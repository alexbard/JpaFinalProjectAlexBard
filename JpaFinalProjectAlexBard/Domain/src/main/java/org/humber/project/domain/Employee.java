package org.humber.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private String position;
    private String shiftType;
    private Double rate;
    private String status;
    private String password;
    private String phoneNumber;
}
