package org.springframework.lcyj.postProcess.beanFactory;

import org.springframework.lcyj.models.Address;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Address address = new Address();
		String[] s = text.split("_");
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setCounty(s[2]);
		this.setValue(address);
	}
}
