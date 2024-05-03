package fullhw7;

public class HW7 {
	public static void main(String[] args) {
		// Create a BST
		BST<String> tree = new BST<>();
		tree.insert("Joshua");
		tree.insert("Ramos");
		tree.insert("Kean");
		tree.insert("Union");
		tree.insert("New");
		tree.insert("Jersey");
		tree.insert("Avenel");

		// Traverse tree breadth-first
		System.out.print("\nPre-Order: ");
		tree.preorder();

		// Height of tree
		System.out.print("\nHeight of tree: ");	
		System.out.println(tree.height());

		// Create Integer BST
		Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
		BST<Integer> intTree = new BST<>(numbers);
		
		
		intTree.preorder();

		// Height of tree
		System.out.print("\nHeight of tree: ");	
		System.out.println(intTree.height());
	}
}