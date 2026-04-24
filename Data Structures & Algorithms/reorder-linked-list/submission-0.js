/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {void}
     */
    reorderList(head) {
        let slow = head;
        let fast = head.next;

        while (fast?.next) {
            slow = slow.next;
            fast = fast.next.next;
        }

        let second = slow.next;
        slow.next = null;
        second = this.reverseList(second);
        let first = head;

        while (second != null) {
            let tmp1 = first.next;
            let tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }

        return head;
    }

    reverseList(node) {
        let prevNode = null;
        while (node != null) {
            let tempNode = node.next;
            node.next = prevNode;
            prevNode = node;
            node = tempNode;
        }

        return prevNode;
    }
}
