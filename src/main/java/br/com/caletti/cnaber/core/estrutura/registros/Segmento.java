package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;

abstract public class Segmento extends Registro implements Comparable<Segmento> {

    private int ordemApresentacao;
    private String codigoSegmento;
    private String numeroSequencialRegistroNoLote;

    public Segmento() {
        this.setTipoRegistro(Cnab240TipoRegistroEnum.DETALHE);
    }

    public int getOrdemApresentacao() {
        return ordemApresentacao;
    }

    public void setOrdemApresentacao(int ordemApresentacao) {
        this.ordemApresentacao = ordemApresentacao;
    }

    public String getCodigoSegmento() {
        return codigoSegmento;
    }

    void setCodigoSegmento(String codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    public String getNumeroSequencialRegistroNoLote() {
        return numeroSequencialRegistroNoLote;
    }

    public void setNumeroSequencialRegistroNoLote(String numeroSequencialRegistroNoLote) {
        this.numeroSequencialRegistroNoLote = numeroSequencialRegistroNoLote;
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
