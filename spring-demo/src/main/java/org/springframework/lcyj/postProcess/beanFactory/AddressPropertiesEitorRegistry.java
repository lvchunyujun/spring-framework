package org.springframework.lcyj.postProcess.beanFactory;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.lcyj.models.Address;

public class AddressPropertiesEitorRegistry implements PropertyEditorRegistrar {


	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class,new AddressPropertyEditor());
	}
}
