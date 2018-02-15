package br.com.caletti.cnaber.estrutura.registros;

public class HeaderLote extends Registro {
    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("HEADER LOTE");
        return this;
    }
}
