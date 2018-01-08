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
	public void printRightView(Node node){
		if(node==null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			int n = queue.size();
			for(int i=1; i<=n;i++){
				Node temp = queue.poll();
				if(i==n){
					System.out.print(temp.value + " ");
				}
				if(temp.left!=null){
					queue.add(temp.left);
				}
				if(temp.right!=null){
					queue.add(temp.right);
				}
			}
		}
	}

}
class RightView{
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
		bt.printRightView(root);
	}
}