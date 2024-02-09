package org.humber.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long customerId;
    private String name;
    private String email;
    private String phone;
    private String postalCode;
    private String country;
}
