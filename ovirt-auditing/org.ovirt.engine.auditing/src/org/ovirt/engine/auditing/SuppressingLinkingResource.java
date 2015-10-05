package org.ovirt.engine.auditing;

import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.access.reflect.ReflectionTypeFactory;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.ovirt.engine.core.common.AuditLogType;

import com.google.inject.Inject;

public class SuppressingLinkingResource extends LazyLinkingResource {

	@Inject
	private ReflectionTypeFactory typeProviderFactory;

	public static JvmEnumerationType auditLogTypes;
	
	@Override
	protected void updateInternalState(IParseResult newParseResult) {
		if (auditLogTypes == null) {
			auditLogTypes = (JvmEnumerationType) typeProviderFactory.createType(AuditLogType.class);
		}
		super.updateInternalState(newParseResult);
		getContents().add(auditLogTypes);
	}
}

