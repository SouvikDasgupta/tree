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
	Node maxNode = null;
	int maxSum = Integer.MIN_VALUE;

	public void maxSum(Node root){
		getTarget(root, 0);
		System.out.println("Max Sum = "+ maxSum);
		System.out.println("Target Node = " + maxNode.value);
		printPath(root);
	}

	public void getTarget(Node node, int curSum){
		if(node==null)
			return;
		curSum = curSum + node.value;
		if(node.left==null && node.right==null){
			if(curSum > maxSum){
				maxSum = curSum;
				maxNode = node;
			}
		}
		getTarget(node.left, curSum);
		getTarget(node.right, curSum);

	}

	public boolean printPath(Node node){
		if(node==null)
			return false;
		if(node.value == maxNode.value || printPath(node.left) || printPath(node.right)){
			System.out.print(node.value + " ");
			return true;
		}
		return false;
	}
}

class MaxSumRootToLeaf{
	public static void main(String[] args){
		Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        BinaryTree bt = new BinaryTree();
        bt.maxSum(root);
	}
}