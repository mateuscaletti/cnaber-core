package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoInscricaoEmpresaEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;
import br.com.caletti.cnaber.core.enums.Cnab240CodigoRemessaRetornoEnum;
import br.com.caletti.cnaber.core.utils.FebrabanUtils;

public class HeaderArquivo extends Registro {

    private Cnab240TipoInscricaoEmpresaEnum tipoInscricaoEmpresa;
    private String numeroInscricaoEmpresa;
    private String codigoConvenioBanco;
    private String agenciaMantenedoraConta;
    private String digitoVerificadorAgencia;
    private String numeroContaCorrente;
    private String digitoVerificadorConta;
    private String digitoVerificadorAgenciaConta;
    private String nomeEmpresa;
    private String nomeBanco;
    private Cnab240CodigoRemessaRetornoEnum codigoRemessaRetorno;
    private String dataGeracaoArquivo;
    private String horaGeracaoArquivo;
    private String numeroSequencialArquivo;
    private String numeroVersaoLayoutArquivo;
    private String densidadeGravacaoArquivo;

    public HeaderArquivo() {
        this.setTipoRegistro(Cnab240TipoRegistroEnum.HEADER_ARQUIVO);
    }

    public Cnab240TipoInscricaoEmpresaEnum getTipoInscricaoEmpresa() {
        return tipoInscricaoEmpresa;
    }

    public void setTipoInscricaoEmpresa(Cnab240TipoInscricaoEmpresaEnum tipoInscricaoEmpresa) {
        this.tipoInscricaoEmpresa = tipoInscricaoEmpresa;
    }

    public String getNumeroInscricaoEmpresa() {
        return numeroInscricaoEmpresa;
    }

    public void setNumeroInscricaoEmpresa(String numeroInscricaoEmpresa) {
        this.numeroInscricaoEmpresa = numeroInscricaoEmpresa;
    }

    public String getCodigoConvenioBanco() {
        return codigoConvenioBanco;
    }

    public void setCodigoConvenioBanco(String codigoConvenioBanco) {
        this.codigoConvenioBanco = codigoConvenioBanco;
    }

    public String getAgenciaMantenedoraConta() {
        return agenciaMantenedoraConta;
    }

    public void setAgenciaMantenedoraConta(String agenciaMantenedoraConta) {
        this.agenciaMantenedoraConta = agenciaMantenedoraConta;
    }

    public String getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }

    public void setDigitoVerificadorConta(String digitoVerificadorConta) {
        this.digitoVerificadorConta = digitoVerificadorConta;
    }

    public String getDigitoVerificadorAgenciaConta() {
        return digitoVerificadorAgenciaConta;
    }

    public void setDigitoVerificadorAgenciaConta(String digitoVerificadorAgenciaConta) {
        this.digitoVerificadorAgenciaConta = digitoVerificadorAgenciaConta;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Cnab240CodigoRemessaRetornoEnum getCodigoRemessaRetorno() {
        return codigoRemessaRetorno;
    }

    public void setCodigoRemessaRetorno(Cnab240CodigoRemessaRetornoEnum codigoRemessaRetorno) {
        this.codigoRemessaRetorno = codigoRemessaRetorno;
    }

    public String getDataGeracaoArquivo() {
        return dataGeracaoArquivo;
    }

    public void setDataGeracaoArquivo(String dataGeracaoArquivo) {
        this.dataGeracaoArquivo = dataGeracaoArquivo;
    }

    public String getHoraGeracaoArquivo() {
        return horaGeracaoArquivo;
    }

    public void setHoraGeracaoArquivo(String horaGeracaoArquivo) {
        this.horaGeracaoArquivo = horaGeracaoArquivo;
    }

    public String getNumeroSequencialArquivo() {
        return numeroSequencialArquivo;
    }

    public void setNumeroSequencialArquivo(String numeroSequencialArquivo) {
        this.numeroSequencialArquivo = numeroSequencialArquivo;
    }

    public String getNumeroVersaoLayoutArquivo() {
        return numeroVersaoLayoutArquivo;
    }

    public void setNumeroVersaoLayoutArquivo(String numeroVersaoLayoutArquivo) {
        this.numeroVersaoLayoutArquivo = numeroVersaoLayoutArquivo;
    }

    public String getDensidadeGravacaoArquivo() {
        return densidadeGravacaoArquivo;
    }

    public void setDensidadeGravacaoArquivo(String densidadeGravacaoArquivo) {
        this.densidadeGravacaoArquivo = densidadeGravacaoArquivo;
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {

        StringBuilder linha = new StringBuilder();

        linha.append(this.formatarCampoNumero(this.getCodigoBanco(), 3));
        linha.append(this.formatarCampoNumero(this.getNumeroLote(), 4, "0000"));
        linha.append(this.formatarCampoNumero(this.getTipoRegistro().getValor().toString(), 1, "0"));
        linha.append(this.formatarCampoAlfa("", 9, " "));
        linha.append(this.formatarCampoNumero(this.getTipoInscricaoEmpresa().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getNumeroInscricaoEmpresa(), 14));
        linha.append(this.formatarCampoAlfa(this.getCodigoConvenioBanco(), 20));
        linha.append(this.formatarCampoNumero(this.getAgenciaMantenedoraConta(), 5));
        linha.append(this.formatarCampoNumero(this.getDigitoVerificadorAgencia(), 1, FebrabanUtils.getInstance().getModulo11(this.getAgenciaMantenedoraConta()).toString()));
        linha.append(this.formatarCampoNumero(this.getNumeroContaCorrente(), 12));
        linha.append(this.formatarCampoNumero(this.getDigitoVerificadorConta(), 1));
        linha.append(this.formatarCampoAlfa(this.getDigitoVerificadorAgenciaConta(), 1, " "));
        linha.append(this.formatarCampoAlfa(this.getNomeEmpresa(), 30));
        linha.append(this.formatarCampoAlfa(this.getNomeBanco(), 30));
        linha.append(this.formatarCampoAlfa("", 10, " "));
        linha.append(this.formatarCampoNumero(this.getCodigoRemessaRetorno().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getDataGeracaoArquivo(), 8));
        linha.append(this.formatarCampoNumero(this.getHoraGeracaoArquivo(), 6));
        linha.append(this.formatarCampoNumero(this.getNumeroSequencialArquivo(), 6));
        linha.append(this.formatarCampoNumero(this.getNumeroVersaoLayoutArquivo(), 3, "103"));
        linha.append(this.formatarCampoNumero(this.getDensidadeGravacaoArquivo(), 5, "00000"));
        linha.append(this.formatarCampoAlfa("", 20, " "));
        linha.append(this.formatarCampoAlfa("", 20, " "));
        linha.append(this.formatarCampoAlfa("", 29, " "));

        this.setLinhaRegistroCnab240(linha.toString());

        return this;
    }
}
