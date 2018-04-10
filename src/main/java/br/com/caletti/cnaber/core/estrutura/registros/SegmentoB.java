package br.com.caletti.cnaber.core.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240TipoInscricaoEmpresaEnum;

public class SegmentoB extends Segmento {

    private Cnab240TipoInscricaoEmpresaEnum tipoInscricaoEmpresa;
    private String numeroInscricaoEmpresa;
    private String logradouroEndereco;
    private String numeroEndereco;
    private String complementoEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private String cepEndereco;
    private String ufEndereco;
    private String vencimento;
    private String valorDocumento;
    private String valorAbatimento;
    private String valorDesconto;
    private String valorMora;
    private String valorMulta;
    private String codigoDocumentoFavorecido;
    private String avisoFavorecido;
    private String codigoIspb;

    public SegmentoB() {
        this.setCodigoSegmento("B");
        this.setOrdemApresentacao(2);
    }

    public Cnab240TipoInscricaoEmpresaEnum getTipoInscricaoEmpresa() {
        return tipoInscricaoEmpresa;
    }

    public void setTipoInscricaoEmpresa(Cnab240TipoInscricaoEmpresaEnum tipoInscricaoEmpresa) {
        this.tipoInscricaoEmpresa = tipoInscricaoEmpresa;
    }

    public String getNumeroInscricaoEmpresa() {
        return numeroInscricaoEmpresa;
    }

    public void setNumeroInscricaoEmpresa(String numeroInscricaoEmpresa) {
        this.numeroInscricaoEmpresa = numeroInscricaoEmpresa;
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        this.ufEndereco = ufEndereco;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = valorDocumento;
    }

    public String getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(String valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public String getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getValorMora() {
        return valorMora;
    }

    public void setValorMora(String valorMora) {
        this.valorMora = valorMora;
    }

    public String getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getCodigoDocumentoFavorecido() {
        return codigoDocumentoFavorecido;
    }

    public void setCodigoDocumentoFavorecido(String codigoDocumentoFavorecido) {
        this.codigoDocumentoFavorecido = codigoDocumentoFavorecido;
    }

    public String getAvisoFavorecido() {
        return avisoFavorecido;
    }

    public void setAvisoFavorecido(String avisoFavorecido) {
        this.avisoFavorecido = avisoFavorecido;
    }

    public String getCodigoIspb() {
        return codigoIspb;
    }

    public void setCodigoIspb(String codigoIspb) {
        this.codigoIspb = codigoIspb;
    }

    @Override
    public Registro montarLinhaRegistroCnab240() {

        StringBuilder linha = new StringBuilder();

        linha.append(this.formatarCampoNumero(this.getCodigoBanco(), 3));
        linha.append(this.formatarCampoNumero(this.getNumeroLote(), 4));
        linha.append(this.formatarCampoNumero(this.getTipoRegistro().getValor().toString(), 1, "3"));
        linha.append(this.formatarCampoNumero(this.getNumeroSequencialRegistroNoLote(), 5));
        linha.append(this.formatarCampoAlfa(this.getCodigoSegmento(), 1));
        linha.append(this.formatarCampoAlfa("", 3, " "));
        linha.append(this.formatarCampoNumero(this.getTipoInscricaoEmpresa().getValor().toString(), 1));
        linha.append(this.formatarCampoNumero(this.getNumeroInscricaoEmpresa(), 14));
        linha.append(this.formatarCampoAlfa(this.getLogradouroEndereco(), 30));
        linha.append(this.formatarCampoNumero(this.getNumeroEndereco(), 5));
        linha.append(this.formatarCampoAlfa(this.getComplementoEndereco(), 15));
        linha.append(this.formatarCampoAlfa(this.getBairroEndereco(), 15));
        linha.append(this.formatarCampoAlfa(this.getCidadeEndereco(), 20));
        linha.append(this.formatarCampoNumero(this.getCepEndereco(), 8));
        linha.append(this.formatarCampoAlfa(this.getUfEndereco(), 2));
        linha.append(this.formatarCampoNumero(this.getVencimento(), 8));
        linha.append(this.formatarCampoNumero(this.getValorDocumento(), 15));
        linha.append(this.formatarCampoNumero(this.getValorAbatimento(), 15));
        linha.append(this.formatarCampoNumero(this.getValorDesconto(), 15));
        linha.append(this.formatarCampoNumero(this.getValorMora(), 15));
        linha.append(this.formatarCampoNumero(this.getValorMulta(), 15));
        linha.append(this.formatarCampoAlfa(this.getCodigoDocumentoFavorecido(), 15));
        linha.append(this.formatarCampoAlfa(this.getAvisoFavorecido(), 1));
        linha.append(this.formatarCampoAlfa("", 6, " "));
        linha.append(this.formatarCampoNumero(this.getCodigoIspb(), 8));

        this.setLinhaRegistroCnab240(linha.toString());
        return this;
    }
}
