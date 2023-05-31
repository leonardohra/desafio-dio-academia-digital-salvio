package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class AlunoUpdateForm
{

  @NotBlank(message = "Preencha o campo corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String nome;

  @NotBlank(message = "Preencha o campo corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente")
  @Past(message = "A data informada, '{validatedValue}', está no futuro!")
  private LocalDate dataDeNascimento;
}
