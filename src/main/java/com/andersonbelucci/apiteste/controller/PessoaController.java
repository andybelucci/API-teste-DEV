package com.andersonbelucci.apiteste.controller;

import com.andersonbelucci.apiteste.Pessoa;
import com.andersonbelucci.apiteste.service.PessoaService;

import java.time.LocalDate;

public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    // Métodos REST para criar, editar e consultar pessoas
    public void criarPessoa(String nomeCompleto, LocalDate dataNascimento) {
        Pessoa pessoa = new Pessoa(nomeCompleto, dataNascimento);
        pessoaService.criarPessoa(pessoa);
    }

    public void editarPessoa(String nomeCompleto, LocalDate dataNascimento, Pessoa pessoa) {
        pessoaService.editarPessoa(nomeCompleto, dataNascimento, pessoa);
    }

    public Pessoa consultarPessoa(String nomeCompleto) {
        return pessoaService.consultarPessoa(nomeCompleto);
    }

    // Outros métodos REST para manipulação de pessoas

}