import java.util.Queue;
import java.util.LinkedList;
class Node{
	public int value;
	public Node left;
	public Node right;
	public Node next;
	public Node(int  value){
		this.value = value;
		this.left = null;
		this.right = null;
		this.next = null;
	}
}

class BinaryTree{
	public void connectNodes(Node node){
		if(node == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		queue.add(null);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			if(temp!=null){
				temp.next = queue.peek();
				if(temp.left!=null){
					queue.add(temp.left);
				}
				if(temp.right!=null){
					queue.add(temp.right);
				}
			}else if(!queue.isEmpty()){
				queue.add(null);
			}
		}

		inorder(node);
	}

	public void inorder(Node node){
		if (node==null)
			return;
		inorder(node.left);
		if(node.next!=null){
			System.out.println(node.value+ " ------> " + node.next.value);
		}else{
			System.out.println(node.value+ " ------> " + null);
		}
		inorder(node.right);
	}
}

class ConnectLevelNodes{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		bt.connectNodes(root);
	}
}