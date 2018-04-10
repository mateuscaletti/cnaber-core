package br.com.caletti.cnaber.core.enums;

public enum Cnab240TipoRegistroEnum {

    HEADER_ARQUIVO(0),
    HEADER_LOTE(1),
    DETALHE(3),
    TRAILER_LOTE(5),
    TRAILER_ARQUIVO(9);

    private Integer cnab240tipoRegistro;

    Cnab240TipoRegistroEnum(Integer valor) { cnab240tipoRegistro = valor; }

    public Integer getValor() {
        return cnab240tipoRegistro;
    }

}
