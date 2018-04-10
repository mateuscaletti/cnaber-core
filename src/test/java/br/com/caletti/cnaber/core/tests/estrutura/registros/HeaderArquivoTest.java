package br.com.caletti.cnaber.core.tests.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240CodigoRemessaRetornoEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoInscricaoEmpresaEnum;
import br.com.caletti.cnaber.core.estrutura.registros.HeaderArquivo;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeaderArquivoTest {

    public HeaderArquivo montarHeaderArquivo() {
        HeaderArquivo headerArquivo = new HeaderArquivo();

        headerArquivo.setCodigoBanco("748");
        //headerArquivo.setNumeroLote("0000");
        //headerArquivo.setTipoRegistro(Cnab240TipoRegistroEnum.HEADER_ARQUIVO);
        headerArquivo.setTipoInscricaoEmpresa(Cnab240TipoInscricaoEmpresaEnum.CPF);
        headerArquivo.setNumeroInscricaoEmpresa("12345678999");
        headerArquivo.setCodigoConvenioBanco("XYZ");
        headerArquivo.setAgenciaMantenedoraConta("0116");
        //headerArquivo.setDigitoVerificadorAgencia("0");
        headerArquivo.setNumeroContaCorrente("82431");
        headerArquivo.setDigitoVerificadorConta("3");
        //headerArquivo.setDigitoVerificadorAgenciaConta("0");
        headerArquivo.setNomeEmpresa("MATEUS MARTINS CALETTI TESTE MAIOR QUE 30 CARACTERES");
        headerArquivo.setNomeBanco("BANCO INTERNACIONAL DO CNABER");
        headerArquivo.setCodigoRemessaRetorno(Cnab240CodigoRemessaRetornoEnum.REMESSA);
        headerArquivo.setDataGeracaoArquivo("15022018");
        headerArquivo.setHoraGeracaoArquivo("183701");
        headerArquivo.setNumeroSequencialArquivo("8");
        //headerArquivo.setNumeroVersaoLayoutArquivo("");
        //headerArquivo.setDensidadeGravacaoArquivo("");

        return headerArquivo;
    }

    @Test
    public void montarLinhaRegistroCnab240Test() {

        HeaderArquivo headerArquivo = this.montarHeaderArquivo();

        String linhaEsperada = "74800000         100012345678999XYZ                 0011630000000824313 MATEUS MARTINS CALETTI TESTE MBANCO INTERNACIONAL DO CNABER           11502201818370100000810300000                                                                     ";

        String linhaObtida = headerArquivo.getLinhaRegistroCnab240();

        assertEquals(linhaEsperada, linhaObtida);

        assertEquals(linhaObtida.length(), 240);
    }
}