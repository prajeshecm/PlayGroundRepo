package com.sample.generics;

public class UserDefinedContainer <T>{
	
	T userDefinedObj;
	
	UserDefinedContainer(){
	}
	
	UserDefinedContainer(T userDefinedObj){
		this.userDefinedObj=userDefinedObj;
	}


	public T getUserDefinedObj() {
		return userDefinedObj;
	}


	public void setUserDefinedObj(T userDefinedObj) {
		this.userDefinedObj = userDefinedObj;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userDefinedObj == null) ? 0 : userDefinedObj.hashCode());
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
		UserDefinedContainer other = (UserDefinedContainer) obj;
		if (userDefinedObj == null) {
			if (other.userDefinedObj != null)
				return false;
		} else if (!userDefinedObj.equals(other.userDefinedObj))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UserDefinedContainer [userDefinedObj=" + userDefinedObj + "]";
	}
	
	
	
	

}
