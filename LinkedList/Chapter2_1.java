/*
Write code to remove duplicates from an unsorted linked list. 
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
SOLUTION
*/

public class Chapter2_1 {
	public static void main(String[] args) {

	}
	//hashtable solution O(n)
	public void removeDuplicate(Node node) {
		Hashtable hs = new Hashtable();
		Node previousNode = null;
		while(node != null) {
			if(hs.containsKey(node.data)) {
				previousNode.next = node.next;
			} else {
				hs.put(n.data, true);
				previous = n;
			}
			node = node.next;
		}
	}

	//follow up solution without temp buffer, O(n2)
	public void removeDuplicate(Node n) {
		if (n == null) {
			return;
		}
		Node current = n;

		while(current != null) {
			Node runner = current; //like previous
			while(runner.next != null) {
				if(runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}

	}
}
























