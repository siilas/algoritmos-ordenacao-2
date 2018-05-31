package com.github.siilas.apa.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.github.siilas.apa.enums.Problemas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Informacoes {

    @NotNull
    private Problemas problema;
    @NotBlank
    private String entrada;
    private String saida;
    
}
