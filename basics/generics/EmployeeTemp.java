package com.sample.generics;


public class EmployeeTemp {
	
	
	private String name;
	private int salary;
	private int phoneno;
	private String address;
	
	
	
	EmployeeTemp(String name , int salary){
		this.name = name;
		this.salary = salary;
		this.phoneno = 0;
		this.address = null;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getPhoneno() {
		return phoneno;
	}



	public void setNoofEmployee(int phoneno) {
		this.phoneno = phoneno;
	}



	public String getAddress() {
		return address;
	}



	public void setRegion(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "EmployeeTemp [name=" + name + ", salary=" + salary
				+ ", phoneno=" + phoneno + ", address=" + address + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phoneno;
		result = prime * result + salary;
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
		EmployeeTemp other = (EmployeeTemp) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneno != other.phoneno)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
	

}
