package br.com.caletti.cnaber.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240TipoRegistroEnum;
import org.apache.commons.lang3.StringUtils;

abstract public class Registro {

    private String codigoBanco;
    private String numeroLote;
    private Cnab240TipoRegistroEnum tipoRegistro;
    private String linhaRegistroCnab240;

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Cnab240TipoRegistroEnum getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Cnab240TipoRegistroEnum tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getLinhaRegistroCnab240() {
        this.montarLinhaRegistroCnab240();
        return linhaRegistroCnab240;
    }

    public void setLinhaRegistroCnab240(String linhaRegistroCnab240) {
        this.linhaRegistroCnab240 = linhaRegistroCnab240;
    }

    public String formatarCampoNumero(String texto, Integer tamanho) {
        if(texto.length() > tamanho)
            texto = texto.substring(0, tamanho);

        return StringUtils.leftPad(texto, tamanho, "0");
    }

    public String formatarCampoNumero(String texto, Integer tamanho, String textoDefault) {
        if(texto == null) {
            texto = textoDefault;
        }

        return this.formatarCampoNumero(texto, tamanho);
    }

    public String formatarCampoAlfa(String texto, Integer tamanho) {
        if(texto.length() > tamanho)
            texto = texto.substring(0, tamanho);

        return StringUtils.rightPad(texto, tamanho, " ");
    }


    public String formatarCampoAlfa(String texto, Integer tamanho, String textoDefault) {
        if(texto == null) {
            texto = textoDefault;
        }

        return this.formatarCampoAlfa(texto, tamanho);
    }

    abstract Registro montarLinhaRegistroCnab240();
}
