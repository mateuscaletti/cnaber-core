package br.com.caletti.cnaber.core.tests.negocio.pagamentos.transacao;

import br.com.caletti.cnaber.core.tests.negocio.TransacaoTest;
import br.com.caletti.cnaber.core.estrutura.EstruturaTransacao;
import br.com.caletti.cnaber.core.estrutura.registros.Segmento;
import br.com.caletti.cnaber.core.negocio.pagamentos.transacao.TED;
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