package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240CodigoInstrucaoMovimentoEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoMovimentoEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;

public class SegmentoO extends Segmento {

    private Cnab240TipoMovimentoEnum tipoMovimento;
    private Cnab240CodigoInstrucaoMovimentoEnum codigoInstrucaoMovimento;
    private String codigoBarra;
    private String nomeConcessionaria;
    private String dataVencimento;
    private String dataPagamento;
    private String valorPagamento;
    private String numeroDocumentoAtribuidoPelaEmpresa;
    private String numeroDocumentoAtribuidoPeloBanco;
    private String codigoOcorrencia;

    public SegmentoO() {
        this.setCodigoSegmento("O");
        this.setOrdemApresentacao(1);
    }

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

    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }

    public void setNomeConcessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
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

    public String getNumeroDocumentoAtribuidoPelaEmpresa() {
        return numeroDocumentoAtribuidoPelaEmpresa;
    }

    public void setNumeroDocumentoAtribuidoPelaEmpresa(String numeroDocumentoAtribuidoPelaEmpresa) {
        this.numeroDocumentoAtribuidoPelaEmpresa = numeroDocumentoAtribuidoPelaEmpresa;
    }

    public String getNumeroDocumentoAtribuidoPeloBanco() {
        return numeroDocumentoAtribuidoPeloBanco;
    }

    public void setNumeroDocumentoAtribuidoPeloBanco(String numeroDocumentoAtribuidoPeloBanco) {
        this.numeroDocumentoAtribuidoPeloBanco = numeroDocumentoAtribuidoPeloBanco;
    }

    public String getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(String codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
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
        linha.append(this.formatarCampoAlfa(this.getNomeConcessionaria(), 30));
        linha.append(this.formatarCampoNumero(this.getDataVencimento(), 8));
        linha.append(this.formatarCampoNumero(this.getDataPagamento(), 8));
        linha.append(this.formatarCampoNumero(this.getValorPagamento(), 15));
        linha.append(this.formatarCampoAlfa(this.getNumeroDocumentoAtribuidoPelaEmpresa(), 20));
        linha.append(this.formatarCampoAlfa(this.getNumeroDocumentoAtribuidoPeloBanco(), 20));
        linha.append(this.formatarCampoAlfa("", 68, " "));
        linha.append(this.formatarCampoAlfa(this.getCodigoOcorrencia(), 10));

        this.setLinhaRegistroCnab240(linha.toString());

        return this;

    }

}
