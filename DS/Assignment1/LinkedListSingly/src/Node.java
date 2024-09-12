@SuppressWarnings("hiding")
public class Node<Integer> {
	public Integer nodeValue;
	public Node<Integer> next;

	Node() {
		nodeValue = null;
		next = null;
	}

	Node(Integer item) {
		nodeValue = item;
		next = null;
	}

}
