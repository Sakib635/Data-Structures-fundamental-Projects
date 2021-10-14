package sakib635;

public class Queue implements qMethods{

	  int size;
	  Object [] QueueArray;
	  
	  public Queue() {
		   size=0;
		   QueueArray = new Object[20];
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
	public void enquque(Object e) {
		if(QueueArray.length == size){
			System.out.print("overFlow");
			return;
	    }
	   
		QueueArray[size] = e;
        size++;
	  
		
	}

	@Override
	public Object dequeue() {
		if(size==0) {
			System.out.print("underFlow");
			return null;	
		}
		Object temp=QueueArray[0];
		for(int i=1;i<QueueArray.length;i++) {
			QueueArray[i-1]=QueueArray[i];
			QueueArray[i]=null;
		}
		return temp;
	
	}

	@Override
	public Object peek() {
		if(size==0) {
			System.out.print("underFlow");
			return null;	
		}
		   
		     Object value = QueueArray[0];
		     return value;
		    
	}
	

}
