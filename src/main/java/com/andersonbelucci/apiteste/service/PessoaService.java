package com.andersonbelucci.apiteste.service;

import com.andersonbelucci.apiteste.Pessoa;

import java.time.LocalDate;
import java.util.List;

    public class PessoaService {
        private List<Pessoa> pessoas;

        // Métodos para criar, editar e consultar pessoas
        public void criarPessoa(Pessoa pessoa) {
            pessoas.add(pessoa);
        }

        public void editarPessoa(String nomeCompleto, LocalDate dataNascimento, Pessoa pessoa) {
            pessoa.setNomeCompleto(nomeCompleto);
            pessoa.setDataNascimento(dataNascimento);
        }

        public Pessoa consultarPessoa(String nomeCompleto) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNomeCompleto().equals(nomeCompleto)) {
                    return pessoa;
                }
            }
            return null;
        }
    }
