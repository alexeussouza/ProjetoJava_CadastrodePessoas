package br.com.CadastroWeb.serviceImpl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import br.com.CadastroWeb.model.Pessoa;
import br.com.CadastroWeb.repository.PessoaRepository;
import br.com.CadastroWeb.service.PessoaService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    @Override
    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }
}