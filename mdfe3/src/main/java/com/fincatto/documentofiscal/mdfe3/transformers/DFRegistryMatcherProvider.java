package com.fincatto.documentofiscal.mdfe3.transformers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.mdfe3.classes.def.MDFModalidadeTransporte;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFProcessoEmissao;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoCarroceria;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoEmissao;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoEmitente;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoProprietario;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoResponsavelSeguro;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoRodado;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoTranportador;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoUnidadeCarga;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoUnidadeTransporte;
import com.fincatto.documentofiscal.mdfe3.classes.def.MDFUnidadeMedidaPesoBrutoCarga;

public class DFRegistryMatcherProvider implements com.fincatto.documentofiscal.transformers.DFRegistryMatcherProvider {
	private static Map<Class<?>, Transform<?>> TRANSFORMERS = null;

	public Map<Class<?>, Transform<?>> build() {
		if (TRANSFORMERS != null) {
			return TRANSFORMERS;
		}

		final Map<Class<?>, Transform<?>> transformerByClass = new HashMap<>();
		transformerByClass.put(MDFModalidadeTransporte.class, new MDFModalidadeTransporteTransformer());
		transformerByClass.put(MDFProcessoEmissao.class, new MDFProcessoEmissaoTransformer());
		transformerByClass.put(MDFTipoCarroceria.class, new MDFTipoCarroceriaTransformer());
		transformerByClass.put(MDFTipoEmissao.class, new MDFTipoEmissaoTransformer());
		transformerByClass.put(MDFTipoEmitente.class, new MDFTipoEmitenteTransformer());
		transformerByClass.put(MDFTipoProprietario.class, new MDFTipoProprietarioTransformer());
		transformerByClass.put(MDFTipoRodado.class, new MDFTipoRodadoTransformer());
		transformerByClass.put(MDFTipoTranportador.class, new MDFTipoTranportadorTransformer());
		transformerByClass.put(MDFTipoUnidadeCarga.class, new MDFTipoUnidadeCargaTransformer());
		transformerByClass.put(MDFTipoUnidadeTransporte.class, new MDFTipoUnidadeTransporteTransformer());
		transformerByClass.put(MDFUnidadeMedidaPesoBrutoCarga.class, new MDFUnidadeMedidaPesoBrutoCargaTransformer());
		transformerByClass.put(MDFTipoResponsavelSeguro.class, new MDFTipoResponsavelSeguroTransformer());

		TRANSFORMERS = Collections.unmodifiableMap(transformerByClass);
		return TRANSFORMERS;
	}

}
