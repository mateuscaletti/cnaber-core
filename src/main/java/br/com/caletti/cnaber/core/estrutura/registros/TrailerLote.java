package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;

public class TrailerLote extends Registro {

    public TrailerLote() {
        this.setTipoRegistro(Cnab240TipoRegistroEnum.TRAILER_LOTE);
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("TRAILER LOTE");
        return this;
    }
}
