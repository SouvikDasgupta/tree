class Node{
	public int value;
	public Node left;
	public Node right;

	public Node(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree{
	public boolean printAncestors(Node node, int key){
		if(node == null)
			return false;
		if(node.value == key){
			return true;
		}
		if(printAncestors(node.left, key) || printAncestors(node.right, key)){
			System.out.print(node.value + " ");
			return true;
		}
		return false;
	}
}

class PrintAncestors{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		int key = 7;
		boolean result = bt.printAncestors(root, key);
	}
}