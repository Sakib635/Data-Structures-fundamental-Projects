package sakib635;

public class circularLinkedListTester {

	public static void main(String[] args) {
		
		int [] a = {10,15,20,25,30,35,40};
		
		//First Constructor creates a linked list using the values from the given array.
		DoublyList list1 = new DoublyList(a);
		
		//Outputs the keys of the elements of the order list
		System.out.println("Task- 2.1 & 2.2 -creates a linked list & shows all elements-------------\n");
		
		list1.showList();
		
		
		//This method inserts newElement at the tail of the list.If an element with the same key as newElement value already exists in the list
		System.out.println("\nTask- 2.3 -inserts newElement at the tail of the list-------------\n");
		Node t = new Node(55 , null , null);
		list1.insert(t);
		list1.showList();
		
		Node t1 = new Node(30 , null , null);
		list1.insert(t1);
		list1.showList();
		
		//This method inserts newElement at the given index of the list. If an element with the same key as newElement value already exists in the list
		System.out.println("\nTask- 2.4 -inserts newElement at the given index of the list-------------\n");
		list1.insert (30,3);
		list1.showList();
		
		list1.insert (33,3);
		list1.showList();
		
		//This method removes the Node at the given index of the list.
		System.out.println("\nTask- 2.5 -removes the Node at the given index of the list-------------\n");
		list1.remove(3);
		list1.showList();
		
		
		 //This method removes the element from a list that contains the deleteKey and returns the deleted key value.   
		System.out.println("\nTask- 2.6 -removes the element from a list that contains the deleteKey-------------\n");
		int s= list1.removeKey(25);
		System.out.println("Removed element is "+s);
		list1.showList();
		
		
	}

}
