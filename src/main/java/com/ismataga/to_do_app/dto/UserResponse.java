package com.ismataga.to_do_app.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String name;
    private String  email;
    private String password;
}