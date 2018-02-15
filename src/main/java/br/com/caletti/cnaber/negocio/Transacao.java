package br.com.caletti.cnaber.negocio;

import br.com.caletti.cnaber.estrutura.EstruturaTransacao;

abstract public class Transacao {

    private EstruturaTransacao estruturaTransacao;

    public EstruturaTransacao getEstruturaTransacao() {
        return estruturaTransacao;
    }

    public void setEstruturaTransacao(EstruturaTransacao estruturaTransacao) {
        this.estruturaTransacao = estruturaTransacao;
    }

    abstract public Transacao gerarEstruturaTransacaoCnab240();
}
