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
	int sum = 0;
	public void pathSum(Node node, int key){
		if(node==null)
			return;
		sum = sum + node.value;
		stack.push(node.value);
		if(sum == key){
			System.out.println(stack);
		}
		pathSum(node.left, key);
		pathSum(node.right, key);
		sum = sum - node.value;
		stack.pop();
	}
}

class PathSum{
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
		bt.pathSum(root, key);
	}
}