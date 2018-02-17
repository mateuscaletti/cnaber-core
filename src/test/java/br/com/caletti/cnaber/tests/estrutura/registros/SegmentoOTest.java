package br.com.caletti.cnaber.tests.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240CodigoInstrucaoMovimentoEnum;
import br.com.caletti.cnaber.enums.Cnab240TipoMovimentoEnum;
import br.com.caletti.cnaber.estrutura.registros.SegmentoO;
import org.junit.Test;

import static org.junit.Assert.*;

public class SegmentoOTest {

    @Test
    public void montarLinhaRegistroCnab240() {

        SegmentoO segmentoO = new SegmentoO();

        segmentoO.setCodigoBanco("748");
        segmentoO.setNumeroLote("1");
        //segmentoO.setTipoRegistro(Cnab240TipoRegistroEnum.DETALHE);
        segmentoO.setNumeroSequencialRegistroNoLote("10");
        segmentoO.setTipoMovimento(Cnab240TipoMovimentoEnum.INCLUSAO);
        segmentoO.setCodigoInstrucaoMovimento(Cnab240CodigoInstrucaoMovimentoEnum.INCLUSAO_DETALHE_LIBERADO);
        segmentoO.setCodigoBarra("85820000000985601232018011205014182674708976");
        segmentoO.setNomeConcessionaria("NOME DO ORGAO PUBLICO");
        segmentoO.setDataVencimento("16022018");
        segmentoO.setDataPagamento("18022018");
        segmentoO.setValorPagamento("2345");
        segmentoO.setNumeroDocumentoAtribuidoPelaEmpresa("DOCUM EMPRESA");
        segmentoO.setNumeroDocumentoAtribuidoPeloBanco("DOCUM BANCO");
        segmentoO.setCodigoOcorrencia("78");

        String linhaEsperada = "7480001300010O00085820000000985601232018011205014182674708976NOME DO ORGAO PUBLICO         1602201818022018000000000002345DOCUM EMPRESA       DOCUM BANCO                                                                             78        ";

        String linhaObtida = segmentoO.getLinhaRegistroCnab240();

        assertEquals(linhaEsperada, linhaObtida);

        assertEquals(linhaObtida.length(), 240);

    }
}