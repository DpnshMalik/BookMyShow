package com.bookmyshow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.bookmyshow.DTOS.SignUpRequestDTO;
import com.bookmyshow.DTOS.SignUpResponseDTO;

@SpringBootApplication
@EnableJpaAuditing
public class BookmyshowApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;

	@Override
	public void run(String... args) throws Exception {
		SignUpRequestDTO signUpRequestDTO = SignUpRequestDTO.builder().
				email("deepanshuvvdmg@gmail.com")
				.password("1234").build();
		SignUpResponseDTO responseDTO = userController.signUp(signUpRequestDTO);
	}

	public static void main(String[] args) {
		SpringApplication.run(BookmyshowApplication.class, args);
	}

}

