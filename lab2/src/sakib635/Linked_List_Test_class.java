package sakib635;

public class Linked_List_Test_class {

	public static void main(String[] args) {
		int [] source= {30,10,20,50,60,40};
		// First Constructor:
		MyLinkedList list1=new MyLinkedList(source);
		
		// Second Constructor:
		MyLinkedList list2=new MyLinkedList(list1);
		
		// Third Constructor:
		MyLinkedList list3=new MyLinkedList();
		
		System.out.println("TASK:- All the cinstructed list using three constructors\n");
		list1.showList();
		list2.showList();
		list3.showList();
		
		//Returns true if a list is empty. Otherwise, returns false.
		System.out.println("\nTASK:- Returns true if a list is empty. Otherwise, returns false\n");
		
		boolean a=list3.isEmpty();
		System.out.println(a);
		
		boolean a1=list1.isEmpty();
		System.out.println(a1);
		
		
		System.out.println("\nTASK:- Removing all the elements from a list\n");
		//Removes all the elements from a list
		list2.clear();
		list2.showList();
		
		
		System.out.println("\nTASK:- inserting newElement at the tail of the list\n");
		//This method inserts newElement at the tail of the list.
		Node newNode1=new Node(60,null);
		
		list1.insert(newNode1);
		list1.showList();
		
		Node newNode2=new Node(70,null);
		list1.insert(newNode2);
		list1.showList();
		
		
		System.out.println("\nTASK:- inserting newElement at the given index of the list\n");
		//This method inserts newElement at the given index of the list
		list1.insert(34,2);
		list1.showList();
		
		// Removes the element from a list that contains the deleteKey and returns the deleted key value.
		System.out.println("\nTASK:- Removing the element from a list that contains the deleteKey\n");
		
		int deletedValue=list1.NodeRemove (34);
		System.out.println("Deleted value is: "+deletedValue);
		list1.showList();
		
		int deletedValue2=list1.NodeRemove (80);
		System.out.println("Deleted value is: "+deletedValue2);
		list1.showList();
		
		
		
		//     TASK- 3 .............
		
		// a function to find out the even numbers that are present in the list and output another list with those numbers.
		System.out.println("\n\n\n\n\nTASK-1:-  List of even numbers that are present in the list\n");
		MyLinkedList list4=list1.evenlist();
		list4.showList();
		
		
		//a function to find out if the element is in the list or not
		System.out.println("\nTASK-2:- Finding out if the element is in the list or not\n");
		
		System.out.println(list1.contains(20));
		System.out.println(list1.contains(80));
		
		
		//A function to reverse the list.
		System.out.println("\nTASK-3:- reverse the list.\n");
		
		list1.reverselist();
		list1.showList();
		
		
		//A function to sort the list. 
		System.out.println("\nTASK-4:- sort the list.\n");
		
		list1.sortList();
		list1.showList();
		
		
		//A function that prints the sum of the values in the list. 
		System.out.println("\nTASK-5:- Prints the sum of the values in the list\n");
		
		list1.sum();
		
		
		//A function that rotates the elements of the list k times.
		System.out.println("\nTASK-6:-  rotates the elements of the list k times left or right.\n");
		
		list1.showList();
		
		list1.rotatelist("right",2);
		list1.showList();
		
		list1.rotatelist("left",3);
		list1.showList();
		
		//----------------
		
		int [] s= {6,6,10,10,1,1};
		// First Constructor:
		System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		
		MyLinkedList l=new MyLinkedList(s);
		l.showList();
		Node x=l.head;
		l.remove_multiple_of_five();
		l.showList();
		//.................................
		
		
	}

}
