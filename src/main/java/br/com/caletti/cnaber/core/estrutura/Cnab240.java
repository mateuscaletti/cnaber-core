package br.com.caletti.cnaber.core.estrutura;

import br.com.caletti.cnaber.core.estrutura.registros.HeaderArquivo;
import br.com.caletti.cnaber.core.estrutura.registros.Segmento;
import br.com.caletti.cnaber.core.estrutura.registros.TrailerArquivo;

import java.util.ArrayList;

public class Cnab240 {

    private ArrayList<EstruturaLote> lotes = new ArrayList<>();
    private HeaderArquivo headerArquivo = new HeaderArquivo();
    private TrailerArquivo trailerArquivo = new TrailerArquivo();
    private String conteudoArquivoCnab240;

    public String getConteudoArquivoCnab240() {
        return conteudoArquivoCnab240;
    }

    public void setConteudoArquivoCnab240(String conteudoArquivoCnab240) {
        this.conteudoArquivoCnab240 = conteudoArquivoCnab240;
    }

    public ArrayList<EstruturaLote> getLotes() {
        return lotes;
    }

    public HeaderArquivo getHeaderArquivo() {
        return headerArquivo;
    }

    public void setHeaderArquivo(HeaderArquivo headerArquivo) {
        this.headerArquivo = headerArquivo;
    }

    public TrailerArquivo getTrailerArquivo() {
        return trailerArquivo;
    }

    public void setTrailerArquivo(TrailerArquivo trailerArquivo) {
        this.trailerArquivo = trailerArquivo;
    }

    public void adicionarLote(EstruturaLote lote) {
        this.getLotes().add(lote);
    }

    public Cnab240 montarArquivoCnab240() {

        StringBuilder arquivo = new StringBuilder();

        arquivo.append(this.getHeaderArquivo().getLinhaRegistroCnab240()).append("\n\r");

        ArrayList<EstruturaLote> lotes = this.getLotes();
        for(EstruturaLote lote : lotes) {
            arquivo.append(lote.getHeaderLote().getLinhaRegistroCnab240()).append("\n\r");

            ArrayList<EstruturaTransacao> transacoes = lote.getEstruturaTransacoes();
            for(EstruturaTransacao transacao : transacoes) {

                ArrayList<Segmento> segmentos = transacao.getSegmentosOrdenados();
                for(Segmento segmento : segmentos) {
                    arquivo.append(segmento.getLinhaRegistroCnab240()).append("\n\r");
                }

            }

            arquivo.append( lote.getTrailerLote().getLinhaRegistroCnab240()).append("\n\r");
        }

        arquivo.append(this.getTrailerArquivo().getLinhaRegistroCnab240()).append("\n\r");

        this.setConteudoArquivoCnab240(arquivo.toString());

        return this;
    }
}
