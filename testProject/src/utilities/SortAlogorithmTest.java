package utilities;

public class SortAlogorithmTest {

	public static void main(String[] args) {
		int [] arrays1 = {5,75,23,10,25,7,9,8,3,6,7,1};
		bubbleSort(arrays1);
		for(int num : arrays1){
			System.out.print(num+",");
		}
	}
	

	
	public static void bubbleSort(int [] arrays){
		for(int i = 1; i< arrays.length; i++){
			for(int j= 0;j< arrays.length-i;j++){
				if(arrays[j] > arrays[j+1]){
					int temp = 0;
					temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				}
			}
		}
	}
	
	public static void selectSort(int [] arrays){
		int min_index = 0;
		for(int i= 0;i<arrays.length-1;i++){
			min_index = i;
			for(int j = i+1;j< arrays.length;j++){
				if(arrays[j] < arrays[min_index]){
					min_index = j;
				}
				if(min_index != i){
					int temp = 0;
					temp = arrays[i];
					arrays[i] = arrays[min_index];
					arrays[min_index] = temp;
				}
			}
		}
	}
	
	public static void InsertSortArray(int [] arrays) { 
		for(int i=1;i<arrays.length;i++)
		{ 
		    int temp=arrays[i];
		    int j=i-1; 
			while (j>=0 && arrays[j]>temp)
			{ 
				arrays[j+1]=arrays[j]; 
			    j--; 
			} 
			arrays[j+1]=temp; 
		} 
	}
	
}
