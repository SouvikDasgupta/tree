// class Node{
// 	public int value;
// 	public Node left;
// 	public Node right;
// 	public Node(int value){
// 		this.value = value;
// 		this.left = null;
// 		this.right = null;
// 	}
// }

// class BinaryTree{
// 	int total = 0;
// 	public int sumOfLeftLeaf(Node node){
// 		if(node == null)
// 			return 0;
// 		if(node.left!=null && node.left.left == null && node.left.right == null){
// 			total = total + node.left.value;
// 		}
// 		return sumOfLeftLeaf(node.left) + sumOfLeftLeaf(node.right);
// 	}
// }

// class SumLeftLeaf{
// 	public static void main(String[] args){
// 		Node root = new Node(3);
// 		root.left = new Node(9);
// 		root.right = new Node(20);
// 		root.right.left = new Node(15);
// 		root.right.right = new Node(7);
// 		BinaryTree bt = new BinaryTree();
// 		int sum = bt.sumOfLeftLeaf(root);
// 		System.out.println("Sum of left leaves = " + sum);
// 	}
// }