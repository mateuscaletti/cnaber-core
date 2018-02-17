package br.com.caletti.cnaber.tests.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240TipoRegistroEnum;
import br.com.caletti.cnaber.estrutura.registros.TrailerArquivo;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrailerArquivoTest {

    @Test
    public void montarLinhaRegistroCnab240() {

        TrailerArquivo trailerArquivo = new TrailerArquivo();

        trailerArquivo.setCodigoBanco("748");
        //trailerArquivo.setNumeroLote("9999");
        //trailerArquivo.setTipoRegistro(Cnab240TipoRegistroEnum.TRAILER_ARQUIVO);
        trailerArquivo.setQuantidadeLotesArquivo(10);
        trailerArquivo.setQuantidadeRegistrosArquivo(20);
        trailerArquivo.setQuantidadeContasConciliar(0);

        String linhaEsperada = "74899999         000010000020000000                                                                                                                                                                                                             ";

        assertEquals(linhaEsperada, trailerArquivo.getLinhaRegistroCnab240());

    }
}