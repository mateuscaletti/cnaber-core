package br.com.caletti.cnaber.core.enums;

public enum Cnab240TipoMovimentoEnum {

    INCLUSAO(0),
    CONSULTA(1),
    SUSPENSAO(2),
    ESTORNO(3),
    REATIVACAO(4),
    ALTERACAO(5),
    LIQUIDACAO(7),
    EXCLUSAO(9);

    private Integer cnab240tipoMovimento;

    Cnab240TipoMovimentoEnum(Integer valor) { cnab240tipoMovimento = valor; }

    public Integer getValor() {
        return cnab240tipoMovimento;
    }

}
