package br.com.caletti.cnaber.estrutura.registros;

public class SegmentoB extends Segmento {

    public SegmentoB() {
        this.setCodigoSegmento("B");
        this.setOrdemApresentacao(2);
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("SEGMENTO B");
        return this;
    }
}
