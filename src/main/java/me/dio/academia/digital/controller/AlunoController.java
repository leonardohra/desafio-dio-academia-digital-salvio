package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.Impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController
{
    @Autowired
    AlunoServiceImpl service ;

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "data de nascimento", required = false) String dataDeNascimento)
    {
        return service.getAll(dataDeNascimento) ;
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form)
    {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacoes(@PathVariable Long id) { return service.getAllAvaliacoes(id) ;}
}
