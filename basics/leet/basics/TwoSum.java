package com.sample.leet.basics;

import java.util.HashMap;

public class TwoSum {
	
	
	public static void main (String args[]){
		TwoSum twoSum = new TwoSum();
		int[] intArrayVal = new int[]{4,3,6,9,2};
		int target = 5;
		/*int[] intArrayVal = new int[]{0,4,3,0};
		int target = 0;*/
		/*int[] intArrayVal = new int[]{-3,4,3,90};
		int target = 5;*/
		/*int[] intArrayVal = new int[]{2,7,11,15};
		int target = 9;
		*/
		intArrayVal = twoSum.findTwoSumMatch(intArrayVal , target);
		System.out.println("returned intArrayVal : "+intArrayVal.toString());
		
	}
	
	
	public int[] findTwoSumMatch(int[] intArrayVal , int target){
		System.out.println("Input Values :"+intArrayVal + ", target : " +target);
		HashMap<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<intArrayVal.length;i++){
			System.out.println("intArrayVal[i]:"+intArrayVal[i]);
			int matchVal = target - intArrayVal[i];
			System.out.println("matchVal :"+matchVal);
			
			if(matchVal >= 0){
				if(arrayMap.containsKey( matchVal)){
					System.out.println("arrayMap :"+arrayMap+" , arrayMap.get(matchVal) :"+arrayMap.get(matchVal));
					//return new int[]{matchVal,intArrayVal[i]};
					return new int[]{arrayMap.get(matchVal),i};
				}else {
					arrayMap.put(intArrayVal[i], i);
					//arrayMap.put( i,intArrayVal[i]);
					System.out.println("added to the arrayMap :"+arrayMap);
				}
			}
		}
		
		throw new IllegalArgumentException("No Matches Found");
	}

}
