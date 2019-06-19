package com.fincatto.documentofiscal.nfe310.transformers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.nfe.NFTipoEmissao;
import com.fincatto.documentofiscal.nfe.transformers.NFTipoEmissaoTransformer;
import com.fincatto.documentofiscal.nfe310.classes.NFFinalidade;
import com.fincatto.documentofiscal.nfe310.classes.NFFormaPagamentoPrazo;
import com.fincatto.documentofiscal.nfe310.classes.NFModalidadeFrete;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoCombustivelTipo;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoEspecieVeiculo;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoImpostoTributacaoICMS;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemModalidadeBCICMS;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemModalidadeBCICMSST;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemProdutoArmamentoTipo;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemProdutoVeiculoCondicao;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemProdutoVeiculoRestricao;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoSituacaoTributariaCOFINS;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoSituacaoTributariaIPI;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoSituacaoTributariaPIS;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoTipoVeiculo;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoVeiculoCor;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaMotivoDesoneracaoICMS;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaSituacaoOperacionalSimplesNacional;
import com.fincatto.documentofiscal.nfe310.classes.NFOrigem;
import com.fincatto.documentofiscal.nfe310.classes.NFOrigemProcesso;
import com.fincatto.documentofiscal.nfe310.classes.NFProcessoEmissor;
import com.fincatto.documentofiscal.nfe310.classes.NFProdutoCompoeValorNota;
import com.fincatto.documentofiscal.nfe310.classes.NFRegimeTributario;
import com.fincatto.documentofiscal.nfe310.classes.NFTipo;
import com.fincatto.documentofiscal.nfe310.classes.NFTipoImpressao;
import com.fincatto.documentofiscal.nfe310.classes.cadastro.NFIndicadorContribuinteCTe;
import com.fincatto.documentofiscal.nfe310.classes.cadastro.NFIndicadorContribuinteNFe;
import com.fincatto.documentofiscal.nfe310.classes.cadastro.NFSituacaoContribuinte;
import com.fincatto.documentofiscal.nfe310.classes.lote.envio.NFLoteIndicadorProcessamento;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFFormaImportacaoIntermediacao;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFFormaPagamentoMoeda;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFIdentificadorLocalDestinoOperacao;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFIndicadorIEDestinatario;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFIndicadorPresencaComprador;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFNotaInfoItemIndicadorExigibilidadeISS;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFNotaInfoItemIndicadorIncentivoFiscal;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFNotaInfoRegimeEspecialTributacao;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFOperacaoConsumidorFinal;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFOperadoraCartao;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFTipoIntegracaoPagamento;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFViaTransporteInternacional;

public class DFRegistryMatcherProvider implements com.fincatto.documentofiscal.transformers.DFRegistryMatcherProvider {
	private static Map<Class<?>, Transform<?>> TRANSFORMERS = null;

	public Map<Class<?>, Transform<?>> build() {
		if (TRANSFORMERS != null) {
			return TRANSFORMERS;
		}

		final Map<Class<?>, Transform<?>> transformerByClass = new HashMap<>();
		transformerByClass.put(NFTipo.class, new NFTipoTransformer());
		transformerByClass.put(NFOrigem.class, new NFOrigemTransformer());
		transformerByClass.put(NFFinalidade.class, new NFFinalidadeTransformer());
		transformerByClass.put(NFTipoImpressao.class, new NFTipoImpressaoTransformer());
		transformerByClass.put(NFOrigemProcesso.class, new NFOrigemProcessoTransformer());
		transformerByClass.put(NFOperadoraCartao.class, new NFOperadoraCartaoTransformer());
		transformerByClass.put(NFProcessoEmissor.class, new NFProgramaEmissorTransformer());
		transformerByClass.put(NFModalidadeFrete.class, new NFModalidadeFreteTransformer());
		transformerByClass.put(NFRegimeTributario.class, new NFRegimeTributarioTransformer());
		transformerByClass.put(NFFormaPagamentoPrazo.class, new NFFormaPagamentoTransformer());
		transformerByClass.put(NFNotaInfoVeiculoCor.class, new NFNotaInfoVeiculoCorTransformer());
		transformerByClass.put(NFFormaPagamentoMoeda.class, new NFFormaPagamentoMoedaTransformer());
		transformerByClass.put(NFNotaInfoTipoVeiculo.class, new NFNotaInfoTipoVeiculoTransformer());
		transformerByClass.put(NFSituacaoContribuinte.class, new NFSituacaoContribuinteTransformer());
		transformerByClass.put(NFNotaInfoEspecieVeiculo.class, new NFNotaInfoEspecieVeiculoTransformer());
		transformerByClass.put(NFProdutoCompoeValorNota.class, new NFProdutoCompoeValorNotaTransformer());
		transformerByClass.put(NFTipoIntegracaoPagamento.class, new NFTipoIntegracaoPagamentoTransformer());
		transformerByClass.put(NFIndicadorIEDestinatario.class, new NFIndicadorIEDestinatarioTransformer());
		transformerByClass.put(NFOperacaoConsumidorFinal.class, new NFOperacaoConsumidorFinalTransformer());
		transformerByClass.put(NFNotaInfoCombustivelTipo.class, new NFNotaInfoCombustivelTipoTransformer());
		transformerByClass.put(NFIndicadorContribuinteCTe.class, new NFIndicadorContribuinteCTTransformer());
		transformerByClass.put(NFIndicadorContribuinteNFe.class, new NFIndicadorContribuinteNFeTransformer());
		transformerByClass.put(NFNotaMotivoDesoneracaoICMS.class, new NFNotaMotivoDesoneracaoICMSTransformer());
		transformerByClass.put(NFLoteIndicadorProcessamento.class, new NFLoteIndicadorProcessamentoTransformer());
		transformerByClass.put(NFViaTransporteInternacional.class, new NFViaTransporteInternacionalTransformer());
		transformerByClass.put(NFIndicadorPresencaComprador.class, new NFIndicadorPresencaCompradorTransformer());
		transformerByClass.put(NFFormaImportacaoIntermediacao.class, new NFFormaImportacaoIntermediacaoTransformer());
		transformerByClass.put(NFNotaInfoImpostoTributacaoICMS.class, new NFNotaInfoImpostoTributacaoICMSTransformer());
		transformerByClass.put(NFNotaInfoSituacaoTributariaIPI.class, new NFNotaInfoSituacaoTributariaIPITransformer());
		transformerByClass.put(NFNotaInfoSituacaoTributariaPIS.class, new NFNotaInfoSituacaoTributariaPISTransformer());
		transformerByClass.put(NFNotaInfoItemModalidadeBCICMSST.class, new NFnotaInfoItemModalidadeBCICMSSTTransformer());
		transformerByClass.put(NFNotaInfoRegimeEspecialTributacao.class, new NFNotaInfoRegimeEspecialTributacaoTransformer());
		transformerByClass.put(NFNotaInfoSituacaoTributariaCOFINS.class, new NFNotaInfoSituacaoTributariaCOFINSTransformer());
		transformerByClass.put(NFNotaInfoItemProdutoArmamentoTipo.class, new NFNotaInfoItemProdutoArmamentoTipoTransformer());
		transformerByClass.put(NFIdentificadorLocalDestinoOperacao.class, new NFIdentificadorLocalDestinoOperacaoTransformer());
		transformerByClass.put(NFNotaInfoItemProdutoVeiculoCondicao.class, new NFNotaInfoItemProdutoVeiculoCondicaoTransformer());
		transformerByClass.put(NFNotaInfoItemProdutoVeiculoRestricao.class, new NFNotaInfoItemProdutoVeiculoRestricaoTransformer());
		transformerByClass.put(NFNotaInfoItemIndicadorIncentivoFiscal.class, new NFNotaInfoItemIndicadorIncentivoFiscalTransformer());
		transformerByClass.put(NFNotaInfoItemIndicadorExigibilidadeISS.class, new NFNotaInfoItemIndicadorExigibilidadeISSTransformer());
		transformerByClass.put(NFNotaSituacaoOperacionalSimplesNacional.class, new NFNotaSituacaoOperacionalSimplesNacionalTransformer());
		transformerByClass.put(NFNotaInfoItemProdutoVeiculoTipoOperacao.class, new NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer());
		transformerByClass.put(NFNotaInfoItemProdutoVeiculoCondicaoChassi.class, new NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer());
		transformerByClass.put(NFNotaInfoItemModalidadeBCICMS.class, new NFNotaInfoItemModalidadeBCICMSTransformer());

		TRANSFORMERS = Collections.unmodifiableMap(transformerByClass);
		return TRANSFORMERS;
	}
}
