package com.fincatto.documentofiscal.cte300.transformes;

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
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoEmissao.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoEmissaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTFinalidade.class, new com.fincatto.documentofiscal.cte300.transformes.CTFinalidadeTransformes());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTProcessoEmissao.class, new com.fincatto.documentofiscal.cte300.transformes.CTProcessoEmissaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTModal.class, new com.fincatto.documentofiscal.cte300.transformes.CTModalTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoServico.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoServicoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTRetirada.class, new com.fincatto.documentofiscal.cte300.transformes.CTRetiradaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTIndicadorTomador.class, new com.fincatto.documentofiscal.cte300.transformes.CTIndicadorTomadorTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoImpressao.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoImpressaoTransformes());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTomadorServico.class, new com.fincatto.documentofiscal.cte300.transformes.CTTomadorServicoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoPrazoDataEntrega.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoPrazoDataEntregaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoPrazoHoraEntrega.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoPrazoHoraEntregaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTUnidadeMedida.class, new com.fincatto.documentofiscal.cte300.transformes.CTUnidadeMedidaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTModeloNF.class, new com.fincatto.documentofiscal.cte300.transformes.CTModeloNFTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoUnidadeCarga.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoUnidadeCargaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoUnidadeTransporte.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoUnidadeTransporteTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoDocumento.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoDocumentoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoDocumentoTransporteAnterior.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoDocumentoTransporteAnteriorTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTCodigoSituacaoTributariaICMS.class, new com.fincatto.documentofiscal.cte300.transformes.CTCodigoSituacaoTributariaICMSTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTInformacoesManuseio.class, new com.fincatto.documentofiscal.cte300.transformes.CTInformacoesManuseioTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTClasseTarifa.class, new com.fincatto.documentofiscal.cte300.transformes.CTClasseTarifaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTUnidadeMedidaProdPerigosos.class, new com.fincatto.documentofiscal.cte300.transformes.CTUnidadeMedidaProdPerigososTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoDirecao.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoDirecaoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoTrafego.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoTrafegoTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTTipoFerrovia.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoFerroviaTransformer());
		transformerByClass.put(com.fincatto.documentofiscal.cte300.classes.CTIndicadoNegociavel.class, new com.fincatto.documentofiscal.cte300.transformes.CTIndicadoNegociavelTransformer());

		TRANSFORMERS = Collections.unmodifiableMap(transformerByClass);
		return TRANSFORMERS;
	}

}
