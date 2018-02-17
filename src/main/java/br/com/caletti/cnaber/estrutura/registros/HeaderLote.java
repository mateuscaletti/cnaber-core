package br.com.caletti.cnaber.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240TipoRegistroEnum;

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
