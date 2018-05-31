package com.github.siilas.apa.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.siilas.apa.enums.Problemas;
import com.github.siilas.apa.exception.ServiceException;
import com.github.siilas.apa.service.AssociacaoDeTarefasService;
import com.github.siilas.apa.service.GenericService;
import com.github.siilas.apa.service.MochilaBooleanaService;
import com.github.siilas.apa.service.MochilaFracionariaService;
import com.github.siilas.apa.service.SubsequenciaComumMaximaService;

@Component
public class ProblemasStrategy {

    @Autowired
    private MochilaBooleanaService mochilaBooleanaService;

    @Autowired
    private MochilaFracionariaService mochilaFracionariaService;

    @Autowired
    private AssociacaoDeTarefasService associacaoDeTarefasService;
    
    @Autowired
    private SubsequenciaComumMaximaService subsequenciaComumMaximaService;

    public GenericService getStrategy(Problemas problema) {
        switch (problema) {
            case ASSOCIACAO_DE_TAREFAS:
                return associacaoDeTarefasService;
            case MOCHILA_BOOLEANA:
                return mochilaBooleanaService;
            case MOCHILA_FRACIONARIA:
                return mochilaFracionariaService;
            case SUBSEQUÊNCIA_COMUM_MAXIMA:
                return subsequenciaComumMaximaService;
        }
        throw new ServiceException("Implementação do problema inválida");
    }

}
