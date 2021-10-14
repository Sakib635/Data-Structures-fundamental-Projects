package sakib635;

import java.util.Scanner;

public class Lab05_18101635 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    
	    
	    
//Task 1-Implement a recursive algorithm to find factorial of n.	
	    System.out.println("Task-1\n");	    
	    
	    System.out.println("Enter a number to find the factorial-");
	    int number = sc.nextInt();
	    System.out.println(+number+"! = "+findFactorial(number));
	    
	    System.out.println();
	  
	
//Task 2-Implement a recursive algorithm to find the n-th Fibonacci number. 
		System.out.println("Task-2\n");	
		
	    System.out.println("Enter a number n to find the n-th Fibonacci number- ");
	    int number1 = sc.nextInt();
	    System.out.println(number1+"-th Fibonacci number is: "+findFibonacci(number1));
	    
	    System.out.println();
	
	
//Task 3-Print all the elements of a given array recursively.
	    System.out.println("Task-3\nPrint all the elements of a given array recursively.");	
	    
	    int[] array = {10,15,20,25,30,35,40,45,50};
	   
	    printRecursively(array, 0); // Print all the elements.
	    
	    
	    System.out.println();
	    
	    
//Task 4-Implement a recursive algorithm that takes a decimal number n and converts n to its corresponding (you may return as a string) binary number.
	    System.out.println("Task-4\n");
	    
	    System.out.println("Enter a decimal value to find the corresponding binary number");
	    int number3 = sc.nextInt();
	    System.out.println("Binary of "+number3+" = "+toBinary(number3));

	    System.out.println();
	    
	    
//Task 5-Implement a recursive algorithm to find the m^n.
	    System.out.println("Task-5\n");
	    
	    System.out.println("Enter a number m");
	    int m = sc.nextInt();
	    System.out.println("Enter a number n as the power ^ of m");
	    int n = sc.nextInt();
	    System.out.println("m^n = "+ powerSolver(m , n));
	    
	    System.out.println();

	    
	    
//Task 6-Implement a recursive algorithm to add all the elements of a non-dummy headed singly linked linear list.
	    System.out.println("Task-6\n");
	    
	    int[] array1 = {10,20,30,40,50};
	    
	    LinkedList list = new LinkedList(array1);
	    
	    System.out.println("Sum of all elements of the list = "+addElements(list.head));
	    
	    
	    System.out.println();
	    
	    
	    
//Task 7- Implement a recursive algorithm which will print all the elements of a list in reversed order.
	    System.out.println("Task-7\nprint all the elements of a list in reversed order");
	    
	    int[] array2={5,10,15,20,25,30};
	    LinkedList list1=new LinkedList(array2);
	    
	    reversePrint(list1.head);

	}

	
	
	
	
//Task Methods:
	
	
	//Task 1-Implement a recursive algorithm to find factorial of n.	
	public static int findFactorial(int n){
	    if(n == 0 || n == 1){
	      return 1;
	      
	    }else {
	    	
	    	return findFactorial(n-1)*n;
	    }
	  }
	
	
	  
	
	
	//Task 2-Implement a recursive algorithm to find the n-th Fibonacci number.  
	public static int findFibonacci(int n){
	    if(n==0){
	    	
	      return 0;
	    }
	    if(n==1){
	    	
	      return 1;
	    }
	    return findFibonacci(n-1)+findFibonacci(n-2);
	  }
	
	
	
	
	
	//Task 3-Print all the elements of a given array recursively.
	public static void printRecursively(int[] ar , int i){
	    if(i<ar.length){
	    	if(i!=0) {
	    		 System.out.print(","+ar[i]);
	    	}else {
	      System.out.print(ar[i]);
	    	}
	      i++;
	      printRecursively(ar, i);
	    }
	  }
	
	

	
	
	//Task 4-converts n to its corresponding (you may return as a string) binary number
	public static int toBinary (int n){
	    if (n == 0){
	    	
	      return 0;
	    }
	    else{
	    	
	      return (n%2)+10*(toBinary(n/2));
	    }
	  }
	
	
	
	
	
	//Task 5-Implement a recursive algorithm to find the m^n.
	public static int powerSolver (int m , int n){
	    if(n == 0){
	    	
	      return 1;
	    }
	    if(n == 1){
	    	
	      return m;
	    }
	    n--;
	    return m*powerSolver(m,n);
	  }
	
	
	
	
	
	//Task 6-Implement a recursive algorithm to add all the elements of a non-dummy headed singly linked linear list.
	public static int addElements(Node n){
	    if (n == null){
	      return 0;
	    }
	    else{
	      return n.element + addElements(n.next);
	    }
	  
	  }
	
	
	
	
	
	//Task 7- Implement a recursive algorithm which will print all the elements of a list in reversed order.
	static void reversePrint(Node n){
	    if(n.next!=null){
	    	reversePrint(n.next);
	      System.out.println(n.element);
	    }else {
	    	System.out.println(n.element);
	    }
	  }

}







  //Singly LinkedList class
  class LinkedList{
		  public Node head;
		  
		//constructor 1
		  public LinkedList(){
			  
		  }
	
		 //constructor 2 ----This constructor creates a list from an array.
		  public LinkedList(int [] a){
		   
			head = new Node(a[0],null);
		    Node current = head;
	
		    for (int i = 1 ; i<a.length ; i++){
		      Node n = new Node (a[i] , null);
		      current.next = n;
		      current = current.next;
		    }
		    
		  }
   }  

  
  
  
  
  
  //Singly Node class
    class Node{
	  public int element;
	  public Node next;
	  
	  public Node(int e, Node n){
	    element =e ;
	    next = n;
	    
	  }  
    }


