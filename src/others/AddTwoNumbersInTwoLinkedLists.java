package others;

/*
 *
 */
public class AddTwoNumbersInTwoLinkedLists {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode current = resultNode;
        int value1 = 0;
        int value2 = 0;
        int remainder = 0;

        while (l1 != null || l2 != null || remainder != 0) {


            if (l1 != null)
                value1 = l1.val;
            else
                value1 = 0;

            if (l2 != null)
                value2 = l2.val;
            else
                value2 = 0;
            int result = value1 + value2 + remainder;
            remainder = result / 10;

            current.next = new ListNode(result % 10);
            current = current.next;

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }
        return resultNode.next;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}


