package com.picpaysimplificado.services;

import com.picpaysimplificado.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class AuthorizationService {
    @Autowired
    private RestTemplate restTemplate;

    public boolean authorizeTransaction(User sender, BigDecimal value) {
        // ideal variavel de ambiente pra endpoint...
		/*
		ResponseEntity<Map> authorizationResponse = restTemplate.getForEntity("https://util.devi.tools/api/v2/authorize", Map.class);

		if(authorizationResponse.getStatusCode() == HttpStatus.OK) {
			String status=(String) authorizationResponse.getBody().get("status");
			return "success".equalsIgnoreCase(status);
		} else return false;*/
        return true;
    }
}
