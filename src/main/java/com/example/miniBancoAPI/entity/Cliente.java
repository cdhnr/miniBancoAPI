package com.example.miniBancoAPI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Representa a entidade Cliente no banco de dados.
 * Mapeada para a tabela "clientes".
 */
@AllArgsConstructor // Anotação do Lombok para gerar um construtor com todos os argumentos
@NoArgsConstructor // Anotação do Lombok para gerar um construtor sem argumentos
@Getter // Gera os getters para todos os campos
@Setter // Gera os setters para todos os campos
@EqualsAndHashCode(of = "id") // Gera equals e hashCode baseados apenas no ID
@ToString // Gera o método toString
@Entity // Anotação para indicar que esta classe é uma entidade JPA
@Table(name = "clientes") // Anotação para mapear a entidade para a tabela "clientes" no banco de dados

public class Cliente {
    /**
     * Identificador único do cliente. Gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia de geração automática do ID
    private Long id; // Atributo para representar o ID do cliente

    /**
     * Nome completo do cliente. Não pode ser nulo.
     */
    @Column(nullable = false)
    private String nome; // Atributo para representar o nome do cliente

    /**
     * Número da conta do cliente. Deve ser único e não pode ser nulo.
     */
    @Column(unique = true, nullable = false)
    private String numeroConta; // Atributo para representar o número da conta bancária
    /**
     * Agência bancária do cliente.
     */
    private String agencia; // Atributo para representar a agência bancária
    /**
     * Saldo atual da conta do cliente. Inicia em zero por padrão.
     */
    private BigDecimal saldo = BigDecimal.ZERO;// Atributo para representar o saldo do cliente
}