package com.andersonbelucci.apiteste.controller;

import com.andersonbelucci.apiteste.Endereco;
import com.andersonbelucci.apiteste.service.EnderecoService;

public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    // Métodos REST para criar, editar e consultar endereços
    public void criarEndereco(String logradouro, String cep, int numero, String cidade, String estado) {
        Endereco endereco = new Endereco(logradouro, cep, numero, cidade, estado);
        enderecoService.criarEndereco(endereco);
    }

    public void editarEndereco(String logradouro, String cep, int numero, String cidade, String estado, Endereco endereco) {
        enderecoService.editarEndereco(logradouro, cep, numero, cidade, estado, endereco);
    }

    public Endereco consultarEndereco(String cep) {
        return enderecoService.consultarEndereco(cep);
    }

    // Outros métodos REST para manipulação de endereços
}