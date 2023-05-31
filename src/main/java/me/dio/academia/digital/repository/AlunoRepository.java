package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>
{

    /**
     * Retorna uma lista com os alunos que nasceram na data informada
     * @param dataDeNascimento
     * @return lista com os alunos que nasceram na data informada
     */
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento) ;

}
