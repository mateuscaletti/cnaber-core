package br.com.caletti.cnaber.estrutura.registros;

public class TrailerArquivo extends Registro {
    @Override
    public Registro montarLinhaRegistroCnab240() {
        this.setLinhaRegistroCnab240("TRAILER ARQUIVO");
        return this;
    }
}
