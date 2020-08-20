package com.sample.collection.ListTest;

public class Customer implements Comparable<Customer>{
	
	
	private String customerName;
	
	private int customerId;
	
	Customer(){
		
	}
	Customer(String customerName , int customerId){
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
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	 
	
	@Override
	public int compareTo(Customer customer) {
		int newId = customer.getCustomerId();
		System.out.println("Comparing id's : "+newId +" , custId :"+customerId);
		//int newId = 100;;
		if(customerId < newId){
			return -1;
		}else if (customerId > newId){
			return 1;
		}else {
				return 0;
			}
	}

}
