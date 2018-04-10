package br.com.caletti.cnaber.core.negocio;

import br.com.caletti.cnaber.core.estrutura.EstruturaTransacao;

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
