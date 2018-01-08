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
	public int countLeafs(Node node){
		if(node==null)
			return 0;
		if(node.left==null && node.right==null)
			return 1;
		return countLeafs(node.left) + countLeafs(node.right);
	}
}

class CountLeafNodes{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		int leafCount = bt.countLeafs(root);
		System.out.println("Count of Leaf Nodes: " + leafCount);
	}
}