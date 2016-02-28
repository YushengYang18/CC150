/**
 * Implement an algorithm to delete the middle of a singly linked list, given
 * only access to that node
 */

public class Chapter2_3 {
    public void deleteMiddle(Node mid) {
        if (mid == null || mid.next == null) {
            return;
        }

        mid.data = mid.next.data;
        mid.next = mid.next.next;
    }
}