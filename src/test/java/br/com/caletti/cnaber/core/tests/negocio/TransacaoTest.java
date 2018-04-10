package br.com.caletti.cnaber.core.tests.negocio;

import br.com.caletti.cnaber.core.estrutura.registros.Segmento;

import java.util.ArrayList;

abstract public class TransacaoTest {

    public Integer possuiQuantosSegmentosNaLista(ArrayList<Segmento> segmentos, String siglaSegmento) {
        Integer quantidade = 0;

        for(Segmento segmento : segmentos) {
            if(segmento.getCodigoSegmento() == siglaSegmento)
                quantidade++;
        }

        return quantidade;
    }
}