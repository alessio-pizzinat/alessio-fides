package it.fides.alessio.dicembre.indirizzivari;

import java.util.List;

public class JavaCollection {
	
	List addressList;

	public List getAddressList() {
		System.out.println("Elementi della lista: " + addressList);
		return addressList;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

}
