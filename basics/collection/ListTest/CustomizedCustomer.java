package com.sample.collection.ListTest;

import java.util.Comparator;

public class CustomizedCustomer implements Comparator<CustomizedCustomer>{
	
	
	private String customerName;
	
	private int customerId;
	
	CustomizedCustomer(){
		
	}
	CustomizedCustomer(String customerName , int customerId){
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId="
				+ customerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomizedCustomer other = (CustomizedCustomer) obj;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	 
 
	
	
	public int compareTEst(CustomizedCustomer customer1, CustomizedCustomer customer2) {
		// TODO Auto-generated method stub
		String id2 = (String)customer2.getCustomerName();
		String id1 = (String)customer1.getCustomerName();
		System.out.println("New Customer Name :: "+ id2 +" , Already existing Name : "+id1 );
		return id1.compareTo(id2);
	}
	
	
	@Override
	public int compare(CustomizedCustomer customer1, CustomizedCustomer customer2) {
		// TODO Auto-generated method stub
		String id2 = customer2.getCustomerName().toString();
		String id1 = customer1.getCustomerName().toString();
		System.out.println("New Customer Name :: "+ id2 +" , Already existing Name : "+id1 );
		return id1.compareTo(id2);
	}


}
