package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;
import br.com.caletti.cnaber.core.enums.Cnab240CodigoInstrucaoMovimentoEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoMovimentoEnum;

public class SegmentoJ extends Segmento {

    private Cnab240TipoMovimentoEnum tipoMovimento;
    private Cnab240CodigoInstrucaoMovimentoEnum codigoInstrucaoMovimento;
    private String codigoBarra;
    private String nomeBeneficiario;
    private String dataVencimento;
    private String valorTitulo;
    private String valorDescontoAbatimento;
    private String valorMoraMulta;
    private String dataPagamento;
    private String valorPagamento;
    private String quantidadeMoeda;
    private String numeroDocumentoAtribuidoPelaEmpresa;
    private String numeroDOcumentoAtribuidoPeloBanco;
    private String codigoMoeda;
    private String codigoOcorrencia;

    public Cnab240TipoMovimentoEnum getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(Cnab240TipoMovimentoEnum tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public Cnab240CodigoInstrucaoMovimentoEnum getCodigoInstrucaoMovimento() {
        return codigoInstrucaoMovimento;
    }

    public void setCodigoInstrucaoMovimento(Cnab240CodigoInstrucaoMovimentoEnum codigoInstrucaoMovimento) {
        this.codigoInstrucaoMovimento = codigoInstrucaoMovimento;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    public String getValorDescontoAbatimento() {
        return valorDescontoAbatimento;
    }

    public void setValorDescontoAbatimento(String valorDescontoAbatimento) {
        this.valorDescontoAbatimento = valorDescontoAbatimento;
    }

    public String getValorMoraMulta() {
        return valorMoraMulta;
    }

    public void setValorMoraMulta(String valorMoraMulta) {
        this.valorMoraMulta = valorMoraMulta;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(String valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getQuantidadeMoeda() {
        return quantidadeMoeda;
    }

    public void setQuantidadeMoeda(String quantidadeMoeda) {
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public String getNumeroDocumentoAtribuidoPelaEmpresa() {
        return numeroDocumentoAtribuidoPelaEmpresa;
    }

    public void setNumeroDocumentoAtribuidoPelaEmpresa(String numeroDocumentoAtribuidoPelaEmpresa) {
        this.numeroDocumentoAtribuidoPelaEmpresa = numeroDocumentoAtribuidoPelaEmpresa;
    }

    public String getNumeroDOcumentoAtribuidoPeloBanco() {
        return numeroDOcumentoAtribuidoPeloBanco;
    }

    public void setNumeroDOcumentoAtribuidoPeloBanco(String numeroDOcumentoAtribuidoPeloBanco) {
        this.numeroDOcumentoAtribuidoPeloBanco = numeroDOcumentoAtribuidoPeloBanco;
    }

    public String getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(String codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    public String getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(String codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public SegmentoJ() {
        this.setCodigoSegmento("J");
        this.setOrdemApresentacao(1);
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {

        StringBuilder linha = new StringBuilder();

        linha.append(this.formatarCampoNumero(this.getCodigoBanco(), 3));
        linha.append(this.formatarCampoNumero(this.getNumeroLote(), 4));
        linha.append(this.formatarCampoNumero(this.getTipoRegistro().getValor().toString(), 1, Cnab240TipoRegistroEnum.DETALHE.toString()));
        linha.append(this.formatarCampoNumero(this.getNumeroSequencialRegistroNoLote(), 5));
        linha.append(this.formatarCampoAlfa(this.getCodigoSegmento(), 1));
        linha.append(this.formatarCampoNumero(this.getTipoMovimento().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getCodigoInstrucaoMovimento().getValor(), 2));
        linha.append(this.formatarCampoNumero(this.getCodigoBarra(), 44));
        linha.append(this.formatarCampoAlfa(this.getNomeBeneficiario(), 30));
        linha.append(this.formatarCampoNumero(this.getDataVencimento(), 8));
        linha.append(this.formatarCampoNumero(this.getValorTitulo(), 15));
        linha.append(this.formatarCampoNumero(this.getValorDescontoAbatimento(), 15));
        linha.append(this.formatarCampoNumero(this.getValorMoraMulta(), 15));
        linha.append(this.formatarCampoNumero(this.getDataPagamento(), 8));
        linha.append(this.formatarCampoNumero(this.getValorPagamento(), 15));
        linha.append(this.formatarCampoNumero(this.getQuantidadeMoeda(), 15));
        linha.append(this.formatarCampoAlfa(this.getNumeroDocumentoAtribuidoPelaEmpresa(), 20));
        linha.append(this.formatarCampoAlfa(this.getNumeroDOcumentoAtribuidoPeloBanco(), 20));
        linha.append(this.formatarCampoNumero(this.getCodigoMoeda(), 2));
        linha.append(this.formatarCampoAlfa("", 6, " "));
        linha.append(this.formatarCampoAlfa(this.getCodigoOcorrencia(), 10));

        this.setLinhaRegistroCnab240(linha.toString());

        return this;
    }

}
