package org.ovirt.engine.permissions;

import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.access.reflect.ReflectionTypeFactory;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.ovirt.engine.core.common.VdcObjectType;
import org.ovirt.engine.core.common.businessentities.ActionGroup;

import com.google.inject.Inject;

public class SuppressingLinkingResource extends LazyLinkingResource {

	@Inject
	private ReflectionTypeFactory typeProviderFactory;

	public static JvmEnumerationType objTypes;
	public static JvmEnumerationType actionGroups;
	
	@Override
	protected void updateInternalState(IParseResult newParseResult) {
		if (objTypes == null) {
			objTypes = (JvmEnumerationType) typeProviderFactory.createType(VdcObjectType.class);
			actionGroups = (JvmEnumerationType) typeProviderFactory.createType(ActionGroup.class);
		}
		super.updateInternalState(newParseResult);
		getContents().add(objTypes);
		getContents().add(actionGroups);
	}
}

