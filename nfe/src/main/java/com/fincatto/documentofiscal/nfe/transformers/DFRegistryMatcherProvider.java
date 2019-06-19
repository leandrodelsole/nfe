package com.fincatto.documentofiscal.nfe.transformers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.nfe.NFTipoEmissao;

public class DFRegistryMatcherProvider implements com.fincatto.documentofiscal.transformers.DFRegistryMatcherProvider {
	private static Map<Class<?>, Transform<?>> TRANSFORMERS = null;

	public Map<Class<?>, Transform<?>> build() {
		if (TRANSFORMERS != null) {
			return TRANSFORMERS;
		}

		final Map<Class<?>, Transform<?>> transformerByClass = new HashMap<>();
		transformerByClass.put(NFTipoEmissao.class, new NFTipoEmissaoTransformer());

		TRANSFORMERS = Collections.unmodifiableMap(transformerByClass);
		return TRANSFORMERS;
	}

}
