package org.project2.userservice.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Email {
    private String localPart;
    private String domain;
}
