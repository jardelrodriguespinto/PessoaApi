package com.pessoaapi.PessoaApi.controller;

import com.pessoaapi.PessoaApi.entity.Pessoa;
import com.pessoaapi.PessoaApi.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    @GetMapping("/pessoa")
    public List<Pessoa> getPessoas(){
        return pessoaService.listar();
    }
    @GetMapping("/pessoa/{pessoaId}")
    public Optional<Pessoa> getPessoa(@PathVariable Long pessoaId){
        return pessoaService.listarPorId(pessoaId);
    }

    @PostMapping("/pessoa")
    public Object createPessoa(@RequestBody Pessoa pessoa){
        try{
            return pessoaService.salvar(pessoa);
        } catch (IllegalAccessError ex){
            return ex.getMessage();
        }
    }
    @PutMapping("/pessoa/{pessoaId}")
    public Pessoa updatePessoa(@PathVariable Long pessoaId, @RequestBody Pessoa pessoa) {
        pessoa.setPessoaId(pessoaId);
        return pessoaService.salvar(pessoa);
    }
    @DeleteMapping("/pessoa/{pessoaId}")
    public void deletePessoa(@PathVariable Long pessoaId){
        pessoaService.deletar(pessoaId);
    }
}
