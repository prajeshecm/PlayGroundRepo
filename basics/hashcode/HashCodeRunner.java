package com.sample.basics.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeRunner {
	
	
	public static void main(String[] args) {
		Student s1 = new Student("S1234");
		Student s2 = new Student("S1234");
		
		/*Student s3 = s2;
		System.out.println(" is same student ? "+s1.equals(s2));// equals will look for the object reference only ,
		//here both s1 and s2 are different reference (having separate new instance)so this will return as false not true.
		System.out.println(" is same student ? "+s3.equals(s2));// here s3 doesnt have the separate new reference (i.e) s3 is 
		//created from s2 only . so this will be TRUE.
		
		System.out.println("----------------------------------------------------------------------");
		//Both the Key are duplicate , so Map will not allow duplicate so the map size here is just 1.
		Map<String,String> studentReportCrdString = new HashMap<String,String>();
		studentReportCrdString.put("s1234", "TEst");
		studentReportCrdString.put("s1234", "TEst");
		System.out.println("no of records in studentReportCrdString map : "+studentReportCrdString.size());
		Note : all the wrapper class (Integer/String/Double) already has the hashCode and equals () by default.
		 	 : if both object hashCode returns the same int and then the equals method will be called if the equals also same then that object will treat as duplicate and will not insert into the collection/Map*/
	
		System.out.println("----------------------------------------------------------------------");
		//Here even the student object exactly same ("s1234") but the Map will check for the object.equals(object) (as like above) and its returns as false 
		//so Map size will return as 2 here instead of 1. 
		//equals & hashCode will help to overcome this issue.
		Map<Student,ReportCard> studentReportCrd = new HashMap<Student,ReportCard>();
		studentReportCrd.put(s1, new ReportCard());
		studentReportCrd.put(s2, new ReportCard());
		System.out.println("no of records in map : "+studentReportCrd.size());
		//Note : to see how the hashCode and equals helps collection to see the duplicate , comment the equals & hashcode and run the same we will see hashMap will consider the duplicate object as separate object because of the object references.
	}
}
