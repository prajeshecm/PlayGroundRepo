package com.sample.generics;

public class ManagerTemp {
	
	
	private String name;
	private int salary;
	private int noofEmployee;
	private String region;
	
	
	
	ManagerTemp(String name , int salary){
		this.name = name;
		this.salary = salary;
		this.noofEmployee = 0;
		this.region = null;
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



	public int getNoofEmployee() {
		return noofEmployee;
	}



	public void setNoofEmployee(int noofEmployee) {
		this.noofEmployee = noofEmployee;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noofEmployee;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		ManagerTemp other = (ManagerTemp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noofEmployee != other.noofEmployee)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "ManagerTemp [name=" + name + ", salary=" + salary
				+ ", noofEmployee=" + noofEmployee + ", region=" + region + "]";
	}

	
	
}
