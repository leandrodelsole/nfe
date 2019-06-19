package com.fincatto.documentofiscal.transformers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.transform.RegistryMatcher;
import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFModelo;
import com.fincatto.documentofiscal.DFPais;
import com.fincatto.documentofiscal.DFUnidadeFederativa;

public class DFRegistryMatcher extends RegistryMatcher {

	private Map<Class<?>, Transform<?>> carregaRegistryMatcherDeModulo(String providerClass) {
		try {
			final Class<?> registryMatcherProvider = Class.forName(providerClass);
			final Object object = registryMatcherProvider.newInstance();
			final DFRegistryMatcherProvider provider = (DFRegistryMatcherProvider) object;
			return provider.build();
		} catch (ClassNotFoundException e) {
			return Collections.emptyMap();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
    
    public DFRegistryMatcher() {
        super.bind(DFModelo.class, new DFModeloTransformer());
        super.bind(DFAmbiente.class, new DFAmbienteTransformer());
        super.bind(LocalDate.class, new DFLocalDateTransformer());
        super.bind(LocalTime.class, new DFLocalTimeTransformer());
        super.bind(ZonedDateTime.class, new DFDateTimeTransformer());
        super.bind(LocalDateTime.class, new DFLocalDateTimeTransformer());
        super.bind(ZonedDateTime.class, new DFZonedDateTimeTransformer());
        super.bind(DFUnidadeFederativa.class, new DFUnidadeFederativaTransformer());
        super.bind(DFPais.class, new DFPaisTransformer());

		final Map<Class<?>, Transform<?>> transformerByClass = new HashMap<>();
		transformerByClass.putAll(carregaRegistryMatcherDeModulo(
				"com.fincatto.documentofiscal.cte200.transformers.DFRegistryMatcherProvider"));

		transformerByClass.putAll(carregaRegistryMatcherDeModulo(
				"com.fincatto.documentofiscal.cte300.transformes.DFRegistryMatcherProvider"));

		transformerByClass.putAll(carregaRegistryMatcherDeModulo(
				"com.fincatto.documentofiscal.mdfe3.transformers.DFRegistryMatcherProvider"));

		transformerByClass.putAll(carregaRegistryMatcherDeModulo(
				"com.fincatto.documentofiscal.nfe.transformers.DFRegistryMatcherProvider"));

		transformerByClass.putAll(carregaRegistryMatcherDeModulo(
				"com.fincatto.documentofiscal.nfe200.transformers.DFRegistryMatcherProvider"));

		transformerByClass.putAll(carregaRegistryMatcherDeModulo(
				"com.fincatto.documentofiscal.nfe310.transformers.DFRegistryMatcherProvider"));

		transformerByClass.putAll(carregaRegistryMatcherDeModulo(
				"com.fincatto.documentofiscal.nfe400.transformers.DFRegistryMatcherProvider"));

		transformerByClass.forEach(super::bind);
    }
}