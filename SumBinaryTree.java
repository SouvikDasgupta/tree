import java.util.Queue;
import java.util.LinkedList;
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
	public boolean isSumTree(Node node){
		if(node==null)
			return false;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			int left = 0;
			int right = 0;
			if(temp.left!=null){
				left = temp.left.value;
				queue.add(temp.left);
			}
			if(temp.right!=null){
				right = temp.right.value;
				queue.add(temp.right);
			}
			if(left+right != temp.value && (temp.left!=null && temp.right!=null))
				return false;
		}
		return true;
	}
}

class SumBinaryTree{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.left.left.left = new Node(2);
		root.left.left.right = new Node(1);
		root.left.right.left = new Node(3);
		root.left.right.right = new Node(2);
		root.right.right = new Node(2);
		BinaryTree bt = new BinaryTree();
		boolean result = bt.isSumTree(root);
		System.out.println("Is Binary tree a Sum Tree: " + result);
	}
}