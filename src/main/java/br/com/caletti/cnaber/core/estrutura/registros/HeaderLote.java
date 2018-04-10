package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;

public class HeaderLote extends Registro {

    public HeaderLote() {
        this.setTipoRegistro(Cnab240TipoRegistroEnum.HEADER_LOTE);
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("HEADER LOTE");
        return this;
    }
}
