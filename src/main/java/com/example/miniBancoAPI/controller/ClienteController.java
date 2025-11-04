package com.example.miniBancoAPI.controller;

import com.example.miniBancoAPI.service.ClienteService;
import com.example.miniBancoAPI.entity.Cliente;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Controller para gerenciar as operações relacionadas a Clientes.
 * Expõe endpoints REST para cadastrar e listar clientes.
 */
@RestController //*
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
@Tag(name = "Cliente", description = "Operações relacionadas a clientes")
public class ClienteController {

    private final ClienteService clienteService;

    /**
     * Endpoint para cadastrar um novo cliente no sistema.
     *
     * @param cliente O objeto Cliente contendo os dados para cadastro, vindo no corpo da requisição.
     * @return ResponseEntity com o cliente salvo e status HTTP 200 (OK).
     */
    @Operation(
            summary = "Cadastrar um novo cliente",
            description = "Cria um novo registro de cliente no banco de dados."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Cliente cadastrado com sucesso."
    )
    @PostMapping
    public ResponseEntity<Cliente> cadastrar(
            @RequestBody @Parameter(description = "Dados do cliente a ser cadastrado", required = true) Cliente cliente) {
        Cliente clienteSalvo = clienteService.cadastrarCliente(cliente);
        return ResponseEntity.ok(clienteSalvo);
    }

    @Operation( // Listar todos os clientes
            summary = "Listar todos os clientes",
            description = "Retorna uma lista de todos os clientes cadastrados no sistema."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Lista de clientes retornada com sucesso."
    )
    @GetMapping
    /**
     * Endpoint para listar todos os clientes cadastrados.
     * @return ResponseEntity com a lista de todos os clientes e status HTTP 200 (OK).
     */
    public ResponseEntity<List<Cliente>> listarTodosClientes(){
        List<Cliente> clientes = clienteService.listarTodosClientes();
        return ResponseEntity.ok(clientes);
    }
}
