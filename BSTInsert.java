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
	public Node insert(Node node, int key){
		if(node==null){
			node = new Node(key);
			return node;
		}
		if(node.value > key){
			node.left = insert(node.left, key);
		}else if(node.value < key){
			node.right = insert(node.right, key);
		}
		return node;
	}

	public void inorder(Node node){
		if(node==null)
			return;
		Stack<Node> stack = new Stack<>();
		while(true){
			if(node!=null){
				stack.push(node);
				node = node.left;
			}else{
				if(stack.isEmpty()){
					break;
				}
				node = stack.pop();
				System.out.print(node.value + " ");
				node = node.right;
			}
		}
	}
}

class BSTInsert{
	public static void main(String[] args){
		Node root = new Node(25);
		root.left = new Node(15);
		root.right = new Node(50);
		root.left.left = new Node(10);
		root.left.right = new Node(22);
		root.left.left.left = new Node(4);
		root.left.left.right = new Node(12);
		root.left.right.left = new Node(18);
		root.left.right.right = new Node(24);
		root.right.left = new Node(35);
		root.right.right = new Node(70);
		root.right.left.left = new Node(31);
		root.right.left.right = new Node(44);
		root.right.right.left = new Node(66);
		root.right.right.right = new Node(90);
		BinaryTree bt = new BinaryTree();
		int key = 45;
		Node insert = bt.insert(root, key);
		bt.inorder(insert);
	}
}