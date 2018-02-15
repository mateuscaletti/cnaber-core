package br.com.caletti.cnaber.tests.negocio;

import br.com.caletti.cnaber.estrutura.registros.Segmento;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.*;

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