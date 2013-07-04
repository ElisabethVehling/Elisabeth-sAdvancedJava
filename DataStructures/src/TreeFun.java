
public class TreeFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.add(4);
		tree.add(7);
		tree.add(2);
		tree.add(10);
		tree.add(8);
		tree.add(11);
		tree.add(1);
		tree.add(3);
		tree.add(5);
		tree.add(6);
		tree.add(9);

		tree.print();
		System.out.println("Tree contains 11? "+ tree.contains(11));
	}

}
