package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class AvaliacaoFisicaUpdateForm
{

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "O peso precisa ser maior que 0")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "A altura precisa ser maior que 0")
  private double altura;

}
