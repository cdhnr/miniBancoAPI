package com.example.miniBancoAPI.service;

import com.example.miniBancoAPI.entity.Cliente;
import com.example.miniBancoAPI.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Camada de serviço para encapsular a lógica de negócio relacionada a Clientes.
 * Todos os métodos são transacionais por padrão.
 */
@Service
@RequiredArgsConstructor
@Transactional
public class ClienteService {

    private final ClienteRepository clienteRepository;

    /**
     * Salva um novo cliente no banco de dados.
     *
     * @param cliente O objeto Cliente a ser persistido.
     * @return O Cliente salvo com o ID preenchido.
     */
    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    /**
     * Retorna uma lista com todos os clientes cadastrados no sistema.
     *
     * @return Uma lista de objetos {@link Cliente}.
     */
    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }
}
