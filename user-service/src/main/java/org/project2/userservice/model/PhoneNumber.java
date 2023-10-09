package org.project2.userservice.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PhoneNumber {
    private String countryCode;
    private String phone;
}
