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
	int leafLevel = 0;
	public boolean isLeafAtSameLeve(Node node){
		return checkLeafLevels(node, 1);
	}

	public boolean checkLeafLevels(Node node, int level){
		if(node==null)
			return true;
		if(node.left==null && node.right==null){
			if(leafLevel == 0){
				leafLevel = level;
				return true;
			}
			return level == leafLevel;
		}
		return checkLeafLevels(node.left, level+1) && checkLeafLevels(node.right, level+1);
		
	}
}

class LeafAtSameLevel{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.right = new Node(8);

		BinaryTree bt = new BinaryTree();
		boolean res = bt.isLeafAtSameLeve(root);
		System.out.println("Are leafs at same level : " + res);
	}
}