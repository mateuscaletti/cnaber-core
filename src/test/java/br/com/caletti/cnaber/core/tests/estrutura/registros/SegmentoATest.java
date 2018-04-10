package br.com.caletti.cnaber.core.tests.estrutura.registros;

import br.com.caletti.cnaber.core.enums.Cnab240CodigoCamaraCentralizadoraEnum;
import br.com.caletti.cnaber.core.enums.Cnab240CodigoInstrucaoMovimentoEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoMovimentoEnum;
import br.com.caletti.cnaber.core.enums.Cnab240TipoRegistroEnum;
import br.com.caletti.cnaber.core.estrutura.registros.SegmentoA;
import org.junit.Test;

import static org.junit.Assert.*;

public class SegmentoATest {

    public SegmentoA montarSegmentoA() {
        SegmentoA segmentoA = new SegmentoA();

        segmentoA.setCodigoBanco("748");
        segmentoA.setNumeroLote("1");
        segmentoA.setTipoRegistro(Cnab240TipoRegistroEnum.DETALHE);
        segmentoA.setNumeroSequencialRegistroNoLote("10");
        segmentoA.setTipoMovimento(Cnab240TipoMovimentoEnum.INCLUSAO);
        segmentoA.setCodigoInstrucaoMovimento(Cnab240CodigoInstrucaoMovimentoEnum.INCLUSAO_DETALHE_LIBERADO);
        segmentoA.setCodigoCamaraCentralizadora(Cnab240CodigoCamaraCentralizadoraEnum.TED);
        segmentoA.setCodigoBancoFavorecido("001");
        segmentoA.setAgenciaMantenedoraContaFavorecido("7867");
        //segmentoA.setDigitoVerificadorAgenciaFavorecido("X");
        segmentoA.setNumeroContaCorrenteFavorecido("98723");
        segmentoA.setDigitoVerificadorContaFavorecido("9");
        //segmentoA.setDigitoVerificadorAgenciaContaFavorecido(" ");
        segmentoA.setNomeFavorecido("FAVORECIDO DE TED DO BANCO XPTO");
        segmentoA.setNumeroDocumentoAtribuidoPelaEmpresa("NRO DOCUM NF TESTE");
        segmentoA.setDataPagamento("16022018");
        segmentoA.setTipoMoeda("BRL");
        //segmentoA.setQuantidadeMoeda("0");
        segmentoA.setValorPagamento("12398"); //TODO: refatorar para decimal
        segmentoA.setNumeroDocumentoAtribuidoPeloBanco("NRO DOCUM BANCO");
        segmentoA.setDataRealEfetivacaoPagamento("17022018");
        segmentoA.setValorRealEfetivacaoPagamento("12399");
        segmentoA.setCodigoFinalidadeDoc("98");
        segmentoA.setCodigoFinalidadeTed("78");
        segmentoA.setCodigoFinalidadeComplementar("8");
        segmentoA.setAvisoFavorecido("0");
        segmentoA.setCodigoOcorrencia("BD");

        return segmentoA;
    }

    @Test
    public void montarLinhaRegistroCnab240() {

        SegmentoA segmentoA = this.montarSegmentoA();

        String linhaEsperada = "7480001300010A0000180010786700000000987239 FAVORECIDO DE TED DO BANCO XPTNRO DOCUM NF TESTE  16022018BRL000000000000000000000000012398NRO DOCUM BANCO     17022018000000000012399                                        9878   8    0BD        ";

        String linhaObtida = segmentoA.getLinhaRegistroCnab240();

        assertEquals(linhaEsperada, linhaObtida);

        assertEquals(linhaObtida.length(), 240);

    }
}