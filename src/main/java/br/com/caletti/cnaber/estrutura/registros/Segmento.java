package br.com.caletti.cnaber.estrutura.registros;

abstract public class Segmento extends Registro implements Comparable<Segmento> {

    private int ordemApresentacao;
    private String codigoSegmento;

    public int getOrdemApresentacao() {
        return ordemApresentacao;
    }

    public void setOrdemApresentacao(int ordemApresentacao) {
        this.ordemApresentacao = ordemApresentacao;
    }

    public String getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(String codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {
        return this;
    }

    @Override
    public int compareTo(Segmento segmento) {
        return (this.getOrdemApresentacao() < segmento.getOrdemApresentacao() ? -1 :
                (this.getOrdemApresentacao() == segmento.getOrdemApresentacao() ? 0 : 1));
    }
}
