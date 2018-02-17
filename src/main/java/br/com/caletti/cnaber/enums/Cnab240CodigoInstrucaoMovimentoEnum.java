package br.com.caletti.cnaber.enums;

public enum Cnab240CodigoInstrucaoMovimentoEnum {

    INCLUSAO_DETALHE_LIBERADO("00"),
    INCLUSAO_DETALHE_BLOQUEADO("09"),
    ALTERACAO_PAGAMENTO_LIBERADO_PARA_BLOQUEADO("10"),
    ALTERACAO_PAGAMENTO_BLOQUEADO_PARA_LIBERADO("11"),
    ALTERACAO_VALOR_TITULO("17"),
    ALTERACAO_DATA_PAGAMENTO("19"),
    PAGAMENTO_DIRETO_FORNECEDOR("23"),
    MANUTENCAO_EM_CARTEIRA("25"),
    RETIRADA_DE_CARTEIRA("27"),
    ESTORNO_DEVOLUCAO_CAMARA_CENTRALIZADORA("33"),
    ALEGACAO_PAGADOR("40"),
    EXCLUSAO_DETALHE_INCLUIDO("99");

    private String cnab240codigoInstrucaoMovimento;

    Cnab240CodigoInstrucaoMovimentoEnum(String valor) { cnab240codigoInstrucaoMovimento = valor; }

    public String getValor() {
        return cnab240codigoInstrucaoMovimento;
    }

}
