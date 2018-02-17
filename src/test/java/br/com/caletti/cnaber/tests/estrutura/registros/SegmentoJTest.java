package br.com.caletti.cnaber.tests.estrutura.registros;

import br.com.caletti.cnaber.enums.Cnab240CodigoInstrucaoMovimentoEnum;
import br.com.caletti.cnaber.enums.Cnab240TipoMovimentoEnum;
import br.com.caletti.cnaber.enums.Cnab240TipoRegistroEnum;
import br.com.caletti.cnaber.estrutura.registros.SegmentoJ;
import org.junit.Test;

import static org.junit.Assert.*;

public class SegmentoJTest {

    public SegmentoJ montarSegmentoJ() {
        SegmentoJ segmentoJ = new SegmentoJ();

        segmentoJ.setCodigoBanco("748");
        segmentoJ.setNumeroLote("1");
        //segmentoJ.setTipoRegistro(Cnab240TipoRegistroEnum.DETALHE);
        segmentoJ.setNumeroSequencialRegistroNoLote("10");
        segmentoJ.setTipoMovimento(Cnab240TipoMovimentoEnum.INCLUSAO);
        segmentoJ.setCodigoInstrucaoMovimento(Cnab240CodigoInstrucaoMovimentoEnum.INCLUSAO_DETALHE_LIBERADO);
        segmentoJ.setCodigoBarra("74891736900000306171117216800301361050340100");
        segmentoJ.setNomeBeneficiario("NOME DO BENEFICIARIO DO CNABER MAIOR QUE 30");
        segmentoJ.setDataVencimento("16022018");
        segmentoJ.setValorTitulo("567");
        segmentoJ.setValorDescontoAbatimento("345");
        segmentoJ.setValorMoraMulta("734");
        segmentoJ.setDataPagamento("17022018");
        segmentoJ.setValorPagamento("789");
        segmentoJ.setQuantidadeMoeda("765");
        segmentoJ.setNumeroDocumentoAtribuidoPelaEmpresa("DOCUM EMPRESA");
        segmentoJ.setNumeroDOcumentoAtribuidoPeloBanco("DOCUM BANCO");
        segmentoJ.setCodigoMoeda("09");
        segmentoJ.setCodigoOcorrencia("BD");

        return segmentoJ;
    }

    @Test
    public void montarLinhaRegistroCnab240() {

        SegmentoJ segmentoJ = this.montarSegmentoJ();

        String linhaEsperada = "7480001300010J00074891736900000306171117216800301361050340100NOME DO BENEFICIARIO DO CNABER1602201800000000000056700000000000034500000000000073417022018000000000000789000000000000765DOCUM EMPRESA       DOCUM BANCO         09      BD        ";

        String linhaObtida = segmentoJ.getLinhaRegistroCnab240();

        assertEquals(linhaEsperada, linhaObtida);

        assertEquals(linhaObtida.length(), 240);

    }
}