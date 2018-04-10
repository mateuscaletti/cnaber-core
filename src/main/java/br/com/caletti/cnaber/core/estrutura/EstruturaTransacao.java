package br.com.caletti.cnaber.core.estrutura;

import br.com.caletti.cnaber.core.estrutura.registros.Segmento;
import java.util.ArrayList;
import java.util.Collections;

public class EstruturaTransacao {

    private ArrayList<Segmento> segmentos = new ArrayList<Segmento>();

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void adicionarSegmento(Segmento segmento) {
        this.getSegmentos().add(segmento);
    }

    public ArrayList<Segmento> getSegmentosOrdenados() {
        ArrayList<Segmento> segmentos = this.getSegmentos();
        Collections.sort(segmentos);
        return segmentos;
    }
}
