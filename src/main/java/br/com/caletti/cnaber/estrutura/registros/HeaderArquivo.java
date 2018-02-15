package br.com.caletti.cnaber.estrutura.registros;

public class HeaderArquivo extends Registro {


    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("HEADER ARQUIVO");
        return this;
    }
}
