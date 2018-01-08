import java.util.*;
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

class QItem{
	public int level;
	public Node node;
	public QItem(Node node, int level){
		this.node = node;
		this.level = level;
	}
}

class BinaryTree{
	public void printLeftView(Node node){
		if(node == null)
			return;
		Queue<QItem> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		queue.add(new QItem(node, 1));
		while(!queue.isEmpty()){
			QItem temp = queue.poll();
			Node tNode = temp.node;
			int tLevel = temp.level;
			if(!set.contains(tLevel)){
				System.out.print(tNode.value + " ");
				set.add(tLevel);
			}
			if(tNode.left!=null){
				queue.add(new QItem(tNode.left, tLevel+1));
			}
			if(tNode.right!=null){
				queue.add(new QItem(tNode.right, tLevel+1));
			}
		}
	}
}

class LeftViewTraversal{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.right.left = new Node(8);
		BinaryTree bt = new BinaryTree();
		bt.printLeftView(root);
	}
}