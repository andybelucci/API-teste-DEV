package com.andersonbelucci.apiteste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nomeCompleto;
    private LocalDate dataNascimento;
    private List<Endereco> enderecos;

    public Pessoa(String nomeCompleto, LocalDate dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.enderecos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}

