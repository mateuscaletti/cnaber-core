package br.com.caletti.cnaber.negocio.conceito;

import br.com.caletti.cnaber.enums.TipoInscricaoEnum;

public class Empresa {

    private Enum<TipoInscricaoEnum> tipoInscricao;
    private String numeroInscricao;
    private String codigoConvenio;
    private ContaCorrente contaCorrente;
    private String nome;
    private Endereco endereco;

    public Enum<TipoInscricaoEnum> getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(Enum<TipoInscricaoEnum> tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
