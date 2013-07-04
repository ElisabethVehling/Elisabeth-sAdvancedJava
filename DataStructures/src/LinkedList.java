
public class LinkedList {
	ListNode first;
	
	public LinkedList(){
		
	}
public void add(int number) {	
	if (first == null) {
		first = new ListNode(number);
		first.setValue(number);
	}
	else{
		ListNode temp = first;
		while (temp.getNext()!= null){
			temp = temp.getNext();
		}
		
		ListNode newNode = new ListNode(number);
		newNode.setValue(number);
		temp.setNext(newNode);
		}
}
public void removeFirst(){
	first  = first.getNext();
}

public void removeLast() {
	
}

public void removeNth(int n) {
	if (n == 0){
		first = first.getNext();
		return;
	}
	if (n == size()) {
	}
	if (n == size()-1){
		
	}
	int position = 0;
	ListNode temp = first;
	while (position < n-1) {
		temp = temp.getNext();
	}
	temp.setNext(temp.getNext().getNext());
}

public void remove(int number){
	if (first.getValue() == number){
		first = first.getNext();}
		ListNode a = first;
		ListNode b = first.getNext();
		while (b != null){
			if (a.getValue() == number){
			a.setNext(b.getNext());
			b= b.getNext();
		}	
		a = a.getNext();
		 b= b.getNext();
		}
		if (b != null) b = b.getNext();{
	a = a. getNext();
		}

	}
		
	
ListNode temp = first;
	

public void print(int number){
	ListNode temp = first;
	System.out.print("[");
	while(temp != null){
		System.out.print(temp.getValue()+ ",");
		temp = temp.getNext();
	}
	System.out.println("]");
		
	}
	
	//print out a node
	//ask for next value
	//repeat 1

public int size(){
	int size = 0;
	ListNode temp = first;
	while (temp != null){
		size++;
		temp= temp.getNext();
	}
	//do something that increments size for each node
	return size;
}

}

