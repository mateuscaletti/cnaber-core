package br.com.caletti.cnaber.tests.negocio.pagamentos.transacao;

import br.com.caletti.cnaber.estrutura.EstruturaTransacao;
import br.com.caletti.cnaber.estrutura.registros.Segmento;
import br.com.caletti.cnaber.negocio.pagamentos.transacao.TED;
import br.com.caletti.cnaber.tests.negocio.TransacaoTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TEDTest extends TransacaoTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void gerarEstruturaTransacaoCnab240() {

        TED ted1 = new TED();

        ted1.gerarEstruturaTransacaoCnab240();

        assertTrue(ted1.getEstruturaTransacao() instanceof EstruturaTransacao);

        ArrayList<Segmento> segmentos = ted1.getEstruturaTransacao().getSegmentos();

        assertEquals(Long.valueOf(this.possuiQuantosSegmentosNaLista(segmentos, "A")), Long.valueOf(1));

        assertEquals(Long.valueOf(this.possuiQuantosSegmentosNaLista(segmentos, "B")), Long.valueOf(1));

    }
}