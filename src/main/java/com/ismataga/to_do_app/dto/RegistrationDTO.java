package com.ismataga.to_do_app.dto;

import com.ismataga.to_do_app.annotation.PasswordMatch;
import com.ismataga.to_do_app.annotation.Unique;
import com.ismataga.to_do_app.repository.UserRepository;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@PasswordMatch
public class RegistrationDTO {

    @NotBlank
    @Email
    @Unique(repositoryClass = UserRepository.class, methodName = "existsByUsername")
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String confirmPassword;

}
