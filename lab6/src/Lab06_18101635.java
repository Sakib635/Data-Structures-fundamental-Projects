import java.util.Arrays;
import java.util.Scanner;

public class Lab06_18101635 {

	public static void main(String[] args) {
	      
		Scanner sc=new Scanner(System.in);
		
		
		//Task-1 test
		
		System.out.println("For Task-1 -Enter 1 : "); 
		int a=sc.nextInt();
		
		
		
		if (a==1) {
		   int[] array1 = {6,4,9,8,7,-3,5,-2,5,4,1};

	       System.out.println("Task-1\nBefore selection sorting."); 
	       System.out.println(Arrays.toString(array1)); 
	       selectionSort(array1, 0);
	 
	      //prints the array after selection sort
	        System.out.println("After selection sorting."); 
	        System.out.println(Arrays.toString(array1)); 
		}
	        
	        System.out.println(); 
	        
	    
	      //Task-2 test
	        
			System.out.println("For Task-2 -Enter 2 : "); 
			int b=sc.nextInt();
			
			
			
		if (b==2) {  
	       int[] array2= {9,8,7,9,-3,5,-2,5,-4,1};
	 
	       System.out.println("Task-2\nBefore insertion sorting."); 
		   System.out.println(Arrays.toString(array2)); 
		   insertion_sort(array2, 0);
	    
	      //prints the array after insertion sort
	        System.out.println("After insertion sorting."); 
	        System.out.println(Arrays.toString(array2)); 
	        
		}
	        
	        System.out.println(); 
	        
	      
	      //Task-3 test
	        
			System.out.println("For Task-3 -Enter 3 : "); 
			int c=sc.nextInt();
			
			
			
		if (c==3) {    
	       int[] array3= {3,2,-1,6,4,7,9,7,-2,3,3,8};
	        
	       System.out.println("Task-3\nBefore bubble  sorting."); 
		   System.out.println(Arrays.toString(array3)); 
		   
	      //prints the array after selection sort
	        System.out.println("\nSingly linked sequential list after bubble sorting.\n"); 
	        singly_linkedList_bubble_sort(array3);
	        
		}
	        
	        System.out.println(); 
	        
	      //Task-4 test
	        
			System.out.println("For Task-4 -Enter 4 : "); 
			int d=sc.nextInt();
			
			
			
		if (d==4) { 
	        
	       int[] array4= {3,-2,1,6,4,7,9,-2,3,-8};
	        
	       System.out.println("Task-4\nBefore selection  sorting."); 
		   System.out.println(Arrays.toString(array4)); 
		   
	      //prints the array after selection sort
	        System.out.println("\nSingly linked sequential list after selection sorting.\n"); 
	        singly_linkedList_selection_sort(array4);
			
		}
	        
	        
	        System.out.println(); 
	        
	      
	      //Task-5 test
	        
			System.out.println("For Task-5 -Enter 5 : "); 
			int e=sc.nextInt();
			
			
			
		if (e==5) {
	       int[] array5= {7,4,1,-5,2,8,-6,3,9};
	        
	       System.out.println("Task-5\nBefore insertion  sorting."); 
		   System.out.println(Arrays.toString(array5)); 
		   
	      //prints the array after selection sort
	        System.out.println("\nDoubly linked sequential list after insertion sorting.\n"); 
	        Doubly_linkedList_insertion_sort(array5);
			
		}
		
		
		System.out.println(); 
		
		
		//Task-6 test
		
			System.out.println("For Task-6 -Enter 6 : "); 
			int f=sc.nextInt();
			
			
			
		if (f==6) {
		
	        int array6[] = {2,3,4,9,10,15,30,40,55,70,75,90};
	        System.out.println("Task-6\n"+Arrays.toString(array6));
	        
	        System.out.println("Enter an element for binary search from the above the list");
	        int value = sc.nextInt();
	       
	        int result = binarySearch(array6, 0, array6.length-1, value);
	       
	        if (result == -1)
	            System.out.println("The element does not present");
	        else
	            System.out.println("The element found at index " + result);
		
		}
		
		
		System.out.println(); 
		
		
        
		
		//Task-7 test
		
		System.out.println("For Task-7 -Enter 7 : "); 
		int g=sc.nextInt();
		
		
		
	   if (g==7) {
		 long fibArray[]=new long[50];
		 System.out.println("Enter a number n to find n-th fibonacci number ");
	        int n = sc.nextInt();

		 System.out.println(n+"-th Fibonacci number is--> "+fibonacciWithMemoization(fibArray,n));
		 System.out.println(); 
		 
		 System.out.println("The fibonacci series upto "+n+"-th :"); 
		 System.out.println(Arrays.toString(fibArray)); 
	}
	
	
}
	
	
	
	
// All the task methods are as follows -----------
	
	
	
	
	

 
	/*Task-1
	 * Sorting an array RECURSIVELY using selection sort algorithm on the unsorted
	 * array from index 'i' to index 'n-1'. We find the smallest number in the
	 * unsorted sub array from index 'i' to index 'n-1' and swap it with `array[i]`
	 * and proceeds recursively.  (definition taken from geeksforgeeks )
	 */
    public static void selectionSort(int[] array, int i){
     
        int minValueIndex = i;
        for (int j = i + 1; j < array.length; j++) {
          if (array[j] < array[minValueIndex]) {
        	  minValueIndex = j; 
            }
        }
 
        swap(array, minValueIndex, i);
 
        if (i + 1 <array.length) {
           
        	selectionSort(array, i + 1);
        }
    }
    
	//swap values at two indices in the array
    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
////////////////////////////////////////////////////////////////Task-1 done////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
	/*Task-2
	 * To sort an array of size n in ascending order using insertion_sort algorithm 
	 * 1: Iterate from array[1] to array[n] over the array. 
	 * 2: Compare the current element (key) to its predecessor. 
	 * 3: If the key element is smaller than its predecessor, compare
	 *    it to the elements before. Move the greater elements one position up to make
	 *    space for the swapped element. (definition taken from geeksforgeeks )  
	 */
    public static void insertion_sort(int[] array, int i) {
        int value = array[i];
        int j = i;

        while (j > 0 && array[j - 1] > value)
        {
            array[j] = array[j - 1];
            j--;
        }
 
        array[j] = value;
 
        if (i + 1 < array.length) {
            insertion_sort(array, i + 1);
        }
    }
 
////////////////////////////////////////////////////////////////Task-2 done////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    //Singly linked list NODE class
    public static class NodeSingly{
        Object val;
        NodeSingly next;
        
        public NodeSingly(Object v, NodeSingly n){
            val = v;
            next = n;
        }
    }
    
    
    //Doubly linked List NODE class
    public static class NodeDoubly{
    	  public Object element;
    	  public NodeDoubly next;
    	  public NodeDoubly prev;
    	  
    	  public NodeDoubly(Object e, NodeDoubly n, NodeDoubly p){
    	    element =e ;
    	    next = n;
    	    prev =p;
    	    
    	  }
    	  
    	}
    
    
    
    
    
    
    
    
    /*Task-3
     * Sort a singly linked sequential list using bubble sort algorithm.
     * 
     * The bubble sort algorithm compares two adjacent elements and swaps them if they are not in the intended order.
     * (definition taken from geeksforgeeks ) 
     */
    
    public static void singly_linkedList_bubble_sort(int[] arr) { 
    NodeSingly head = new NodeSingly(arr[0] ,null);
    NodeSingly tail = head;
    
    for(int i = 1 ; i<arr.length ; i++){
      NodeSingly temp = new NodeSingly (arr[i], null);
      tail.next = temp;
      tail = tail.next;
    }
    
    
    for(NodeSingly cur = head ; cur!=null ; cur=cur.next){
      for(NodeSingly b = head ; b.next!=null ; b = b.next){
        if((int)b.val>(int)b.next.val){
          Object t = b.val;
          b.val = b.next.val;
          b.next.val = t;
        }
      }
    }
    
    for(NodeSingly x = head ; x!=null ; x = x.next){
      System.out.println(x.val);
    }
    
  }


    
////////////////////////////////////////////////////////////////Task-3 done////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    /*Task-4
     * Sort a singly linked sequential list using selection sort algorithm.
     */
    public static void singly_linkedList_selection_sort(int[] array) { 
    
    
    NodeSingly head = new NodeSingly (array[0],null);
    NodeSingly tail = head;
    
    for(int i = 1 ; i<array.length ; i++){
      NodeSingly temp = new NodeSingly (array[i] , null);
      tail.next = temp;
      tail = tail.next;
    }
       
    for(NodeSingly cur = head ; cur.next!=null ; cur=cur.next){
      NodeSingly minIndex = cur;
      for(NodeSingly b = cur.next ; b!=null ; b=b.next){
        if((int)b.val<(int)minIndex.val){
        minIndex = b;
        }
      }
      Object temp = minIndex.val;
      minIndex.val = cur.val;
      cur.val = temp;
    }
    
    for(NodeSingly x = head ; x!=null ; x=x.next){
      System.out.println(x.val);
    }
  }
    
    
////////////////////////////////////////////////////////////////Task-4 done////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    /*Task-5
     * Sort a Doubly linked sequential list using insertion  sort algorithm.
     */
    public static void Doubly_linkedList_insertion_sort(int[] array) { 
    
    NodeDoubly head = new NodeDoubly (array[0] , null , null);
    NodeDoubly tail = head;
    
    for(int i = 1 ; i<array.length ; i++){
      NodeDoubly cur = new NodeDoubly (array[i] , null , null);
      tail.next = cur;
      cur.prev = tail;
      tail = tail.next;
    }
    
    for(NodeDoubly i = head ; i!=null ; i = i.next){
      Object temp = i.element;
      
      NodeDoubly j = i;
      
      while(j.prev!=null && (int) j.prev.element> (int)temp){
        j.element = j.prev.element;
        j = j.prev;
      }
      j.element = temp;
    }
    
    for(NodeDoubly x = head ; x!=null ; x = x.next){
      System.out.println(x.element);
    }
    
  }
    
    
////////////////////////////////////////////////////////////////Task-5 done////////////////////////////////////////////////////////////////////////////////////  
    
    
    
 
    /*Task-6
     * Binary search algorithm RECURSIVELY.
     */
	
    public static  int binarySearch(int array[], int l, int r, int value) {

        if (r >= l && l<=array.length-1) {
           
            int mid = l + ((r - l) / 2);
 
            if (array[mid] == value)
                return mid;
      
            if (array[mid] > value) {
                return binarySearch(array, l, mid - 1, value);
            }
 
            return binarySearch(array, mid + 1, r,value);
        }
 
        return -1;
    }

    
////////////////////////////////////////////////////////////////Task-6 done////////////////////////////////////////////////////////////////////////////////////  
    
    
    
    
    /*Task-7
     *  recursive algorithm to find the n-th Fibonacci number using memoization.
     */
	  
    
    public static long fibonacciWithMemoization(long[]fibArray,long n){
    	  long fibValue=0;
    	  if(n==0 ){
    	   
    		  return 0;
    	   
    	  }else if(n==1){
    	  
    		  return 1;
    	   
    	  }else if(fibArray[(int)n]!=0){
    	   
    		  return fibArray[(int)n];
    	   
    	  }else{
    	  
    		  fibValue=fibonacciWithMemoization(fibArray,n-1)+fibonacciWithMemoization(fibArray,n-2);
    	  
    		  fibArray[(int) n]=fibValue;
    	  
    		  return fibValue;
    	  }
    	  
    	 }
    
////////////////////////////////////////////////////////////////Task-7 done////////////////////////////////////////////////////////////////////////////////////   
    
}
