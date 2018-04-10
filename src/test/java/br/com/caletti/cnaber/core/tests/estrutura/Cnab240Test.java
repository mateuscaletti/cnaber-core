package br.com.caletti.cnaber.core.tests.estrutura;

import br.com.caletti.cnaber.core.estrutura.Cnab240;
import br.com.caletti.cnaber.core.estrutura.EstruturaLote;
import br.com.caletti.cnaber.core.estrutura.EstruturaTransacao;
import br.com.caletti.cnaber.core.estrutura.registros.SegmentoB;
import br.com.caletti.cnaber.core.tests.estrutura.registros.HeaderArquivoTest;
import br.com.caletti.cnaber.core.tests.estrutura.registros.SegmentoATest;
import br.com.caletti.cnaber.core.tests.estrutura.registros.SegmentoBTest;
import br.com.caletti.cnaber.core.tests.estrutura.registros.TrailerArquivoTest;
import br.com.caletti.cnaber.core.estrutura.registros.SegmentoA;
import org.junit.Test;

public class Cnab240Test {

    @Test
    public void adicionarLoteTest() {
    }

    @Test
    public void montarArquivoCnab240SegmentoABTest() {

        SegmentoATest segmentoATest = new SegmentoATest();
        SegmentoBTest segmentoBTest = new SegmentoBTest();
        HeaderArquivoTest headerArquivoTest = new HeaderArquivoTest();
        TrailerArquivoTest trailerArquivoTest = new TrailerArquivoTest();

        Cnab240 cnab = new Cnab240();

        cnab.setHeaderArquivo(headerArquivoTest.montarHeaderArquivo());
        String headerArquivoEsperado = "74800000         100012345678999XYZ                 0011630000000824313 MATEUS MARTINS CALETTI TESTE MBANCO INTERNACIONAL DO CNABER           11502201818370100000810300000                                                                     ";

        cnab.setTrailerArquivo(trailerArquivoTest.montarTrailerArquivo());
        String trailerArquivoEsperado = "74899999         000010000020000000                                                                                                                                                                                                             ";

        EstruturaLote lote1 = new EstruturaLote();

        EstruturaTransacao transacao1 = new EstruturaTransacao();

        SegmentoB segmentoB1 = segmentoBTest.montarSegmentoB();
        segmentoB1.setValorDocumento("1");
        transacao1.adicionarSegmento(segmentoB1);
        String segmentoB1Esperado = "7480001300010B   100012345678999RUA DO TESTE CNABER           00890CASA           VILA CNABER    CIDADE DO CNABER    94930000RS16022018000000000000001000000000000890000000000000567000000000000345000000000000123TESTE DOC FAV  0      00000001";

        SegmentoA segmentoA1 = segmentoATest.montarSegmentoA();
        segmentoA1.setNomeFavorecido("LOTE 1 SEGMENTO A1");
        transacao1.adicionarSegmento(segmentoA1);
        String segmentoA1Esperado = "7480001300010A0000180010786700000000987239 LOTE 1 SEGMENTO A1            NRO DOCUM NF TESTE  16022018BRL000000000000000000000000012398NRO DOCUM BANCO     17022018000000000012399                                        9878   8    0BD        ";

        lote1.adicionarEstruturaTransacao(transacao1);

        EstruturaTransacao transacao2 = new EstruturaTransacao();

        SegmentoB segmentoB2 = segmentoBTest.montarSegmentoB();
        segmentoB2.setValorDocumento("2");
        transacao2.adicionarSegmento(segmentoB2);
        String segmentoB2Esperado = "7480001300010B   100012345678999RUA DO TESTE CNABER           00890CASA           VILA CNABER    CIDADE DO CNABER    94930000RS16022018000000000000002000000000000890000000000000567000000000000345000000000000123TESTE DOC FAV  0      00000001";

        SegmentoA segmentoA2 = segmentoATest.montarSegmentoA();
        segmentoA2.setNomeFavorecido("LOTE 1 SEGMENTO A2");
        transacao2.adicionarSegmento(segmentoA2);
        String segmentoA2Esperado = "7480001300010A0000180010786700000000987239 LOTE 1 SEGMENTO A2            NRO DOCUM NF TESTE  16022018BRL000000000000000000000000012398NRO DOCUM BANCO     17022018000000000012399                                        9878   8    0BD        ";

        lote1.adicionarEstruturaTransacao(transacao2);

        cnab.adicionarLote(lote1);

        EstruturaLote lote2 = new EstruturaLote();

        EstruturaTransacao transacao3 = new EstruturaTransacao();

        SegmentoB segmentoB3 = segmentoBTest.montarSegmentoB();
        segmentoB1.setValorDocumento("3");
        transacao3.adicionarSegmento(segmentoB3);
        String segmentoB3Esperado = "7480001300010B   100012345678999RUA DO TESTE CNABER           00890CASA           VILA CNABER    CIDADE DO CNABER    94930000RS16022018000000000000003000000000000890000000000000567000000000000345000000000000123TESTE DOC FAV  0      00000001";

        SegmentoA segmentoA3 = segmentoATest.montarSegmentoA();
        segmentoA1.setNomeFavorecido("LOTE 2 SEGMENTO A3");
        transacao3.adicionarSegmento(segmentoA3);
        String segmentoA3Esperado = "7480001300010A0000180010786700000000987239 LOTE 1 SEGMENTO A3            NRO DOCUM NF TESTE  16022018BRL000000000000000000000000012398NRO DOCUM BANCO     17022018000000000012399                                        9878   8    0BD        ";

        lote2.adicionarEstruturaTransacao(transacao3);

        EstruturaTransacao transacao4 = new EstruturaTransacao();

        SegmentoB segmentoB4 = segmentoBTest.montarSegmentoB();
        segmentoB4.setValorDocumento("4");
        transacao4.adicionarSegmento(segmentoB4);
        String segmentoB4Esperado = "7480001300010B   100012345678999RUA DO TESTE CNABER           00890CASA           VILA CNABER    CIDADE DO CNABER    94930000RS16022018000000000000004000000000000890000000000000567000000000000345000000000000123TESTE DOC FAV  0      00000001";

        SegmentoA segmentoA4 = segmentoATest.montarSegmentoA();
        segmentoA4.setNomeFavorecido("LOTE 2 SEGMENTO A4");
        transacao4.adicionarSegmento(segmentoA4);
        String segmentoA4Esperado = "7480001300010A0000180010786700000000987239 LOTE 1 SEGMENTO A4            NRO DOCUM NF TESTE  16022018BRL000000000000000000000000012398NRO DOCUM BANCO     17022018000000000012399                                        9878   8    0BD        ";

        lote2.adicionarEstruturaTransacao(transacao4);

        cnab.adicionarLote(lote2);

        cnab.montarArquivoCnab240();

        String[] lines = cnab.getConteudoArquivoCnab240().split("\n\r");

        /*assertEquals(headerArquivoEsperado, lines[0]);
        assertEquals("", lines[1]);
        assertEquals(segmentoA1Esperado, lines[2]);
        assertEquals(segmentoB1Esperado, lines[3]);
        assertEquals(segmentoA2Esperado, lines[4]);
        assertEquals(segmentoB2Esperado, lines[5]);
        assertEquals("", lines[6]);
        assertEquals("", lines[7]);
        assertEquals(segmentoA3Esperado, lines[8]);
        assertEquals(segmentoB3Esperado, lines[9]);
        assertEquals(segmentoA4Esperado, lines[10]);
        assertEquals(segmentoB4Esperado, lines[11]);
        assertEquals("", lines[12]);
        assertEquals(trailerArquivoEsperado, lines[13]);
        */
    }
}