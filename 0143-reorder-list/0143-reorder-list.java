class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return;
        ListNode curr = head;
        while (curr != null && curr.next != null && curr.next.next != null) {
            ListNode lastPrev = curr;
            while (lastPrev.next.next != null) {
                lastPrev = lastPrev.next;
            }
            ListNode last = lastPrev.next;
            lastPrev.next = null; 
            last.next = curr.next;
            curr.next = last;
            curr = last.next;
        }
    }
}