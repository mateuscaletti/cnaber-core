package br.com.caletti.cnaber.estrutura.registros;

public class TrailerLote extends Registro {
    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("TRAILER LOTE");
        return this;
    }
}
