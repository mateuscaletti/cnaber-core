package br.com.caletti.cnaber.enums;

public enum Cnab240TipoInscricaoEmpresaEnum {

    ISENTO(0),
    CPF(1),
    CNPJ(2),
    PIS(3),
    OUTROS(9);

    private Integer cnab240TipoInscricaoEmpresa;

    Cnab240TipoInscricaoEmpresaEnum(Integer valor) { cnab240TipoInscricaoEmpresa = valor; }

    public Integer getValor() {
        return cnab240TipoInscricaoEmpresa;
    }

}
