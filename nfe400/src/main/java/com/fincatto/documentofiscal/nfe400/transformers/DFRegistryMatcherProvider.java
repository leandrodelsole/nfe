package com.fincatto.documentofiscal.nfe400.transformers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.transform.Transform;

public class DFRegistryMatcherProvider implements com.fincatto.documentofiscal.transformers.DFRegistryMatcherProvider {
	private static Map<Class<?>, Transform<?>> TRANSFORMERS = null;

	public Map<Class<?>, Transform<?>> build() {
		if (TRANSFORMERS != null) {
			return TRANSFORMERS;
		}

		final Map<Class<?>, Transform<?>> transformerByClass = new HashMap<>();
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFTipo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFTipoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFOrigem.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOrigemTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFFinalidade.class, new com.fincatto.documentofiscal.nfe400.transformers.NFFinalidadeTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFTipoImpressao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFTipoImpressaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFOrigemProcesso.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOrigemProcessoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFOperadoraCartao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOperadoraCartaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFProcessoEmissor.class, new com.fincatto.documentofiscal.nfe400.transformers.NFProgramaEmissorTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFModalidadeFrete.class, new com.fincatto.documentofiscal.nfe400.transformers.NFModalidadeFreteTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFRegimeTributario.class, new com.fincatto.documentofiscal.nfe400.transformers.NFRegimeTributarioTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoVeiculoCor.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoVeiculoCorTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFMeioPagamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFMeioPagamentoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFIndicadorFormaPagamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorFormaPagamentoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoTipoVeiculo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoTipoVeiculoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.cadastro.NFSituacaoContribuinte.class, new com.fincatto.documentofiscal.nfe400.transformers.NFSituacaoContribuinteTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoEspecieVeiculo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoEspecieVeiculoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFProdutoCompoeValorNota.class, new com.fincatto.documentofiscal.nfe400.transformers.NFProdutoCompoeValorNotaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFTipoIntegracaoPagamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFTipoIntegracaoPagamentoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFIndicadorIEDestinatario.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorIEDestinatarioTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFOperacaoConsumidorFinal.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOperacaoConsumidorFinalTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoCombustivelTipo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoCombustivelTipoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.cadastro.NFIndicadorContribuinteCTe.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorContribuinteCTTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.cadastro.NFIndicadorContribuinteNFe.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorContribuinteNFeTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaMotivoDesoneracaoICMS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaMotivoDesoneracaoICMSTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.lote.envio.NFLoteIndicadorProcessamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFLoteIndicadorProcessamentoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFViaTransporteInternacional.class, new com.fincatto.documentofiscal.nfe400.transformers.NFViaTransporteInternacionalTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFIndicadorPresencaComprador.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorPresencaCompradorTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFFormaImportacaoIntermediacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFFormaImportacaoIntermediacaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFIndicadorEscalaRelevante.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorEscalaRelevanteTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoImpostoTributacaoICMS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoImpostoTributacaoICMSTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoSituacaoTributariaIPI.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoSituacaoTributariaIPITransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoSituacaoTributariaPIS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoSituacaoTributariaPISTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemModalidadeBCICMSST.class, new com.fincatto.documentofiscal.nfe400.transformers.NFnotaInfoItemModalidadeBCICMSSTTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoRegimeEspecialTributacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoRegimeEspecialTributacaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoSituacaoTributariaCOFINS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoSituacaoTributariaCOFINSTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoArmamentoTipo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoArmamentoTipoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFIdentificadorLocalDestinoOperacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIdentificadorLocalDestinoOperacaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoCondicao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoCondicaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoRestricao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoRestricaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoItemIndicadorIncentivoFiscal.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemIndicadorIncentivoFiscalTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoItemIndicadorExigibilidadeISS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemIndicadorExigibilidadeISSTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaSituacaoOperacionalSimplesNacional.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaSituacaoOperacionalSimplesNacionalTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemModalidadeBCICMS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemModalidadeBCICMSTransformer());

		TRANSFORMERS = Collections.unmodifiableMap(transformerByClass);
		return TRANSFORMERS;
	}

}
