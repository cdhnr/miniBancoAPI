package com.example.miniBancoAPI.repository;

import com.example.miniBancoAPI.entity.Cliente; // Importar a classe Cliente
import org.springframework.data.jpa.repository.JpaRepository; // Importar a classe JpaRepository

import java.util.Optional;

/**
 * Repositório Spring Data JPA para a entidade {@link Cliente}.
 * Fornece métodos CRUD básicos e consultas personalizadas.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> { // Extender JpaRepository para operações CRUD
    /**
     * Busca um cliente pelo número da conta.
     * @param numeroConta O número da conta a ser pesquisado.
     * @return um {@link Optional} contendo o cliente se encontrado, ou vazio caso contrário.
     */
    Optional<Cliente> findByNumeroConta(String numeroConta); // Método para encontrar um cliente pelo número da conta

    /**
     * Verifica se já existe um cliente com o número da conta especificado.
     * @param numeroConta O número da conta a ser verificado.
     * @return {@code true} se um cliente com o número da conta existir, {@code false} caso contrário.
     */
    boolean existsByNumeroConta(String numeroConta); // Método para verificar se um cliente existe pelo número da conta
}