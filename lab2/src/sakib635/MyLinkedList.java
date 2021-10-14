 package sakib635;

public class MyLinkedList {
	public Node head;

	///////////////////////////////////////////   TASK-1 & TASK-2    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	//This constructor creates an empty list.
	public MyLinkedList() {
		
	}
	
	//This constructor creates a list from an array.
	public MyLinkedList(int [] a) {
		 head= new Node(a[0],null);
		 Node currentNode= head;
		 for(int i=1;i<a.length;i++) {
			 Node temp = new Node(a[i],null);
			 currentNode.next=temp;
			 currentNode=currentNode.next;
		 }
			
	}
	
	
	//This constructor creates a list from another list.
	public MyLinkedList(MyLinkedList a) {
		
	    head = new Node((a.head).element, null);
	    Node current = head;
	    for(Node n = (a.head).next ; n!=null ; n=n.next){
	        Node temp= new Node(n.element , null);
	        current.next = temp;
	        current = current.next;
	      }
		
	}
	

	//Outputs the keys of the elements of the order list
	public void showList() {
		 Node cur = head;
		 if(cur==null) {
			 System.out.println("Empty List");
		 }
		 else {
		    while(cur.next!=null){
		      System.out.print(cur.element+", ");
		      cur = cur.next;
		    }
		    System.out.println(cur.element+".");
		 }
		
	}
	
	
	//Returns true if a list is empty. Otherwise, returns false.
	public boolean isEmpty() {
		Node cur = head;
		if(cur==null) {
			return true;
		}
		else {
			return false;
		}
	
	} 
	
	
	// Removes all the elements from a list.
	public void clear ( ) {
	    Node cur = head;
	    for(Node n = cur ; n!=null ; n=n.next){
	      
	        n.element=0;
	        
	      }
	} 
	
	
	/*This method inserts newElement at the tail of the list. 
	If an element with the same key as newElement already exists in the list, 
	then it concludes the key already exists and does not insert the key.*/
	
	public void insert (Node newElement) {
		Node cur=head;
		int flag=0;
		while( cur.next!=null ) {
			if(cur.element==newElement.element) {
				System.out.println("The key already exists and does not insert the key.");
				flag=1;
				break;
			}
			cur=cur.next;
		}
		if(flag==0){
			if(cur.element==newElement.element) {
				System.out.println("The key already exists and does not insert the key.");
		
			}else {
				cur.next=newElement;
			}
		}		
	}
	
	// This method counts the number of Nodes in the LinkedList 
	  public int countNode(){
	    Node current = head;
	    int count = 1;
	    while(current!=null){
	      count++;
	      current = current.next;
	    }
	    
	    return count;
	  }
	
	
	  /*This method inserts newElement at the given index of the list. 
	If an element with the same key as newElement value already exists in the list,
	then it concludes the key already exists and does not insert the key.
	[You must also check the validity of the index].*/

	public void insert (int newElement, int index) {
		int NodeCount=countNode();
		Node cur=head;
		Node cur2=head;
		int flag=0;
		 if (index>NodeCount-1){
		   System.out.println("invalid index");
		    }
		 else {
				while(cur2.next!=null) {
					if(cur2.element==newElement) {
						System.out.println("The key already exists and does not insert the key.");
						
						flag=1;
						break;
					}
					cur2=cur2.next;
				}
					
					
				if(flag==0) {
					if(cur2.element==newElement) {
						System.out.println("The key already exists and does not insert the key.");
						} else {
					
							Node newNode=new Node(newElement,null);
							for(int i = 1 ; i<index-1 ; i++) {
					 		cur=cur.next;
						 	}
						 	Node temp=cur.next;
						 	cur.next=newNode;
						 	newNode.next=temp;
			
					}
				}	 	
		 }
	}
	
	
	//Removes the element from a list that contains the deleteKey and returns the deleted key value.
	public int NodeRemove (int deleteKey) {
		Node before = null;
		Node cur=head;
		while(cur.next!=null && cur.element!=deleteKey) {
	
				before=cur;
				cur=cur.next;
		
		}
		if(cur.element==deleteKey) {
			before.next=cur.next;
		}else {
			System.out.println("\n"+deleteKey+" is not in the list\n");
		}
		
		return deleteKey;
	}
	
	
	///////////////////////////////////////////   TASK-1 & TASK-2    ENDs  here /////////////////////////////////////////
	
	
	
	
	
	
	
	                                       //////////   TASK-3 \\\\\\\\\\

	

//A function to find out the even numbers that are present in the list and output another list with those numbers.	
	public MyLinkedList evenlist() {
 int x=0;
		 
		 Node cur=head;
		 for(int i=1;i<countNode();i++) { 
			 if(cur.element%2==0) {
				x++;
			 }
			 cur=cur.next;
		 }
		 int a[]=new int[x];
			
		 if(x!=0) {
			 cur=head;
			 x=0;
			 for(int i=1;i<countNode();i++) { 
				 if(cur.element%2==0) {
					a[x++]=cur.element;
				 }
				 cur=cur.next;
			 }
			 MyLinkedList evenLinkedList =new MyLinkedList(a);
			 return evenLinkedList;
		 }
		 return null;
	}
	
	
	
	
//A function to find out if the element is in the list or not.	
    public boolean contains(int element){
	    Node cur = head;
	    int count = countNode();
	    boolean check = false;
	    for(int i = 1 ; i<count ; i++){
	      if(cur.element == element){
	        check = true;
	        break;
	      }
	      cur = cur.next;
	    }
	    
	    return check;
	    
	    }
	

//A function to reverse the list.
    public void  reverselist() {
    	int n=countNode();
    	
    	for(int i=1;i<=(n-1)/2;i++) {
    		int start=i,end=n-i;
    		int startVal=0,endVal=0;
    		Node cur = head;
    		for(int j = 1 ; j<n ; j++,cur = cur.next){
    		      if(j==start) {
    		    	  startVal=cur.element;
    		      }
    		      if(j==end) {
    		    	  endVal=cur.element;
    		    	  cur.element=startVal;
    		      }
    		      
    		}
    		cur=head;
    		for(int j = 1 ; j<n ; j++,cur = cur.next){
  		      if(j==start) {
  		    	  cur.element=endVal;
  		      } 		      
    		}  		
    	}  	
    }    
    
    
//A function to sort the list.  
    public void  sortList() {
    	int n=countNode();
    	int minVal=Integer.MAX_VALUE,minInd=-1;
    	
    	for(int i=1;i<n;i++) {
    		
    		Node cur=head;
    		
    		for(int j = 1 ; j<n ; j++,cur = cur.next){
    			if(j<i)continue;
    			if(j==i) {
    				minVal=cur.element;
    				minInd=i;
    				continue;
    			}
    			if(cur.element<minVal) {
    				minVal=cur.element;
    				minInd=j;
    			}
    		}
    		cur=head;
    		int temp=0;
    		for(int j = 1 ; j<n ; j++,cur = cur.next){
    			if(j==i) {
    				temp=cur.element;
    				cur.element=minVal;
    				continue;
    			}
    			if(j==minInd) {
    				cur.element=temp;
    				break;
    			}
    		}
    		
    	}
    	
    	
    }
    
    
   

//A function that prints the sum of the values in the list. 
 public void sum() {
	 Node cur=head;
	 int count=countNode();
	 int sum=0;
	 for(int i = 1 ; i<count ; i++) {
		 sum+=cur.element;
		 cur=cur.next;
	 }
	 System.out.println("Sum of the elements = "+sum);
 }


//A function that rotates the elements of the list k times.
 public void  rotatelist(String s,int k) {
	 int n=countNode();
	 Node cur=head;
	 for(int j = 1 ; j<n ; j++,cur = cur.next){
			if(j+1==n) {
				cur.next=head;
			}
		}
	 cur=head;
	 if(s.equals("left")) {
			
			for(int j = 1 ; j<=k ; j++,cur = cur.next){
				if(j==k) {
					head=cur.next;
					cur.next=null;
					break;
				}
			}
	 }else {
		 for(int j = 1 ; j<n ; j++,cur = cur.next){
				if(j==n-k-1) {
					head=cur.next;
					cur.next=null;
					break;
				}
			}
	 }
 }

 
 ////Write a method that takes as input a singly linked list and prints the first duplicate
 //number.
 public void printDuplicate(){
	 int count=countNode();
	 Node cur=head;
	
	 
	 for(int i=1;i<count;i++ ) {
	
		 int x=cur.element;
		 Node cur1=head;
		 
		 for(int j=1;j<i;j++ ) {
			 int y=cur1.element;
			 
			 if(x==y) {
				 System.out.println(x);
				 return ;
			 }
			cur1=cur1.next; 
		 }
	
		 
		 
		 cur=cur.next;
	 }
 }
 
//---------------
 
 public void remove_multiple_of_five() {
	
	 int count=countNode();
	 Node cur=head;
	 Node x=null;
	 Node z=null;
	 Node cur1=head;
	 int flag=0;
	 
	 for(int i=1;i<count;i++ ) {
		 
		 int y=cur.element;
		 
		 if(y%5!=0) {
			flag++;
			 Node n= new Node(y,null);
			 cur1.element=y;
			 cur1=cur1.next;
				/*
				 * if(flag==0) {
				 * 
				 * x=n; flag=1; z=x.next;
				 * 
				 * 
				 * }else {
				 * 
				 * z=n; z=z.next;
				 * 
				 * }
				 */
 
		 }

		 cur=cur.next;
		 }
	 
	 cur=head;
	 
	 for(int i=1;i<count;i++ ) {
		 if(flag+1==i) {
			 cur=null;
			 break;
		 }
		 
	cur=cur.next;	 
		 
	 }

 }
 
 
 
 
 
 
 
 
 
 
 
 

}
