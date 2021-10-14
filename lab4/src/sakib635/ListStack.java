package sakib635;

public class ListStack implements Stack{
	
	 int size;
	 Node top;
	  
	  
	  public ListStack(){
	    size = 0;
	    top = null;
	  }
	

	@Override
	public int size() {
	    int count = 0;
	    for(Node temp = top ; temp!=null ; temp = temp.next){
	      count++;
	    }
	    return count;
	}

	
	
	
	@Override
	public boolean isEmpty() {
		if(top==null){
		      return true;
		    }
		    return false;
	}

	
	
	@Override
	public void push(Object e) throws StackOverflowException {
			
			Node n = new Node (e , null);
		    n.next = top;
		    top = n;
		    size++;
		
	}

	
	
	
	@Override
	public Object pop() throws StackUnderflowException {
		  if(top==null){
		      throw new StackUnderflowException();
		    }
		    else{
		      
		      Node o = top;
		      top = top.next;
		      o.next = null;
		      size--;
		      return o.val;
		    }
	}

	
	
	
	@Override
	public Object peek() throws StackUnderflowException {
		 if(top==null){
		      throw new StackUnderflowException();
		    }  
		    return top.val;
	}

	
	
}
