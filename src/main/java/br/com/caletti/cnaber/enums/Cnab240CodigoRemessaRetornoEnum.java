package br.com.caletti.cnaber.enums;

public enum Cnab240CodigoRemessaRetornoEnum {

    REMESSA(1),
    RETORNO(2);

    private Integer cnab240codigoRemessaRetorno;

    Cnab240CodigoRemessaRetornoEnum(Integer valor) { cnab240codigoRemessaRetorno = valor; }

    public Integer getValor() {
        return cnab240codigoRemessaRetorno;
    }

}
