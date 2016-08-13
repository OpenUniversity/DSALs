package com.mucommander.auditing;

import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.access.reflect.ReflectionTypeFactory;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;

import com.google.inject.Inject;
import com.mucommander.job.AuditLogMessage;

public class SuppressingLinkingResource extends LazyLinkingResource {

	@Inject
	private ReflectionTypeFactory typeProviderFactory;

	public static JvmEnumerationType auditLogMessages;
	
	@Override
	protected void updateInternalState(IParseResult newParseResult) {
		if (auditLogMessages == null) {
			auditLogMessages = (JvmEnumerationType) typeProviderFactory.createType(AuditLogMessage.class);
		}
		super.updateInternalState(newParseResult);
		getContents().add(auditLogMessages);
	}
}

