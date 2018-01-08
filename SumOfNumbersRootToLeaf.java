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
	public int totalSum(Node node, int val){
		if(node == null)
			return 0;
		val = 10*val + node.value;
		if(node.left==null && node.right==null){
			return val;
		}
		return totalSum(node.left, val) + totalSum(node.right, val);

	}
}
class SumOfNumbersRootToLeaf{
	public static void main(String[] args){
		Node root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(5);
        root.right.right = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.left.right.right = new Node(4);
        root.left.right.left = new Node(7);
        BinaryTree bt = new BinaryTree();
       int sum = bt.totalSum(root, 0);
       System.out.println("Total sum" + sum);
	}
}