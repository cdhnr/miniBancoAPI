package com.example.miniBancoAPI.config; //

import io.swagger.v3.oas.models.OpenAPI; //
import io.swagger.v3.oas.models.info.Contact; //
import io.swagger.v3.oas.models.info.Info; //
import io.swagger.v3.oas.models.info.License; //
import org.springframework.context.annotation.Bean; //
import org.springframework.context.annotation.Configuration; //

/**
 * Classe de configuração para a documentação da API com Springdoc OpenAPI (Swagger).
 * Define as informações gerais da API que serão exibidas na interface do Swagger.
 */
@Configuration // Marque está classe como uma classe de configuração do Spring
public class SwaggerConfig {

    /**
     * Cria e configura o bean OpenAPI com as informações personalizadas da API.
     *
     * @return Uma instância de {@link OpenAPI} com os metadados da API.
     */
    @Bean
    public OpenAPI miniBancoApiOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Mini Banco API")
                        .description("API para gerenciamento de contas bancárias, transações e usuários.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Henrique Cordeiro")
                                .email("cdhnr@icloud.com")
                                .url("https://github.com/cdhnr"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")));
    }
}