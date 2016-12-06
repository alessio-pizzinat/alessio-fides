package it.fides.alessio.dicembre.esempiocollezioni;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollections {
	
	private List addressList;
	private Set addressSet;
	private Map addressMap;
	private Properties addressProps;
	
	public List getAddressList() {
		System.out.println("List: " + addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		System.out.println("Set: " + addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		System.out.println("Map: " + addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProps() {
		System.out.println("Props: " + addressProps);
		return addressProps;
	}
	public void setAddressProps(Properties addressProps) {
		this.addressProps = addressProps;
	}

}
