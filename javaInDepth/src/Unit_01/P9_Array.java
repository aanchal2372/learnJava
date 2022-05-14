package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		int[] array1 = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };
		obj.findSecondLargestAndSecondSmallestElement(array1);
		obj.leftRotationInAnArray(array1);
		obj.removeElementInArray(array1); // (Optional)

	}

}

class QuestionsOnArray {
	void sortAnArray(int[] arr) {
		int size=arr.length ;
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{

			    if(arr[j]<arr[i])
			{
			    	 temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;
			}
		}
	}
	System.out.println("Sorted Array:");
	for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
    System.out.println();
}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		int size=arr.length;
		int b[];
		 b=new int [size];
		    int count =0;
		    for(int i=0;i<size;i++)
		    {   
		        count=1;
		        if(arr[i]!=-1)
		        {
		            for(int j=i+1;j<size;j++)
		            {
		                if(arr[i]==arr[j])
		                {
		                    count ++;
		                    arr[j]=-1;
		                }
		            }
		            b[i]=count;
		        }
		    }
		    System.out.println("Duplicate Elements in array are:");
		    for(int i=0;i<size;i++)
		    {
		        if(b[i]==2)
		        {
		            System.out.print(arr[i]+" ");
		        }
		    }
        System.out.println();
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		int size=arr.length;
		int temp;
		 for (int i = 0; i < size; i++) 
	        {
	            for (int j = i + 1; j < size; j++) 
	            {
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        System.out.println("Second Largest:"+arr[size-2]);
	        System.out.println("Second Smallest:"+arr[1]);

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int n=arr.length;
		 for(int i = 0; i < n; i++){  
	            int j, first;  
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                arr[j] = arr[j+1];  
	            }   
	            arr[j] = first;  
	        }  
		 System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println(); 

	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}