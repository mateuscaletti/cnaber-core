package br.com.caletti.cnaber.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240TipoRegistroEnum;

abstract public class Registro {

    private String codigoBanco;
    private Long numeroLote;
    private Enum<Cnab240TipoRegistroEnum> tipoRegistro;
    private String linhaRegistroCnab240;

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Long getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(Long numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Enum<Cnab240TipoRegistroEnum> getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Enum<Cnab240TipoRegistroEnum> tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getLinhaRegistroCnab240() {
        return linhaRegistroCnab240;
    }

    public void setLinhaRegistroCnab240(String linhaRegistroCnab240) {
        this.linhaRegistroCnab240 = linhaRegistroCnab240;
    }

    abstract Registro montarLinhaRegistroCnab240();
}
