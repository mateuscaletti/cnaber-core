package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoInscricaoEmpresaEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;

public class SegmentoJ52 extends Segmento {

    private String codigoMovimentoRemessa;
    private String identificacaoRegistroOpcional;
    private Cnab240TipoInscricaoEmpresaEnum tipoInscricaoPagador;
    private String numeroInscricaoPagador;
    private String nomePagador;
    private Cnab240TipoInscricaoEmpresaEnum tipoInscricaoBeneficiario;
    private String numeroInscricaoBeneficiario;
    private String nomeBeneficiario;
    private Cnab240TipoInscricaoEmpresaEnum tipoInscricaoBeneficiarioOriginal;
    private String numeroInscricaoBeneficiarioOriginal;
    private String nomeBeneficiarioOriginal;

    public SegmentoJ52() {
        this.setCodigoSegmento("J");
        this.setOrdemApresentacao(2);
        this.setIdentificacaoRegistroOpcional("52");
    }

    public String getCodigoMovimentoRemessa() {
        return codigoMovimentoRemessa;
    }

    public void setCodigoMovimentoRemessa(String codigoMovimentoRemessa) {
        this.codigoMovimentoRemessa = codigoMovimentoRemessa;
    }

    public String getIdentificacaoRegistroOpcional() {
        return identificacaoRegistroOpcional;
    }

    public void setIdentificacaoRegistroOpcional(String identificacaoRegistroOpcional) {
        this.identificacaoRegistroOpcional = identificacaoRegistroOpcional;
    }

    public Cnab240TipoInscricaoEmpresaEnum getTipoInscricaoPagador() {
        return tipoInscricaoPagador;
    }

    public void setTipoInscricaoPagador(Cnab240TipoInscricaoEmpresaEnum tipoInscricaoPagador) {
        this.tipoInscricaoPagador = tipoInscricaoPagador;
    }

    public String getNumeroInscricaoPagador() {
        return numeroInscricaoPagador;
    }

    public void setNumeroInscricaoPagador(String numeroInscricaoPagador) {
        this.numeroInscricaoPagador = numeroInscricaoPagador;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public Cnab240TipoInscricaoEmpresaEnum getTipoInscricaoBeneficiario() {
        return tipoInscricaoBeneficiario;
    }

    public void setTipoInscricaoBeneficiario(Cnab240TipoInscricaoEmpresaEnum tipoInscricaoBeneficiario) {
        this.tipoInscricaoBeneficiario = tipoInscricaoBeneficiario;
    }

    public String getNumeroInscricaoBeneficiario() {
        return numeroInscricaoBeneficiario;
    }

    public void setNumeroInscricaoBeneficiario(String numeroInscricaoBeneficiario) {
        this.numeroInscricaoBeneficiario = numeroInscricaoBeneficiario;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public Cnab240TipoInscricaoEmpresaEnum getTipoInscricaoBeneficiarioOriginal() {
        return tipoInscricaoBeneficiarioOriginal;
    }

    public void setTipoInscricaoBeneficiarioOriginal(Cnab240TipoInscricaoEmpresaEnum tipoInscricaoBeneficiarioOriginal) {
        this.tipoInscricaoBeneficiarioOriginal = tipoInscricaoBeneficiarioOriginal;
    }

    public String getNumeroInscricaoBeneficiarioOriginal() {
        return numeroInscricaoBeneficiarioOriginal;
    }

    public void setNumeroInscricaoBeneficiarioOriginal(String numeroInscricaoBeneficiarioOriginal) {
        this.numeroInscricaoBeneficiarioOriginal = numeroInscricaoBeneficiarioOriginal;
    }

    public String getNomeBeneficiarioOriginal() {
        return nomeBeneficiarioOriginal;
    }

    public void setNomeBeneficiarioOriginal(String nomeBeneficiarioOriginal) {
        this.nomeBeneficiarioOriginal = nomeBeneficiarioOriginal;
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {
        StringBuilder linha = new StringBuilder();

        linha.append(this.formatarCampoNumero(this.getCodigoBanco(), 3));
        linha.append(this.formatarCampoNumero(this.getNumeroLote(), 4));
        linha.append(this.formatarCampoNumero(this.getTipoRegistro().getValor().toString(), 1, Cnab240TipoRegistroEnum.DETALHE.toString()));
        linha.append(this.formatarCampoNumero(this.getNumeroSequencialRegistroNoLote(), 5));
        linha.append(this.formatarCampoAlfa(this.getCodigoSegmento(), 1));
        linha.append(this.formatarCampoAlfa("", 1, " "));
        linha.append(this.formatarCampoNumero(this.getCodigoMovimentoRemessa(), 2));
        linha.append(this.formatarCampoNumero(this.getIdentificacaoRegistroOpcional(), 2, "52"));
        linha.append(this.formatarCampoNumero(this.getTipoInscricaoPagador().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getNumeroInscricaoPagador(), 15));
        linha.append(this.formatarCampoAlfa(this.getNomePagador(), 40));
        linha.append(this.formatarCampoNumero(this.getTipoInscricaoBeneficiario().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getNumeroInscricaoBeneficiario(), 15));
        linha.append(this.formatarCampoAlfa(this.getNomeBeneficiario(), 40));
        linha.append(this.formatarCampoNumero(this.getTipoInscricaoBeneficiarioOriginal().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getNumeroInscricaoBeneficiarioOriginal(), 15));
        linha.append(this.formatarCampoAlfa(this.getNomeBeneficiarioOriginal(), 40));
        linha.append(this.formatarCampoAlfa("", 53, " "));

        this.setLinhaRegistroCnab240(linha.toString());

        return this;
    }

}
