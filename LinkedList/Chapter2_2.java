/**
 * Implement an algorithm to find the kth to last last element of a single linked list
 */

public class Chapter2_2 {
    public static void main(String[] args) {

    }

    public Node lastKthElement(Node head, int k) {
        Node kth = head;
        Node last = head;

        int i = 1;
        for (; i < k && last != null; i++) {
            last = last.next;
        }

        if (last == null && i < k) {
            return null;
        }

        while (last != null) {
            kth = kth.next;
            last = last.next;
        }

        return kth;
    }
}