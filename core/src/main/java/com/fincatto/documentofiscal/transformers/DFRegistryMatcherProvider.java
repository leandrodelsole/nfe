package com.fincatto.documentofiscal.transformers;

import java.util.Map;

import org.simpleframework.xml.transform.Transform;

public interface DFRegistryMatcherProvider {
	Map<Class<?>, Transform<?>> build();
}
