package com.sample.datastructure.linear.sort;

public class QuickPartitionSort {

	
	public static void main(String[] args) {
		
		QuickPartitionSort quickSort = new QuickPartitionSort();
		//int[] arrayElements = {6,8,7,2,4,3,5};
		int[] arrayElements = {20,90,50,70,30};
		quickSort(arrayElements);
	}
	
	
	
	public static void quickSort (int[] arrayElements){
		
		//Get the partition index for arrayElements.
		int start = 0;
		int end = arrayElements.length-1;
		int pivot = end;
		
		int partitionIndex = partition(arrayElements,start,end,pivot);
		System.out.println("partitionIndex :"+partitionIndex);
		//Divide & Conquer the Left and right side of the elements to get the array sorted.
		
		
		for(int z=0 ;z<arrayElements.length ; z++){
			
			System.out.println(" *** Final Partition Order : "+arrayElements[z]);
		}
	}



	private static int partition(int[] arrayElements, int start, int end,
			int pivot) {
		
		System.out.println("Partition Value : start :"+start + " , end : "+end);
		int i=-1;
		int j=0;
		//while(start < end){
		if(start == end){
			return 0;
		}
			for( j=0 ; j<arrayElements.length-1 ; j++){
				System.out.println("Compare elements arrayElements[j] : "+arrayElements[j] + " , with pivot :"+arrayElements[pivot]);
				if(arrayElements[pivot]==arrayElements[j]){
					//return 0;
					break;
				}
				//if the array elements is less than the pivot (i.e 20 < 30 ) , then increase the ith element and swap the value of i & j , if not just increment the jth element.
				//So will make sure all the lesser value will get maintained in the left side (but not in ascending value).
				  if( arrayElements[j] <= arrayElements[pivot]){
					  System.out.println("the arrayth element " + arrayElements[j]+ " , is less than the pivot so swapping it : "+arrayElements[pivot]);
					i++;
					int temp = arrayElements[j];
					arrayElements[j] = arrayElements[i] ;
					arrayElements[i] = temp ;
				}
				 /* for(int k =0 ; k<arrayElements.length ; k++){
					  System.out.println("Swapped Array elements are : "+arrayElements[k]);
				  }*/
			}
		//}
		
		//arrayElements[i+1]=arrayElements[pivot];
		//swap the pivot to i+1.
		int index = swapPivot(  i , j, arrayElements ,pivot );
		
		partition(arrayElements, start, index-1, index-1);
		
		partition(arrayElements, index+1, end, end);
		
		return i+1;
	}


private static int swapPivot(int i,int j, int[] arrayElements, int pivot) {
	
	//int temp = arrayElements[arrayElements.length-1];
	int temp = arrayElements[pivot];
	
	while(j > i){
		arrayElements[j] =arrayElements[j-1];
		j--;
	}
	arrayElements[j+1]=temp;
	
	for(int z=0 ;z<arrayElements.length ; z++){
		
		System.out.println(" Partition Order : "+arrayElements[z]);
	}
	
	return i+1;
		 
	}


	/**
	 * 
	 * @param i
	 * @param arrayElements
	 * @param pivot
	 */
	private static void swapPivotOld(int i, int[] arrayElements, int pivot) {
		
		int temp = 0;
		Boolean firstValueMove = Boolean.TRUE;
		for(int k=i+1 ; k <arrayElements.length ; k++){
			if( k <= pivot){
				System.out.println("arrayElements[k] :"+arrayElements[k]+ " , arrayElements[k+1]"+arrayElements[k+1]);
				//arrayElements[k+1] =arrayElements[k];
				if(firstValueMove){
					temp =arrayElements[k+1];
					arrayElements[k+1] =arrayElements[k];
					firstValueMove = Boolean.FALSE;
				}else {
					arrayElements[k] =temp;
					temp =arrayElements[k+1];
				}
				
				}
			
		}
		arrayElements[i+1]=arrayElements[pivot];
		
		      for(int j=0 ; j<arrayElements.length ; j++){
					
				System.out.println(" Partition Order  CHECK : "+arrayElements[j]);
			}
	}
	
	
}
