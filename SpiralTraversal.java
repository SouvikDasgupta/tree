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
	public void printSpiralTraversal(Node node){
		if(node==null)
			return;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(node);
		while(!s1.isEmpty() || !s2.isEmpty()){
			while(!s1.isEmpty()){
				Node temp = s1.pop();
				System.out.print(temp.value + " ");
				if(temp.left!=null)
					s2.push(temp.left);
				if(temp.right!=null)
					s2.push(temp.right);
			}
			while(!s2.isEmpty()){
				Node temp = s2.pop();
				System.out.print(temp.value + " ");
				if(temp.right!=null)
					s1.push(temp.right);
				if(temp.left!=null)
					s1.push(temp.left);
			}
		}
	}
}

class SpiralTraversal{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		bt.printSpiralTraversal(root);
	}
}