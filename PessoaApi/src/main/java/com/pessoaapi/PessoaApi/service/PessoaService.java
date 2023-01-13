package com.pessoaapi.PessoaApi.service;

import com.pessoaapi.PessoaApi.entity.Pessoa;
import com.pessoaapi.PessoaApi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PessoaService {
    @Autowired
    PessoaRepository repository;
    public Pessoa salvar(Pessoa pessoa){
        if (pessoa.getName().isBlank() || pessoa.getName().isEmpty()){
            throw new IllegalStateException("Campo nome não pode ser nulo");
        } else if (pessoa.getAge() < 0) {
            throw new IllegalStateException("Campo idade deve ser maior que 0");
        }
            return repository.save(pessoa);
    }
    public List<Pessoa> listar(){
        return repository.findAll();
    }
    public Optional<Pessoa> listarPorId(Long pessoaId){
        return repository.findById(pessoaId);
    }
    public void deletar(Long pessoaId){
        repository.deleteById(pessoaId);
    }
}
