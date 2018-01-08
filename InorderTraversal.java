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
	public void inorderTraversal(Node node){
		if(node==null)
			return;
		Stack<Node> stack = new Stack<>();
		while(true){
			if(node!=null){
				stack.push(node);
				node = node.left;
			}else{
				if(stack.isEmpty())
					break;
				node = stack.pop();
				System.out.print(node.value + " ");
				node = node.right;
			}
		}
	}
}

class InorderTraversal{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		bt.inorderTraversal(root);
	}
}