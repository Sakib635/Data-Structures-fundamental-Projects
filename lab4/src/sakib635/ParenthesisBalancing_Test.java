package sakib635;

import java.util.Scanner;

public class ParenthesisBalancing_Test {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a statement: ");
		String statement= sc.nextLine(); 
		int count=0;
		
		
		  ArrayStack Astack = new ArrayStack();
		  ListStack  Lstack = new ListStack();
		  
		  
		  
		  ArrayStack countStack = new ArrayStack(); // for tracking error position 
		  
		  System.out.println("Enter 1 for ArrayStack\nEnter 2 for ListStack  ");
		  int choice= sc.nextInt(); 
		  

if(choice==1) {	
	
		try{
			
			for(int i=0;i<statement.length();i++) {
				count++;
				
				if(statement.charAt(i)=='(') {
					
					Astack.push(statement.charAt(i));
					countStack.push(count);
				
				}else if(statement.charAt(i)=='{') {
					
					Astack.push(statement.charAt(i));
					countStack.push(count);
					
				}else if(statement.charAt(i)=='[') {
					
					Astack.push(statement.charAt(i));
					countStack.push(count);
				}
				
				else {
					
					
					
					
					if(statement.charAt(i)==')') {
						
						if(Astack.size()!=0) {
							if(Astack.peek().equals('(')) {
								Astack.pop();
								countStack.pop();
								
							}else {
								
								break;
							}
						}else {
							System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+count+". '"+')'+"' - not opened.");
							return;
						}
					
					}
					
					
					else 	if(statement.charAt(i)=='}') {
						
						if(Astack.size()!=0) {
							if(Astack.peek().equals('{')) {
								Astack.pop();
								countStack.pop();
								
							}else {
								
								break;
							}
						}else {
							System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+count+". '"+'}'+"' - not opened.");							return;
						}
					
					}
					
					
					else 	if(statement.charAt(i)==']') {
						if(Astack.size()!=0) {
							
							if(Astack.peek().equals('[')) {
								
								Astack.pop();
								countStack.pop();
								
							}else {
								
								break;
							}
						}else {
							System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+count+". '"+']'+"' - not opened.");
							return;
						}
					}
					
				}
				
				
			}
			
			if(Astack.isEmpty()) {
				System.out.println(statement+"\nThis expression is correct.");
			}else {
				System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+countStack.pop()+". '"+Astack.peek()+"' - not closed.");
			}
	
	
		}
		
		catch(Exception e){
			System.err.println(e);
		}
		
		
}else if (choice==2) {	
	
		try{
			
			for(int i=0;i<statement.length();i++) {
				count++;
				
				if(statement.charAt(i)=='(') {
					
					Lstack.push(statement.charAt(i));
					countStack.push(count);
				
				}else if(statement.charAt(i)=='{') {
					
					Lstack.push(statement.charAt(i));
					countStack.push(count);
					
				}else if(statement.charAt(i)=='[') {
					
					Lstack.push(statement.charAt(i));
					countStack.push(count);
				}
				
				else {
					
					
					
					
					if(statement.charAt(i)==')') {
						
						if(Lstack.size()!=0) {
							if(Lstack.peek().equals('(')) {
								Lstack.pop();
								countStack.pop();
								
							}else {
								
								break;
							}
						}else {
							System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+count+". '"+')'+"' - not opened.");
							return;
						}
					
					}
					
					
					else 	if(statement.charAt(i)=='}') {
						
						if(Lstack.size()!=0) {
							if(Lstack.peek().equals('{')) {
								Lstack.pop();
								countStack.pop();
								
							}else {
								
								break;
							}
						}else {
							System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+count+". '"+'}'+"' - not opened.");							return;
						}
					
					}
					
					
					else 	if(statement.charAt(i)==']') {
						if(Lstack.size()!=0) {
							
							if(Lstack.peek().equals('[')) {
								
								Lstack.pop();
								countStack.pop();
								
							}else {
								
								break;
							}
						}else {
							System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+count+". '"+']'+"' - not opened.");
							return;
						}
					}
					
				}
				
				
			}
			
			if(Lstack.isEmpty()) {
				System.out.println(statement+"\nThis expression is correct.");
			}else {
		     	System.out.println(statement+"\nThis expression is NOT correct.\n"+"Error at character # "+countStack.pop()+". '"+Lstack.peek()+"' - not closed.");
			}
	
	
		}
		
		catch(Exception e){
			System.err.println(e);
		}
	}else {
		return;
	}

	



	}

}
