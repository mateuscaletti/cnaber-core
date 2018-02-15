package br.com.caletti.cnaber.negocio.conceito;

public class ContaCorrente {

    private String numeroAgencia;
    private String digitoVerificadorAgencia;
    private String numeroConta;
    private String digitoVerificadorConta;
    private String digitoVerificadorAgenciaConta;

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
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
}
