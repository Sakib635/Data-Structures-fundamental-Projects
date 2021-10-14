package sakib635;

public class ArrayStack implements Stack{
	  int size;
	  Object [] StackArray;

	
	  
    public ArrayStack() {
	   size=0;
	   StackArray = new Object[20];
	}

	
	
	@Override
	public int size() {
		return size;
	}

	
	
	@Override
	public boolean isEmpty() {
	    boolean x = false;
	    if(size==0){
	      x = true;
	    }
	    return x;
	}

	
	
	@Override
	public void push(Object e) throws StackOverflowException{
		if(StackArray.length == size){
			throw new StackOverflowException();
	    }else {
	   
		StackArray[size] = e;
        size++;
	    }
	
	}

	
	
	@Override
	public Object pop() throws StackUnderflowException{
		if(size==0){
			throw new StackUnderflowException();
		    }else {
		   
		      Object value = StackArray[size-1];
		      StackArray[size-1] = null;
		      size--;
		      return value;
		    }
		    
	}

	
	
	@Override
	public Object peek() throws StackUnderflowException{
		if(size==0){
			throw new StackUnderflowException();
		    }else {
		   
		     Object value = StackArray[size-1];
		     return value;
		    }
	}

}
