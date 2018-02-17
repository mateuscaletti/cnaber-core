package br.com.caletti.cnaber.enums;

public enum Cnab240CodigoCamaraCentralizadoraEnum {

    TED("018"),
    DOC("700"),
    TED_COM_ISPB("988");

    private String cnab240codigoCamaraCentralizadora;

    Cnab240CodigoCamaraCentralizadoraEnum(String valor) { cnab240codigoCamaraCentralizadora = valor; }

    public String getValor() {
        return cnab240codigoCamaraCentralizadora;
    }

}
