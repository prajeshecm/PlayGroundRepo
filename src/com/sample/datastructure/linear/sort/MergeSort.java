package com.sample.datastructure.linear.sort;

public class MergeSort {
	
	static class MergeSortDomain{
		
		int start= 0;
		int end =0;
		int middle = 0;
	};
	
	
	public static void main(String[] args) {
		
		int[] arrayElements = {30 , 50 , 10 , 05, 1 , 90, 20, 100};
		  //applyMergeSort(arrayElements,0,arrayElements.length-1 );
		sortArrays(arrayElements);
		  for (int i=0;i<arrayElements.length;i++){
				//for (int j=0;i<arrayOfnumbers.length;i++){
					//arrayOfnumbers[start+i]= tempArrays[i];
					System.out.println("final sorted merge is :"+arrayElements[i]);
				//}
			}
	}
	
	
	public static void sortArrays(int[] arrayOfnumbers){
		//Get the variable indicators
		int start = 0;
		int end = arrayOfnumbers.length-1;//corrected.
		applyMergeSort(arrayOfnumbers,start,end);
		
	}
	
	/**
	 * 
	 * @param arrayElements
	 * @param start
	 * @param end
	 */
	private static  void applyMergeSort(int[] arrayElements , int start , int end ) {
		System.out.println("+arrayElements:: "+ arrayElements + " ,start :"+ start + ", end : "+ end);
			 
		   //Stop diving the array elements when its reach for single element.
		   if(start >= end )
				return ;
	 
				//Do the divide for the arrayElements.
				int middle = (start + end)/2;	
				applyMergeSort(arrayElements ,  start , middle  );
				applyMergeSort(arrayElements ,  middle+1 , end  );
				//merge(arrayElements,startArray,endArray);
				applyMerge(arrayElements,start,middle,end);
		}

	/**
	 * 
	 * @param arrayElements
	 * @param start
	 * @param middle
	 * @param end
	 */
	private static void applyMerge(int[] arrayElements, int start, int middle,
			int end) {
		//Get the dynamic temp array to do the merge of each portion of element.
		int[] tempArray = new int[end-start+1];
		
		//Get the int marker for iterating both divided data and put that into the temp array.
		int leftSlotStart = start;
		int rightSlotStart = middle+1;
		int k=0;
		
		//Iterate both the arrays and feed that to temp array.
		while(leftSlotStart <= middle && rightSlotStart <= end){
			System.out.println("Start :"+start + " , middle :"+middle+" , end :"+end);
			System.out.println("Left slot : "+arrayElements[leftSlotStart] + " , right slot :"+arrayElements[rightSlotStart]);
			if(arrayElements[leftSlotStart] <= arrayElements[rightSlotStart]){
				tempArray[k]=arrayElements[leftSlotStart];
				leftSlotStart++;
				k++;
			}else{
				tempArray[k]=arrayElements[rightSlotStart];
				rightSlotStart++;
				k++;
			}
		}
		
		//Always the final element in the above comparsion wont be handled and added to temparray. so adding that here.
		if(leftSlotStart <= middle){
			while(leftSlotStart <= middle){
				tempArray[k]=arrayElements[leftSlotStart];
				leftSlotStart++;
				k++;
			}
		}else if(rightSlotStart <= end){
			while(rightSlotStart <= end){
				tempArray[k]=arrayElements[rightSlotStart];
				rightSlotStart++;
				k++;
			}
		}
		
		//iterate the tempArray and set it back to Main Array.
		for (int i=0;i<tempArray.length;i++){
			  System.out.println("Sorted tempArrays[i] :"+tempArray[i]);
			arrayElements[start+i]=tempArray[i];
		}
	}

	/**
	 * 
	 * @param finalArrayList
	 * @param start
	 * @param end
	 */
	private static void mergeOld(int[] finalArrayList, int[] startArray, int[] endArray) {
		
		int k = 0;
		int  arrayElementsLengthSize  = 0;
		
	/*	if(start > end ){
			arrayElements[0] = end ;
			arrayElements[1] = start;
		}*/

		for(int i = 0 ; i < startArray.length ;i ++) {
			int compVal = startArray[i];
			
			for(int j = k ; j < endArray.length ;j ++) {
				int withpVal = endArray[j];
				
				if(compVal > withpVal ){
					arrayElementsLengthSize = startArray.length;
					finalArrayList[arrayElementsLengthSize++] = withpVal;
					
				}else {
					arrayElementsLengthSize = startArray.length;
					finalArrayList[arrayElementsLengthSize++] = compVal;
					k = j;
					break;
				}
				
			}
		}
	}
}


/*//Output console for this merge sort data for better understanding
int[] arrayElements = {30 , 50 , 10 , 05, 1 , 90, 20, 100};

start :0, end : 7
start :0, end : 3
start :0, end : 1
start :0, end : 0
start :1, end : 1

//30 ,50 Comparing 2 arrays)
Start :0 , middle :0 , end :1
Left slot : 30 , right slot :50
**Sorted** tempArrays[i] :30
**Sorted** tempArrays[i] :50

// 10,5 Comparing 2 arrays)
 start :2, end : 3
 start :2, end : 2
 start :3, end : 3
Start :2 , middle :2 , end :3
Left slot : 10 , right slot :5
**Sorted** tempArrays[i] :5
**Sorted** tempArrays[i] :10

//10,5  and 30,50  Comparing 2 arrays)
Start :0 , middle :1 , end :3
Left slot : 30 , right slot :5
Start :0 , middle :1 , end :3
Left slot : 30 , right slot :10
**Sorted** tempArrays[i] :5
**Sorted** tempArrays[i] :10
**Sorted** tempArrays[i] :30
**Sorted** tempArrays[i] :50


start :4, end : 7
start :4, end : 5
start :4, end : 4
//1,90 Comparing 2 arrays)
start :5, end : 5
Start :4 , middle :4 , end :5
Left slot : 1 , right slot :90
**Sorted** tempArrays[i] :1
**Sorted** tempArrays[i] :90

start :6, end : 7
start :6, end : 6
start :7, end : 7
//20,100 Comparing 2 arrays)
Start :6 , middle :6 , end :7
Left slot : 20 , right slot :100
**Sorted** tempArrays[i] :20
**Sorted** tempArrays[i] :100

//1,90 and 20,100  Comparing 2 arrays)
Start :4 , middle :5 , end :7
Left slot : 1 , right slot :20
Start :4 , middle :5 , end :7
Left slot : 90 , right slot :20
Start :4 , middle :5 , end :7
Left slot : 90 , right slot :100
**Sorted** tempArrays[i] :1
**Sorted** tempArrays[i] :20
**Sorted** tempArrays[i] :90
**Sorted** tempArrays[i] :100

//5,10,30,50  and 1,20,90,100 (Comparing 2 arrays)
Start :0 , middle :3 , end :7
Left slot : 5 , right slot :1
Start :0 , middle :3 , end :7
Left slot : 5 , right slot :20
Start :0 , middle :3 , end :7
Left slot : 10 , right slot :20
Start :0 , middle :3 , end :7
Left slot : 30 , right slot :20
Start :0 , middle :3 , end :7
Left slot : 30 , right slot :90
Start :0 , middle :3 , end :7
Left slot : 50 , right slot :90
**Sorted** tempArrays[i] :1
**Sorted** tempArrays[i] :5
**Sorted** tempArrays[i] :10
**Sorted** tempArrays[i] :20
**Sorted** tempArrays[i] :30
**Sorted** tempArrays[i] :50
**Sorted** tempArrays[i] :90
**Sorted** tempArrays[i] :100


final **Sorted** merge is :1
final **Sorted** merge is :5
final **Sorted** merge is :10
final **Sorted** merge is :20
final **Sorted** merge is :30
final **Sorted** merge is :50
final **Sorted** merge is :90
final ****Sorted**** merge is :100


*/