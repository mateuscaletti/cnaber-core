package br.com.caletti.cnaber.core.tests.negocio.pagamentos.transacao;

import br.com.caletti.cnaber.core.estrutura.EstruturaLote;
import br.com.caletti.cnaber.core.estrutura.registros.HeaderLote;
import br.com.caletti.cnaber.core.estrutura.registros.TrailerLote;
import br.com.caletti.cnaber.core.negocio.Transacao;
import br.com.caletti.cnaber.core.negocio.pagamentos.transacao.TED;
import br.com.caletti.cnaber.core.negocio.pagamentos.transacao.TEDLote;
import br.com.caletti.cnaber.core.tests.negocio.LoteTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TEDLoteTest extends LoteTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void gerarEstruturaLoteCnab240Test() {

        TEDLote tedLote = new TEDLote();

        tedLote.gerarEstruturaLoteCnab240();

        assertTrue(tedLote.getEstruturaLote() instanceof EstruturaLote);

        assertTrue(tedLote.getEstruturaLote().getHeaderLote() instanceof HeaderLote);

        assertTrue(tedLote.getEstruturaLote().getTrailerLote() instanceof TrailerLote);

    }

    @Test
    public void adicionarTransacaoTest() {
        Integer expectedLoteSize = 0;

        TEDLote tedLote = new TEDLote();

        TED ted1 = new TED();
        tedLote.adicionarTransacao(ted1);
        expectedLoteSize++;

        TED ted2 = new TED();
        tedLote.adicionarTransacao(ted2);
        expectedLoteSize++;

        ArrayList<Transacao> tedLoteTransacoes = tedLote.getTransacoes();

        assertEquals(Long.valueOf(expectedLoteSize), Long.valueOf(tedLoteTransacoes.size()));
    }
}