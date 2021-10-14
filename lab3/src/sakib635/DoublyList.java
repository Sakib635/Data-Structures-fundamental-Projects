package sakib635;

public class DoublyList {
	public Node head;
	
	
// First Constructor:
//Creates a linked list using the values from the given array.
	public DoublyList(int [] a){
	    head = new Node(0, null, null);
	    Node tail = head;
	    
	    for(int i = 0; i<a.length; i++){
	      Node x = new Node(a[i], null, null);
	      tail.next = x;
	      x.prev=tail;
	      tail=tail.next;
	    }
	    tail.next=head;  // For making it a circular linkedList
	    head.prev=tail;
	  }

	
//Outputs the keys of the elements of the order list. If the list is empty, outputs “Empty list”.
	public void showList ( ) {
	    Node temp = head;
	    if(head==null) {
	    	System.out.println("Empty list");
	    }else {
	    
		    for(temp = temp.next ; temp.next!=head ; temp = temp.next){
		      System.out.print(temp.element+", ");
		    }
		    System.out.println(temp.element);
	    }
	}
	
 // This method counts the number of Nodes in the LinkedList 
	  public int countNode(){
	    Node temp = head;
	    int count = 0;
	    while(temp.next!=head){
	      count++;
	      temp = temp.next;
	    }
	    
	    return count; 
	  }
	
// This method inserts newElement at the tail of the list.
//If an element with the same key as newElement value already exists in the list
  public void insert (Node newElement){
	   	int count=countNode();
	
	    Node x = null;
	    Node y = null;
	    Node temp = head;  
	    int flag =0;
	    
	      for(int i = 0 ; i<=count ; i++){
	        if(temp.element==newElement.element) {
	        	System.out.println("\n"+newElement.element+" already exists & does not insert the key.\n");
	        	flag=1;
	        	break;
	        }
	    	  
	    	temp = temp.next;
	      }
	      if(flag!=1) {
	    	  System.out.println("\nValue "+newElement.element+" Inserted.\n");
	    	  x = temp.prev;
		      y = temp;
		      x.next = newElement;
		      newElement.next = y;
		      newElement.prev = x;
		      y.prev = newElement;
	      }
	      
  }    
		      
//This method inserts newElement at the given index of the list. 
//If an element with the same key as newElement value already exists in the list	      
    public void insert (int newElement, int index) {
    	int count=countNode();
    	Node n = new Node(newElement , null , null);
	    Node x = null;
	    Node y = null;
	    Node temp = head;  
	    int flag =0;
	    
	    
	    for(int i = 0 ; i<=count ; i++){
	        if(temp.element==n.element) {
	        	System.out.println("\n"+n.element+" already exists & does not insert the key.\n");
	        	flag=1;
	        	break;
	        }
	        temp = temp.next;
	    }
	    

	    
	    if(flag!=1) {  
		    	
		      for(int j = 1 ; j<=index ; j++){
			        if(temp.element==n.element) {
			        	break;
			        }
			    	  
			    	temp = temp.next;
		      }
	      
	    	  System.out.println("\nValue "+n.element+" Inserted at position "+index+"\n");
	    	  x = temp.prev;
		      y = temp;
		      x.next = n;
		      n.next = y;
		      n.prev = x;
		      y.prev = n;
	
	    }
	  
    }
    
    
// This method removes the Node at the given index of the list.
//If an element with the same key as newElement value already exists in the list	
    public void remove(int index){
        Node cur = head;
        int count = countNode();
        Node x = null;
        Node z = null;
        
        if(index<0 || index>count){
        	System.out.println("\nInvalid index\n");
        }
        else{
          for(int i = 1 ; i<=index ; i++){
        	  cur = cur.next;
          }
          System.out.println("\n"+cur.element+" removed from position "+index+"\n");
          x = cur.prev;
          z = cur.next;
          x.next = z;
          z.prev = x;
          
        }
        
        
        
      }

    
 //This method removes the element from a list that contains the deleteKey and returns the deleted key value.   
    public int removeKey(int deleteKey) {
    	 Node cur = head;
         int count = countNode();
         int temp = 0;
        
     
           for(int i = 1 ; i<=count ; i++){
         	  if(cur.element==deleteKey) {
         		 temp=cur.element;
         		  cur.element=0;
         		  break;
         	  }
        	   cur = cur.next;
           }
           return temp;
    	
    }

}
