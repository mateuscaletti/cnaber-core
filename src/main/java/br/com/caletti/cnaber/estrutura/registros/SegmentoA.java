package br.com.caletti.cnaber.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240CodigoCamaraCentralizadoraEnum;
import br.com.caletti.cnaber.enums.Cnab240CodigoInstrucaoMovimentoEnum;
import br.com.caletti.cnaber.enums.Cnab240TipoMovimentoEnum;
import br.com.caletti.cnaber.utils.FebrabanUtils;

public class SegmentoA extends Segmento {

    private Cnab240TipoMovimentoEnum tipoMovimento;
    private Cnab240CodigoInstrucaoMovimentoEnum codigoInstrucaoMovimento;
    private Cnab240CodigoCamaraCentralizadoraEnum codigoCamaraCentralizadora;
    private String codigoBancoFavorecido;
    private String agenciaMantenedoraContaFavorecido;
    private String digitoVerificadorAgenciaFavorecido;
    private String numeroContaCorrenteFavorecido;
    private String digitoVerificadorContaFavorecido;
    private String digitoVerificadorAgenciaContaFavorecido;
    private String nomeFavorecido;
    private String numeroDocumentoAtribuidoPelaEmpresa;
    private String dataPagamento;
    private String tipoMoeda;
    private String quantidadeMoeda;
    private String valorPagamento;
    private String numeroDocumentoAtribuidoPeloBanco;
    private String dataRealEfetivacaoPagamento;
    private String valorRealEfetivacaoPagamento;
    private String codigoFinalidadeDoc;
    private String codigoFinalidadeTed;
    private String codigoFinalidadeComplementar;
    private String avisoFavorecido;
    private String codigoOcorrencia;

    public SegmentoA() {
        this.setCodigoSegmento("A");
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

    public Cnab240CodigoCamaraCentralizadoraEnum getCodigoCamaraCentralizadora() {
        return codigoCamaraCentralizadora;
    }

    public void setCodigoCamaraCentralizadora(Cnab240CodigoCamaraCentralizadoraEnum codigoCamaraCentralizadora) {
        this.codigoCamaraCentralizadora = codigoCamaraCentralizadora;
    }

    public String getCodigoBancoFavorecido() {
        return codigoBancoFavorecido;
    }

    public void setCodigoBancoFavorecido(String codigoBancoFavorecido) {
        this.codigoBancoFavorecido = codigoBancoFavorecido;
    }

    public String getAgenciaMantenedoraContaFavorecido() {
        return agenciaMantenedoraContaFavorecido;
    }

    public void setAgenciaMantenedoraContaFavorecido(String agenciaMantenedoraContaFavorecido) {
        this.agenciaMantenedoraContaFavorecido = agenciaMantenedoraContaFavorecido;
    }

    public String getDigitoVerificadorAgenciaFavorecido() {
        return digitoVerificadorAgenciaFavorecido;
    }

    public void setDigitoVerificadorAgenciaFavorecido(String digitoVerificadorAgenciaFavorecido) {
        this.digitoVerificadorAgenciaFavorecido = digitoVerificadorAgenciaFavorecido;
    }

    public String getNumeroContaCorrenteFavorecido() {
        return numeroContaCorrenteFavorecido;
    }

    public void setNumeroContaCorrenteFavorecido(String numeroContaCorrenteFavorecido) {
        this.numeroContaCorrenteFavorecido = numeroContaCorrenteFavorecido;
    }

    public String getDigitoVerificadorContaFavorecido() {
        return digitoVerificadorContaFavorecido;
    }

    public void setDigitoVerificadorContaFavorecido(String digitoVerificadorContaFavorecido) {
        this.digitoVerificadorContaFavorecido = digitoVerificadorContaFavorecido;
    }

    public String getDigitoVerificadorAgenciaContaFavorecido() {
        return digitoVerificadorAgenciaContaFavorecido;
    }

    public void setDigitoVerificadorAgenciaContaFavorecido(String digitoVerificadorAgenciaContaFavorecido) {
        this.digitoVerificadorAgenciaContaFavorecido = digitoVerificadorAgenciaContaFavorecido;
    }

    public String getNomeFavorecido() {
        return nomeFavorecido;
    }

    public void setNomeFavorecido(String nomeFavorecido) {
        this.nomeFavorecido = nomeFavorecido;
    }

    public String getNumeroDocumentoAtribuidoPelaEmpresa() {
        return numeroDocumentoAtribuidoPelaEmpresa;
    }

    public void setNumeroDocumentoAtribuidoPelaEmpresa(String numeroDocumentoAtribuidoPelaEmpresa) {
        this.numeroDocumentoAtribuidoPelaEmpresa = numeroDocumentoAtribuidoPelaEmpresa;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public String getQuantidadeMoeda() {
        return quantidadeMoeda;
    }

    public void setQuantidadeMoeda(String quantidadeMoeda) {
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public String getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(String valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getNumeroDocumentoAtribuidoPeloBanco() {
        return numeroDocumentoAtribuidoPeloBanco;
    }

    public void setNumeroDocumentoAtribuidoPeloBanco(String numeroDocumentoAtribuidoPeloBanco) {
        this.numeroDocumentoAtribuidoPeloBanco = numeroDocumentoAtribuidoPeloBanco;
    }

    public String getDataRealEfetivacaoPagamento() {
        return dataRealEfetivacaoPagamento;
    }

    public void setDataRealEfetivacaoPagamento(String dataRealEfetivacaoPagamento) {
        this.dataRealEfetivacaoPagamento = dataRealEfetivacaoPagamento;
    }

    public String getValorRealEfetivacaoPagamento() {
        return valorRealEfetivacaoPagamento;
    }

    public void setValorRealEfetivacaoPagamento(String valorRealEfetivacaoPagamento) {
        this.valorRealEfetivacaoPagamento = valorRealEfetivacaoPagamento;
    }

    public String getCodigoFinalidadeDoc() {
        return codigoFinalidadeDoc;
    }

    public void setCodigoFinalidadeDoc(String codigoFinalidadeDoc) {
        this.codigoFinalidadeDoc = codigoFinalidadeDoc;
    }

    public String getCodigoFinalidadeTed() {
        return codigoFinalidadeTed;
    }

    public void setCodigoFinalidadeTed(String codigoFinalidadeTed) {
        this.codigoFinalidadeTed = codigoFinalidadeTed;
    }

    public String getCodigoFinalidadeComplementar() {
        return codigoFinalidadeComplementar;
    }

    public void setCodigoFinalidadeComplementar(String codigoFinalidadeComplementar) {
        this.codigoFinalidadeComplementar = codigoFinalidadeComplementar;
    }

    public String getAvisoFavorecido() {
        return avisoFavorecido;
    }

    public void setAvisoFavorecido(String avisoFavorecido) {
        this.avisoFavorecido = avisoFavorecido;
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
        linha.append(this.formatarCampoNumero(this.getTipoRegistro().getValor().toString(), 1, "3"));
        linha.append(this.formatarCampoNumero(this.getNumeroSequencialRegistroNoLote(), 5));
        linha.append(this.formatarCampoAlfa(this.getCodigoSegmento(), 1));
        linha.append(this.formatarCampoNumero(this.getTipoMovimento().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getCodigoInstrucaoMovimento().getValor(), 2));
        linha.append(this.formatarCampoNumero(this.getCodigoCamaraCentralizadora().getValor(), 3));
        linha.append(this.formatarCampoNumero(this.getCodigoBancoFavorecido(), 3));
        linha.append(this.formatarCampoNumero(this.getAgenciaMantenedoraContaFavorecido(), 5));
        linha.append(this.formatarCampoNumero(this.getDigitoVerificadorAgenciaFavorecido(), 1, FebrabanUtils.getInstance().getModulo11(this.getAgenciaMantenedoraContaFavorecido()).toString()));
        linha.append(this.formatarCampoNumero(this.getNumeroContaCorrenteFavorecido(), 12));
        linha.append(this.formatarCampoAlfa(this.getDigitoVerificadorContaFavorecido(), 1));
        linha.append(this.formatarCampoAlfa(this.getDigitoVerificadorAgenciaContaFavorecido(), 1, " "));
        linha.append(this.formatarCampoAlfa(this.getNomeFavorecido(), 30));
        linha.append(this.formatarCampoAlfa(this.getNumeroDocumentoAtribuidoPelaEmpresa(), 20));
        linha.append(this.formatarCampoNumero(this.getDataPagamento(), 8));
        linha.append(this.formatarCampoAlfa(this.getTipoMoeda(), 3, "BRL"));
        linha.append(this.formatarCampoNumero(this.getQuantidadeMoeda(), 15, "0"));
        linha.append(this.formatarCampoNumero(this.getValorPagamento(), 15));
        linha.append(this.formatarCampoAlfa(this.getNumeroDocumentoAtribuidoPeloBanco(), 20));
        linha.append(this.formatarCampoNumero(this.getDataRealEfetivacaoPagamento(), 8));
        linha.append(this.formatarCampoNumero(this.getValorRealEfetivacaoPagamento(), 15));
        linha.append(this.formatarCampoAlfa("", 40, " "));
        linha.append(this.formatarCampoAlfa(this.getCodigoFinalidadeDoc(), 2));
        linha.append(this.formatarCampoAlfa(this.getCodigoFinalidadeTed(), 5));
        linha.append(this.formatarCampoAlfa(this.getCodigoFinalidadeComplementar(), 2));
        linha.append(this.formatarCampoAlfa("", 3, " "));
        linha.append(this.formatarCampoAlfa(this.getAvisoFavorecido(), 1));
        linha.append(this.formatarCampoAlfa(this.getCodigoOcorrencia(), 10));

        this.setLinhaRegistroCnab240(linha.toString());
        return this;
    }
}
