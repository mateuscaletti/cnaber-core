package br.com.caletti.cnaber.enums;

public enum TipoInscricaoEnum {

    CNPJ (0),
    CPF(1);

    public Integer tipoInscricao;

    TipoInscricaoEnum(Integer valor) {
        tipoInscricao = valor;
    }

    public Integer getValor() {
        return tipoInscricao;
    }

}
