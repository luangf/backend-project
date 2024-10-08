package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.UserType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import com.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.dtos.UserDTO;

import jakarta.persistence.EntityManager;

import java.math.BigDecimal;
import java.util.Optional;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	@Autowired
	EntityManager entityManager;

	@Test
	@DisplayName("Should get User successfully from DB")
	void findUserByDocumentCase1() { // or ..Success ..Error
		// Padrao Triple A - Arrange, Act, Assert
		// Arrange (tudo que é necessário para o teste rodar)
		String document="321321231";
		UserDTO userDTO=new UserDTO("joao", "almeida", document, "joao-almeida@gmail.com", "123456", new BigDecimal(10), UserType.COMMON);
		createUser(userDTO);

		// Act (rodamos de fato aqui, o que queremos por a prova)
		Optional<User> result=userRepository.findUserByDocument(document);

		// Assert (verificamos se a operação em act surtiu o efeito esperado)
		assertThat(result.isPresent()).isTrue();
	}

	@Test
	@DisplayName("Should not get User successfully from DB when user not exists")
	void findUserByDocumentCase2() { // or ..Success ..Error
		// Padrao Triple A - Arrange, Act, Assert
		// Arrange (tudo que é necessário para o teste rodar)
		String document="321321231";

		// Act (rodamos de fato aqui, o que queremos por a prova)
		Optional<User> result=userRepository.findUserByDocument(document);

		// Assert (verificamos se a operação em act surtiu o efeito esperado)
		assertThat(result.isEmpty()).isTrue();
	}

	private User createUser(UserDTO userDTO){
		User newUser=new User(userDTO);
		entityManager.persist(newUser);
		return newUser;
	}

}
