package br.com.caletti.cnaber.core.estrutura;

import br.com.caletti.cnaber.core.estrutura.registros.HeaderLote;
import br.com.caletti.cnaber.core.estrutura.registros.TrailerLote;

import java.util.ArrayList;

public class EstruturaLote {

    private HeaderLote headerLote = new HeaderLote();
    private TrailerLote trailerLote = new TrailerLote();
    private ArrayList<EstruturaTransacao> estruturaTransacoes = new ArrayList<EstruturaTransacao>();

    public ArrayList<EstruturaTransacao> getEstruturaTransacoes() {
        return estruturaTransacoes;
    }

    public HeaderLote getHeaderLote() {
        return headerLote;
    }

    public void setHeaderLote(HeaderLote headerLote) {
        this.headerLote = headerLote;
    }

    public TrailerLote getTrailerLote() {
        return trailerLote;
    }

    public void setTrailerLote(TrailerLote trailerLote) {
        this.trailerLote = trailerLote;
    }

    public void adicionarEstruturaTransacao(EstruturaTransacao estruturaTransacao) {
        this.getEstruturaTransacoes().add(estruturaTransacao);
    }

}
