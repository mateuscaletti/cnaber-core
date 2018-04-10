package br.com.caletti.cnaber.core.negocio;

import br.com.caletti.cnaber.core.estrutura.EstruturaLote;

import java.util.ArrayList;

abstract public class Lote {

    private ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
    private EstruturaLote estruturaLote;

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

    public EstruturaLote getEstruturaLote() {
        return estruturaLote;
    }

    public void setEstruturaLote(EstruturaLote lote) {
        this.estruturaLote = lote;
    }

    abstract public Lote gerarEstruturaLoteCnab240();

    public Lote adicionarTransacao(Transacao transacao) {
        transacao.gerarEstruturaTransacaoCnab240();
        this.getTransacoes().add(transacao);
        return this;
    }
}
