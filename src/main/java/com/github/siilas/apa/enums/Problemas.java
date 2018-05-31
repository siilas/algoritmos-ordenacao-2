package com.github.siilas.apa.enums;

public enum Problemas {

    ASSOCIACAO_DE_TAREFAS("Problema de Associação de Tarefas"),
    MOCHILA_FRACIONARIA("Problema da Mochila Fracionária"),
    MOCHILA_BOOLEANA("Problema da Mochila Booleana"),
    SUBSEQUÊNCIA_COMUM_MAXIMA("Problema da Subsequência Comum Máxima");
    
    private final String descricao;
    
    private Problemas(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
}
