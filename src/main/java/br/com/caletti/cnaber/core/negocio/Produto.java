package br.com.caletti.cnaber.core.negocio;

import br.com.caletti.cnaber.core.estrutura.Cnab240;
import br.com.caletti.cnaber.core.estrutura.registros.HeaderArquivo;
import br.com.caletti.cnaber.core.estrutura.registros.TrailerArquivo;

import java.util.ArrayList;

abstract public class Produto {

    private ArrayList<Lote> lotes = new ArrayList<Lote>();
    private Cnab240 estruturaCnab240;

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public Cnab240 getEstruturaCnab240() {
        return estruturaCnab240;
    }

    public void setEstruturaCnab240(Cnab240 estruturaCnab240) {
        this.estruturaCnab240 = estruturaCnab240;
    }

    public Produto adicionarLote(Lote lote) {
        lote.gerarEstruturaLoteCnab240();
        this.getLotes().add(lote);
        return this;
    }

    public Produto gerarEstruturaCnab240() {
        Cnab240 cnab = new Cnab240();

        HeaderArquivo headerArquivo = new HeaderArquivo();
        cnab.setHeaderArquivo(headerArquivo);

        TrailerArquivo trailerArquivo = new TrailerArquivo();
        cnab.setTrailerArquivo(trailerArquivo);

        for(Lote lote : this.getLotes()) {
            cnab.adicionarLote(lote.getEstruturaLote());
        }

        this.setEstruturaCnab240(cnab);

        return this;
    }
}
