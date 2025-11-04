package com.example.miniBancoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicia a aplicação Spring Boot Mini Banco API.
 * A anotação @SpringBootApplication habilita a autoconfiguração, a varredura de componentes
 * e a configuração específica do Spring Boot.
 */
@SpringBootApplication
public class MiniBancoApiApplication {
	/**
	 * Ponto de entrada principal para a aplicação.
	 * @param args Argumentos de linha de comando (não utilizados).
	 */
	public static void main(String[] args) {
		SpringApplication.run(MiniBancoApiApplication.class, args);
	}
}