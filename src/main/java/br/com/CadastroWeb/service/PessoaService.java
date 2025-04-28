package br.com.CadastroWeb.service;

import java.util.List;

import br.com.CadastroWeb.model.Pessoa;

public interface PessoaService {
    Pessoa salvarPessoa(Pessoa pessoa);
    List<Pessoa> listarPessoas();
}