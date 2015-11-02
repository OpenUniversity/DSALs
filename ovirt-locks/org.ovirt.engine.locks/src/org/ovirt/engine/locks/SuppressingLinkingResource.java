package org.ovirt.engine.locks;

import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.access.reflect.ReflectionTypeFactory;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.ovirt.engine.core.common.errors.EngineMessage;
import org.ovirt.engine.core.common.locks.LockingGroup;

import com.google.inject.Inject;

public class SuppressingLinkingResource extends LazyLinkingResource {

	@Inject
	private ReflectionTypeFactory typeProviderFactory;

	public static JvmEnumerationType lockingGroups;
	public static JvmEnumerationType errors;
	
	@Override
	protected void updateInternalState(IParseResult newParseResult) {
		if (lockingGroups == null) {
			lockingGroups = (JvmEnumerationType) typeProviderFactory.createType(LockingGroup.class);
			errors = (JvmEnumerationType) typeProviderFactory.createType(EngineMessage.class);
		}
		super.updateInternalState(newParseResult);
		getContents().add(lockingGroups);
		getContents().add(errors);
	}
}

