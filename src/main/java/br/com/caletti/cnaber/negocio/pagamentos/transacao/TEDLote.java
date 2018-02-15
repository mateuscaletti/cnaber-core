package br.com.caletti.cnaber.negocio.pagamentos.transacao;

import br.com.caletti.cnaber.estrutura.EstruturaLote;
import br.com.caletti.cnaber.estrutura.registros.HeaderLote;
import br.com.caletti.cnaber.estrutura.registros.TrailerLote;
import br.com.caletti.cnaber.negocio.Lote;
import br.com.caletti.cnaber.negocio.Transacao;

public class TEDLote extends Lote {

    @Override
    public Lote gerarEstruturaLoteCnab240() {

        EstruturaLote estruturaLote = new EstruturaLote();

        HeaderLote headerLote = new HeaderLote();
        estruturaLote.setHeaderLote(headerLote);

        TrailerLote trailerLote = new TrailerLote();
        estruturaLote.setTrailerLote(trailerLote);

        for(Transacao transacao : this.getTransacoes()) {
            estruturaLote.adicionarEstruturaTransacao(transacao.getEstruturaTransacao());
        }

        this.setEstruturaLote(estruturaLote);

        return this;
    }
}
