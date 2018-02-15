package br.com.caletti.cnaber.estrutura.registros;

public class SegmentoA extends Segmento {

    public SegmentoA() {
        this.setCodigoSegmento("A");
        this.setOrdemApresentacao(1);
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("SEGMENTO A");
        return this;
    }
}
