package com.sample.datastructure.linear.sort;

/**
 * 
 * @author Arsha Prajesh
 * SelectionSort is o(n2) and the reason is , this will take one item in the array and iterate itself with other items/elements if that is small than the current one then swap the smallest and keep continuing.
 */
public class SelectionSort {
	
	/**
	 * 
	 * @param items
	 * @return
	 */
	private static int[] sortBySelection(int[] items){
		
		//when item is empty/invalid return appropriate info .
		for(int i=0 ; i<items.length;i++){
			int minimum = items[i];
			System.out.println("-------------------------------");
			System.out.println("My Minimum :"+minimum+ " , ith "+i);
			
			for(int j=i+1 ; j < items.length ; j++){
				System.out.println("My comparator : " + items[j]);
				if(minimum > items[j]){
					//swap my new minimum from Jth array.
					minimum = items[j];
					System.out.println("My new Minimum :"+minimum+ " , jth "+j);
					//items = reformItemsArray(minimum,i, items);
					items = swapNewMinimum(i,j,items);
				}
				//put my minimum in the correct spot.
				System.out.println("items[i] :"+items[i]);
				for(int k=0 ; k < items.length ; k++){
					System.out.println(" my swapped item now : "+items[k]);
				}
			}
		}
		return items;
	}
	
	/**
	 * 
	 * @param i
	 * @param j
	 * @param items
	 * @return
	 */
	private static int[] swapNewMinimum(int i, int j,int[] items) {
		System.out.println("swapNewMinimum : i index : "+ i+ " , new minimum/j index "+j); 
		int temp =items[j];
		items[j]=items[i];
		items[i]=temp;
		return items;
	}

	public static void main(String[] args) {
		int[] items = {10,5,6 ,3 ,1, 20};
		items = sortBySelection(items);
		for(int i=0 ; i<items.length;i++){
			System.out.println("Sorted new Array :"+items[i]);
		}
	}
}	
