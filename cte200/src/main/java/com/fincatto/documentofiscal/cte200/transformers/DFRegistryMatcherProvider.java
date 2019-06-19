package com.fincatto.documentofiscal.cte200.transformers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.cte200.classes.CTFormaPagamento;
import com.fincatto.documentofiscal.cte200.classes.CTIdentificadorEmissor;
import com.fincatto.documentofiscal.cte200.classes.CTModal;
import com.fincatto.documentofiscal.cte200.classes.CTResponsavelSeguro;
import com.fincatto.documentofiscal.cte200.classes.CTRetiraMercadoria;
import com.fincatto.documentofiscal.cte200.classes.CTTipoCte;
import com.fincatto.documentofiscal.cte200.classes.CTTipoDocumentoOutro;
import com.fincatto.documentofiscal.cte200.classes.CTTipoDocumentoTransporteAnterior;
import com.fincatto.documentofiscal.cte200.classes.CTTipoEmissao;
import com.fincatto.documentofiscal.cte200.classes.CTTipoEntregaData;
import com.fincatto.documentofiscal.cte200.classes.CTTipoEntregaHorario;
import com.fincatto.documentofiscal.cte200.classes.CTTipoImpressao;
import com.fincatto.documentofiscal.cte200.classes.CTTipoServico;
import com.fincatto.documentofiscal.cte200.classes.CTTipoUnidadeCarga;
import com.fincatto.documentofiscal.cte200.classes.CTTipoUnidadeTransporte;
import com.fincatto.documentofiscal.cte200.classes.CTTomadorServico;
import com.fincatto.documentofiscal.cte200.classes.CTUnidadeMedida;

public class DFRegistryMatcherProvider implements com.fincatto.documentofiscal.transformers.DFRegistryMatcherProvider {

	private static Map<Class<?>, Transform<?>> TRANSFORMERS = null;

	public Map<Class<?>, Transform<?>> build() {
		if (TRANSFORMERS != null) {
			return TRANSFORMERS;
		}

		final Map<Class<?>, Transform<?>> transformerByClass = new HashMap<>();
		transformerByClass.put(CTModal.class, new CTModalTransformer());
		transformerByClass.put(CTTipoCte.class, new CTTipoCteTransformer());
		transformerByClass.put(CTTipoServico.class, new CTTipoServicoTransformer());
		transformerByClass.put(CTTipoEmissao.class, new CTTipoEmissaoTransformer());
		transformerByClass.put(CTUnidadeMedida.class, new CTUnidadeMedidaTransformer());
		transformerByClass.put(CTTipoImpressao.class, new CTTipoImpressaoTransformer());
		transformerByClass.put(CTFormaPagamento.class, new CTFormaPagamentoTransformer());
		transformerByClass.put(CTTomadorServico.class, new CTTomadorServicoTransformer());
		transformerByClass.put(CTTipoEntregaData.class, new CTTipoEntregaDataTransformer());
		transformerByClass.put(CTRetiraMercadoria.class, new CTRetiraMercadoriaTransformer());
		transformerByClass.put(CTTipoUnidadeCarga.class, new CTTipoUnidadeCargaTransformer());
		transformerByClass.put(CTResponsavelSeguro.class, new CTResponsavelSeguroTransformer());
		transformerByClass.put(CTTipoDocumentoOutro.class, new CTTipoDocumentoOutroTransformer());
		transformerByClass.put(CTTipoEntregaHorario.class, new CTTipoEntregaHorarioTransformer());
		transformerByClass.put(CTIdentificadorEmissor.class, new CTIdentificadorEmissorTransformer());
		transformerByClass.put(CTTipoUnidadeTransporte.class, new CTTipoUnidadeTransporteTransformer());
		transformerByClass.put(CTTipoDocumentoTransporteAnterior.class, new CTTipoDocumentoTransporteAnteriorTransformer());

		TRANSFORMERS = Collections.unmodifiableMap(transformerByClass);
		return TRANSFORMERS;
	}
}
