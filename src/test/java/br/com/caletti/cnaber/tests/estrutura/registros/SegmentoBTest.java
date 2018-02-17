package br.com.caletti.cnaber.tests.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240TipoInscricaoEmpresaEnum;
import br.com.caletti.cnaber.enums.Cnab240TipoRegistroEnum;
import br.com.caletti.cnaber.estrutura.registros.SegmentoB;
import org.junit.Test;

import static org.junit.Assert.*;

public class SegmentoBTest {

    public SegmentoB montarSegmentoB() {
        SegmentoB segmentoB = new SegmentoB();

        segmentoB.setCodigoBanco("748");
        segmentoB.setNumeroLote("1");
        segmentoB.setTipoRegistro(Cnab240TipoRegistroEnum.DETALHE);
        segmentoB.setNumeroSequencialRegistroNoLote("10");
        segmentoB.setTipoInscricaoEmpresa(Cnab240TipoInscricaoEmpresaEnum.CPF);
        segmentoB.setNumeroInscricaoEmpresa("12345678999");
        segmentoB.setLogradouroEndereco("RUA DO TESTE CNABER");
        segmentoB.setNumeroEndereco("890");
        segmentoB.setComplementoEndereco("CASA");
        segmentoB.setBairroEndereco("VILA CNABER");
        segmentoB.setCidadeEndereco("CIDADE DO CNABER");
        segmentoB.setCepEndereco("94930000");
        segmentoB.setUfEndereco("RS");
        segmentoB.setVencimento("16022018");
        segmentoB.setValorDocumento("89076");
        segmentoB.setValorAbatimento("890");
        segmentoB.setValorDesconto("567");
        segmentoB.setValorMora("345");
        segmentoB.setValorMulta("123");
        segmentoB.setCodigoDocumentoFavorecido("TESTE DOC FAV");
        segmentoB.setAvisoFavorecido("0");
        segmentoB.setCodigoIspb("1");

        return segmentoB;
    }

    @Test
    public void montarLinhaRegistroCnab240() {

        SegmentoB segmentoB = this.montarSegmentoB();

        String linhaEsperada = "7480001300010B   100012345678999RUA DO TESTE CNABER           00890CASA           VILA CNABER    CIDADE DO CNABER    94930000RS16022018000000000089076000000000000890000000000000567000000000000345000000000000123TESTE DOC FAV  0      00000001";

        String linhaObtida = segmentoB.getLinhaRegistroCnab240();

        assertEquals(linhaEsperada, linhaObtida);

        assertEquals(linhaObtida.length(), 240);

    }
}