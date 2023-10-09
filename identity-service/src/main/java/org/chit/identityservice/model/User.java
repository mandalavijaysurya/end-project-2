package org.chit.identityservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private String userName;
    private String userEmail;
    private Phone phoneNumber;
    private String password;

}
