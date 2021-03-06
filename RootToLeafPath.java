import java.util.Stack;
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
	Stack<Integer> stack = new Stack<>();
	public void rootToLeaf(Node node){
		if(node==null)
			return;
		stack.push(node.value);
		rootToLeaf(node.left);
		if(node.left==null && node.right==null)
			System.out.println(stack);
		rootToLeaf(node.right);
		stack.pop();
	}
}

class RootToLeafPath{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		bt.rootToLeaf(root);
	}
}