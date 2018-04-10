package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;

public class TrailerArquivo extends Registro {

    private Integer quantidadeLotesArquivo;
    private Integer quantidadeRegistrosArquivo;
    private Integer quantidadeContasConciliar;

    public TrailerArquivo() {
        this.setTipoRegistro(Cnab240TipoRegistroEnum.TRAILER_ARQUIVO);
    }

    public Integer getQuantidadeLotesArquivo() {
        return quantidadeLotesArquivo;
    }

    public void setQuantidadeLotesArquivo(Integer quantidadeLotesArquivo) {
        this.quantidadeLotesArquivo = quantidadeLotesArquivo;
    }

    public Integer getQuantidadeRegistrosArquivo() {
        return quantidadeRegistrosArquivo;
    }

    public void setQuantidadeRegistrosArquivo(Integer quantidadeRegistrosArquivo) {
        this.quantidadeRegistrosArquivo = quantidadeRegistrosArquivo;
    }

    public Integer getQuantidadeContasConciliar() {
        return quantidadeContasConciliar;
    }

    public void setQuantidadeContasConciliar(Integer quantidadeContasConciliar) {
        this.quantidadeContasConciliar = quantidadeContasConciliar;
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {

        StringBuilder linha = new StringBuilder();

        linha.append(this.formatarCampoNumero(this.getCodigoBanco(), 3));
        linha.append(this.formatarCampoNumero(this.getNumeroLote(), 4, "9999"));
        linha.append(this.formatarCampoNumero(this.getTipoRegistro().getValor().toString(), 1, "9"));
        linha.append(this.formatarCampoAlfa("", 9, " "));
        linha.append(this.formatarCampoNumero(this.getQuantidadeLotesArquivo().toString(), 6));
        linha.append(this.formatarCampoNumero(this.getQuantidadeRegistrosArquivo().toString(), 6));
        linha.append(this.formatarCampoNumero(this.getQuantidadeContasConciliar().toString(), 6));
        linha.append(this.formatarCampoAlfa("", 205, " "));

        this.setLinhaRegistroCnab240(linha.toString());

        return this;
    }
}
