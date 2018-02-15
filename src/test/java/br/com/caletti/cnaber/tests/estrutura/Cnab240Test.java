package br.com.caletti.cnaber.tests.estrutura;

import br.com.caletti.cnaber.estrutura.Cnab240;
import br.com.caletti.cnaber.estrutura.EstruturaLote;
import br.com.caletti.cnaber.estrutura.EstruturaTransacao;
import br.com.caletti.cnaber.estrutura.registros.SegmentoA;
import br.com.caletti.cnaber.estrutura.registros.SegmentoB;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Cnab240Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void adicionarLoteTest() {
    }

    @Test
    public void montarArquivoCnab240Test() {

        Cnab240 cnab = new Cnab240();

        EstruturaLote lote1 = new EstruturaLote();

        EstruturaTransacao transacao1 = new EstruturaTransacao();
        SegmentoB segmentoB1 = new SegmentoB();
        transacao1.adicionarSegmento(segmentoB1);
        SegmentoA segmentoA1 = new SegmentoA();
        transacao1.adicionarSegmento(segmentoA1);
        lote1.adicionarEstruturaTransacao(transacao1);

        EstruturaTransacao transacao2 = new EstruturaTransacao();
        SegmentoB segmentoB2 = new SegmentoB();
        transacao2.adicionarSegmento(segmentoB2);
        SegmentoA segmentoA2 = new SegmentoA();
        transacao2.adicionarSegmento(segmentoA2);
        lote1.adicionarEstruturaTransacao(transacao2);

        cnab.adicionarLote(lote1);


        EstruturaLote lote2 = new EstruturaLote();

        EstruturaTransacao transacao3 = new EstruturaTransacao();
        SegmentoB segmentoB3 = new SegmentoB();
        transacao3.adicionarSegmento(segmentoB3);
        SegmentoA segmentoA3 = new SegmentoA();
        transacao3.adicionarSegmento(segmentoA3);
        lote2.adicionarEstruturaTransacao(transacao3);

        EstruturaTransacao transacao4 = new EstruturaTransacao();
        SegmentoB segmentoB4 = new SegmentoB();
        transacao4.adicionarSegmento(segmentoB4);
        SegmentoA segmentoA4 = new SegmentoA();
        transacao4.adicionarSegmento(segmentoA4);
        lote2.adicionarEstruturaTransacao(transacao4);

        cnab.adicionarLote(lote2);

        cnab.montarArquivoCnab240();

        System.out.println(cnab.getConteudoArquivoCnab240());
    }
}