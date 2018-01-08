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
	public int sizeOfBt(Node node){
		if(node==null)
			return 0;
		return 1+sizeOfBt(node.left)+sizeOfBt(node.right);
	}
}

class SizeOfBT{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		int size = bt.sizeOfBt(root);
		System.out.println("Size of Binary tree " + size);
	}
}