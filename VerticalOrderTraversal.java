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
	public void printVerticalOrderTraversal(Node node){
		if(node==null)
			return;
		Queue<QItem> queue = new LinkedList<>();
		Map<Integer, ArrayList<Node>> map = new TreeMap<>();
		ArrayList<Node> l = new ArrayList<>();
		l.add(node);
		queue.add(new QItem(node, 0));
		map.put(0, l);
		while(!queue.isEmpty()){
			QItem qItem = queue.poll();
			Node temp = qItem.node;
			int thd = qItem.hd;
			if(temp.left!=null){
				int minHd = thd-1;
				if(map.containsKey(minHd)){
					ArrayList<Node> list = map.get(minHd);
					list.add(temp.left);
					map.put(minHd, list);
				}else{
					ArrayList<Node> list = new ArrayList<>();
					list.add(temp.left);
					map.put(minHd, list);
				}
				queue.add(new QItem(temp.left, minHd));
			}
			if(temp.right!=null){
				int maxHd = thd+1;
				if(map.containsKey(maxHd)){
					ArrayList<Node> list = map.get(maxHd);
					list.add(temp.right);
					map.put(maxHd, list);
				}else{
					ArrayList<Node> list = new ArrayList<>();
					list.add(temp.right);
					map.put(maxHd, list);
				}
				queue.add(new QItem(temp.right, maxHd));
			}
		}
		for(Map.Entry<Integer,ArrayList<Node>>entry: map.entrySet()){
			for(Node n : entry.getValue()){
				System.out.print(n.value + " ");
			}
			System.out.println();
		}

	}
}

class VerticalOrderTraversal{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		bt.printVerticalOrderTraversal(root);
	}
}