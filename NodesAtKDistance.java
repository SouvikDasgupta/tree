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
	public void printNodes(Node node, int distance){
		if(node==null)
			return;
		if(distance==1){
			System.out.print(node.value + " ");
			return;
		}
		printNodes(node.left, distance-1);
		printNodes(node.right, distance-1);
	}
}
class NodesAtKDistance{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(8);
		root.left.left.right = new Node(10);
		BinaryTree bt = new BinaryTree();
		int distance = 4;
		bt.printNodes(root, distance);
	}
}