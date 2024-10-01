package com.picpaysimplificado.dtos;

import java.math.BigDecimal;

import com.picpaysimplificado.domain.user.UserType;

public record UserDTO(String firstName, String lastName, String document, String email, String password,
		BigDecimal balance, UserType userType) {

}
