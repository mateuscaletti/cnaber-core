package br.com.caletti.cnaber.negocio.pagamentos.transacao;

import br.com.caletti.cnaber.estrutura.EstruturaTransacao;
import br.com.caletti.cnaber.estrutura.registros.SegmentoA;
import br.com.caletti.cnaber.estrutura.registros.SegmentoB;
import br.com.caletti.cnaber.negocio.Transacao;

public class TED extends Transacao {

    @Override
    public Transacao gerarEstruturaTransacaoCnab240() {

        EstruturaTransacao estruturaTransacao = new EstruturaTransacao();

        SegmentoA segmentoA = new SegmentoA();
        estruturaTransacao.adicionarSegmento(segmentoA);

        SegmentoB segmentoB = new SegmentoB();
        estruturaTransacao.adicionarSegmento(segmentoB);

        this.setEstruturaTransacao(estruturaTransacao);

        return this;
    }

}
