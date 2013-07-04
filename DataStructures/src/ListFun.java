
public class ListFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		list.print(7);
		list.print(9);
		list.print(0);
		System.out.print("This list size is " + list.size() + ".");
		// TODO Auto-generated method stub
		list.remove(4);
		list.print(0);
		
		list.remove(5);
		list.print(0);

	}

}
