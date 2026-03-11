package br.com.cotiinformatica.api_agenda.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class CategoriaResponse {

    private UUID id;

    @Size(min = 6, message = "Por favor, informe no mínimo 6 caracteres.")
    @NotEmpty(message = "Por favor, informe o nome da categoria.")
    private String nome;
}
