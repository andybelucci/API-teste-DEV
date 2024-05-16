package com.andersonbelucci.apiteste.service;

import com.andersonbelucci.apiteste.Endereco;

import java.util.List;

public class EnderecoService {

    private List<Endereco> enderecos;

    // Métodos para criar, editar e consultar endereços
    public void criarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void editarEndereco(String logradouro, String cep, int numero, String cidade, String estado, Endereco endereco) {
        endereco.setLogradouro(logradouro);
        endereco.setCep(cep);
        endereco.setNumero(numero);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
    }

    public Endereco consultarEndereco(String cep) {
        for (Endereco endereco : enderecos) {
            if (endereco.getCep().equals(cep)) {
                return endereco;
            }
        }
        return null;
    }

    // Outros métodos para manipulação de endereços

}