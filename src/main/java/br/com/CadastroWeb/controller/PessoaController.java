package br.com.CadastroWeb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import br.com.CadastroWeb.model.Pessoa;
import br.com.CadastroWeb.service.PessoaService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    @GetMapping("/cadastro")
    public ModelAndView mostrarFormularioCadastro() {
        ModelAndView mv = new ModelAndView("formPessoa");
        mv.addObject("pessoa", new Pessoa());
        return mv;
    }

    @PostMapping("/salvar")
    public ModelAndView salvarPessoa(@ModelAttribute Pessoa pessoa) {
        pessoaService.salvarPessoa(pessoa);
        return new ModelAndView("redirect:/pessoas/listar");
    }

    @GetMapping("/listar")
    public ModelAndView listarPessoas() {
        ModelAndView mv = new ModelAndView("listaPessoa");
        mv.addObject("pessoas", pessoaService.listarPessoas());
        return mv;
    }
}