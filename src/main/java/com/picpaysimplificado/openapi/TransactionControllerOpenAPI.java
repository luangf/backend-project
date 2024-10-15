package com.picpaysimplificado.openapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.picpaysimplificado.domain.transaction.Transaction;
import com.picpaysimplificado.dtos.TransactionDTO;

import io.swagger.v3.oas.annotations.Operation;

public interface TransactionControllerOpenAPI {
	@Operation(
			description = "this is a description to this api",
			summary = "this is a summary for this api"
			/*
			responses = {
					@ApiResponse(
							description="e.g. Success",
							responseCode = "200"
					),
					@ApiResponse(
							description="e.g. Unauthorized / Invalid Token",
							responseCode = "403"
					)
			}*/
	)
	ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transaction) throws Exception;
}
