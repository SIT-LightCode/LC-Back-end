package com.senior.dreamteam.authentication.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record ChangePasswordRequest(
        @NotEmpty(message = "Email cannot be empty")
        @Email(message = "Invalid email format")
        String email,
        @NotEmpty(message = "Password cannot be empty")
        String password,
        @NotEmpty(message = "New password cannot be empty")
        String newPassword
) {
}