package br.com.caletti.cnaber.tests.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240TipoInscricaoEmpresaEnum;
import br.com.caletti.cnaber.enums.Cnab240TipoRegistroEnum;
import br.com.caletti.cnaber.estrutura.registros.SegmentoJ52;
import org.junit.Test;

import static org.junit.Assert.*;

public class SegmentoJ52Test {

    public SegmentoJ52 montarSegmentoJ52() {
        SegmentoJ52 segmentoJ52 = new SegmentoJ52();

        segmentoJ52.setCodigoBanco("748");
        segmentoJ52.setNumeroLote("1");
        //segmentoJ52.getTipoRegistro(Cnab240TipoRegistroEnum.DETALHE);
        segmentoJ52.setNumeroSequencialRegistroNoLote("10");
        segmentoJ52.setCodigoMovimentoRemessa("01");
        //segmentoJ52.setIdentificacaoRegistroOpcional("52");
        segmentoJ52.setTipoInscricaoPagador(Cnab240TipoInscricaoEmpresaEnum.CPF);
        segmentoJ52.setNumeroInscricaoPagador("12345678999");
        segmentoJ52.setNomePagador("NOME DO PAGADOR");
        segmentoJ52.setTipoInscricaoBeneficiario(Cnab240TipoInscricaoEmpresaEnum.CNPJ);
        segmentoJ52.setNumeroInscricaoBeneficiario("4567890123456");
        segmentoJ52.setNomeBeneficiario("NOME DO BENEFICIARIO");
        segmentoJ52.setTipoInscricaoBeneficiarioOriginal(Cnab240TipoInscricaoEmpresaEnum.PIS);
        segmentoJ52.setNumeroInscricaoBeneficiarioOriginal("00123456677");
        segmentoJ52.setNomeBeneficiarioOriginal("NOME DO BENEFICIARIO ORIGINAL");

        return segmentoJ52;
    }

    @Test
    public void montarLinhaRegistroCnab240() {

        SegmentoJ52 segmentoJ52 = this.montarSegmentoJ52();

        String linhaEsperada = "7480001300010J 01521000012345678999NOME DO PAGADOR                         2004567890123456NOME DO BENEFICIARIO                    3000000123456677NOME DO BENEFICIARIO ORIGINAL                                                                ";

        String linhaObtida = segmentoJ52.getLinhaRegistroCnab240();

        assertEquals(linhaEsperada, linhaObtida);

        assertEquals(linhaObtida.length(), 240);

    }
}