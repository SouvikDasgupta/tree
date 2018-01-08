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
	public void printCousins(Node root, Node key){
		int level = getLevel(root, key, 1);
		printCousinUtility(root, key, level);
	}

	public int getLevel(Node node, Node key, int level){
		if(node==null)
			return 0;
		if(node.value == key.value)
			return level;
		int downLevel = getLevel(node.left, key, level+1);
		if(downLevel!=0)
			return downLevel;
		return getLevel(node.right, key, level+1);
	}

	public void printCousinUtility(Node node, Node key, int level){
		if(node==null || level < 2)
			return;
		if(level==2){
			if(node.left == key || node.right==key)
				return;
			if(node.left!=null)
				System.out.print(node.left.value + " ");
			if(node.right!=null)
				System.out.print(node.right.value + " ");
		}
		else if(level > 2){
			printCousinUtility(node.left, key, level-1);
			printCousinUtility(node.right, key, level-1);
		}
	}
}

class PrintCousins{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		Node key = root.right.right;
		bt.printCousins(root, key);
	}
}