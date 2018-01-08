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
	public int printLevel(Node node, int key, int level){
		if(node==null)
			return 0;
		if(node.value == key)
			return level;
		int downlevel = printLevel(node.left, key, level+1);
		if(downlevel!=0)
			return downlevel;
		return printLevel(node.right, key, level+1);
	}
}

class PrintLevelOfNode{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		int level = bt.printLevel(root, 6, 1);
		System.out.println("Level = " + level);
	}
}