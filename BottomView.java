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
	public Node node;
	public int hd;
	public QItem(Node node, int hd){
		this.node = node;
		this.hd = hd;
	}
}

class BinaryTree{
	public void printBottomView(Node node){
		if(node==null)
			return;
		Queue<QItem> queue = new LinkedList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		queue.add(new QItem(node, 0));
		while(!queue.isEmpty()){
			QItem qTemp = queue.poll();
			Node tNode = qTemp.node;
			int tHd = qTemp.hd;
			map.put(tHd, tNode.value);
			if(tNode.left!=null){
				queue.add(new QItem(tNode.left, tHd-1));
			}
			if(tNode.right!=null){
				queue.add(new QItem(tNode.right, tHd+1));
			}
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			System.out.print(entry.getValue() + " ");
		}
	}
}

class BottomView{
	public static void main(String[] args){
		Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
		BinaryTree bt = new BinaryTree();
		bt.printBottomView(root);
		System.out.println();
	}
}