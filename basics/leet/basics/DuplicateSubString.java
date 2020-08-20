package com.sample.leet.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateSubString {
 
	public static void main (String args[]){
		DuplicateSubString duplicateSubString = new DuplicateSubString();
	     String parentString = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"; 
	     				        
	     //List<String>  splittedString = duplicateSubString.findDuplicatesString(parentString);
	    // List<String>   splittedString = duplicateSubString.findRepeatedDnaSequences(parentString);
	     //System.out.println("splittedStringVar :"+splittedString.toString());
	     
	     List<String> duplcateSet = duplicateSubString.findRepeatedDnaSeqBySetApproach(parentString);
	     System.out.println("duplcateSet :"+duplcateSet.toString());
	     
	     
	     //List<String>  splittedStringVar = duplicateSubString.findRepeatedDnaSequences2(parentString);
	     //System.out.println("splittedStringVar :"+splittedStringVar.toString());
	     
	    
	    /* for(int i=0;i<splittedString.length;i++){
	    	 int hasCodeVal = splittedString.hashCode();
	    	 System.out.println("splittedString" +splittedString.toString() +" , hasCodeVal :"+hasCodeVal);
	     } */
		
	}
	
	private List<String> findRepeatedDnaSeqBySetApproach(String parentString) {
		System.out.println("parentString");
		Set<String> duplicateStringSet = new HashSet<String>();
		Set<String> tempStringSet = new HashSet<String>();
		String tempStringVal = new String();
		
		for(int i=0;i<parentString.length();i++){
			int k=i+10;
			if(k <= parentString.length()){
				tempStringVal = parentString.substring(i, i+10);
				System.out.println("runtime String :"+tempStringVal);
				if(tempStringSet.contains(tempStringVal)){
					duplicateStringSet.add(tempStringVal);
					System.out.println("duplicateStringSet added :"+duplicateStringSet);
				}else{
					tempStringSet.add(tempStringVal);
					System.out.println("tempStringSet added :"+tempStringSet);
				}
			}
			}
			
		List<String> finalStringVal = new ArrayList<String>(duplicateStringSet);
		return finalStringVal;
	}

	public List<String> findRepeatedDnaSequences2(String s) { 
        List<String> resultList = new ArrayList<String>();
		Set<Integer> words = new HashSet<Integer>();
		Set<Integer> repeatedWords = new HashSet<Integer>();

		int[] map = new int[26];
		map['A' - 'A'] = 0;
		map['C' - 'A'] = 1;
		map['G' - 'A'] = 2;
		map['T' - 'A'] = 3;
		int mask = 0;
		for(int i = 0; i < s.length(); i++) {
			mask = (mask << 2) | map[s.charAt(i) - 'A'];
			if(i >= 9) {
				mask = mask & ((1 << 20) - 1); // to consider only last 20 bits // ((1<<20)-1) creates a mask of 20 1s
				if(!words.add(mask) && repeatedWords.add(mask)) {
					resultList.add(s.substring(i - 9, i + 1));  // if repeated addd to resultList
				}
			}
		}
		System.out.println("resultList from the site:"+resultList);
		return resultList;
   }

	public List<String> findRepeatedDnaSequences(String parentString) {
		System.out.println("parentString :"+parentString);
	String[] splittedString = new String[100];
	String tempString = new String() ;
	String whileString = new String() ;
	
	int k=0;
	int M=0;
	for(int i=0;i<parentString.length();i++){
		//Get the SubStings and hashCode out of it.
		System.out.println("----------------------------------------------");
		int j=i;
		int l=j+10;
		whileString=parentString;
		Boolean isFirst = Boolean.TRUE;
		while(whileString.length()>10){
			
			System.out.println("***********************");
			System.out.println("CurrentString : "+ whileString);
			if(isFirst){
				System.out.println("index for j and l "+j +" , L:"+l);
				if(l <= whileString.length()){
					splittedString[M]=whileString.substring(j, l);
					tempString=whileString.substring(l);
					isFirst = Boolean.FALSE;
				}
				}else{
				splittedString[M]=whileString.substring(1, 10);
				tempString=whileString.substring(10);
			}
			whileString=tempString;
			k++;
			M++;
		}
		j=j+10;
	}
	List<String> stringArray = Arrays.asList(splittedString);
	return stringArray;
	}

	private List<String>  findDuplicatesString(String parentString) {
		System.out.println("parentString :"+parentString);
		String[] parentSubString = new String[100];
		List<String> splittedString = new ArrayList<String>();
		String tempString = new String() ;
		String whileString = new String() ;
		
		int k=0;
		int M=0;
		for(int i=0;i<parentString.length();i++){
			//Get the SubStings and hashCode out of it.
			System.out.println("----------------------------------------------");
			int j=i;
			int l=j+10;
			whileString=parentString;
			Boolean isFirst = Boolean.TRUE;
			while(whileString.length()>10){
				
				System.out.println("***********************");
				System.out.println("CurrentString : "+ whileString);
				if(isFirst){
					System.out.println("index for j and l "+j +" , L:"+l);
					if(l <= whileString.length()){
						//splittedString[M]=whileString.substring(j, l);
						splittedString.add(whileString.substring(j, l));
						tempString=whileString.substring(l);
						//parentSubString = parentString.split("", 9);
						//System.out.println("splittedString[M] :"+splittedString[M] +" ,tempString "+tempString);
						isFirst = Boolean.FALSE;
						
					}
					}else{
						splittedString.add(whileString.substring(1, 10));
					tempString=whileString.substring(10);
					//parentSubString = parentString.split("", 9);
					//System.out.println("splittedString[M] :"+splittedString[M] +" ,tempString "+tempString);
				}
				
				whileString=tempString;
				k++;
				
				M++;
				//System.out.println("childString : "+splittedString +" , updated parentString :"+whileString);
			}
			
			j=j+10;
		}
		
		return splittedString;
	}

}
