package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>
{
    /**
     * Pega a lista de alunos matriculados que residem no bairro informado
     * @param bairro
     * @return lista de alunos matriculados que residem no bairro informado
     */
    List<Matricula> findByAlunoBairro(String bairro) ;
}
