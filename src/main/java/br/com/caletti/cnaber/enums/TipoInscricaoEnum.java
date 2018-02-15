package br.com.caletti.cnaber.enums;

public enum TipoInscricaoEnum {

    CNPJ (0),
    CPF(1);

    public int tipoInscricao;

    TipoInscricaoEnum(int valor) {
        tipoInscricao = valor;
    }

}
