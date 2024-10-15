package com.picpaysimplificado.openapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(
							contact = @Contact(name = "Luan"),
							description = "OpenAPI Documentation for back end challenge",
							title = "OpenAPI Specification back end challenge",
							version = "1.0"),
				   servers = {
						      @Server(description = "Local Environment", url = "http://localhost:8080")	   
						     })
public class OpenAPIConfig {

}
