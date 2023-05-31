package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm
{
  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "O ID do aluno precisa ser maior que 0")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "O peso precisa ser maior que 0")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "A altura precisa ser maior que 0")
  private double altura;
}
