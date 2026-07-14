class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1, c2 = l2;
        ListNode l3 = new ListNode(-1);
        ListNode c3 = l3;
        int carry = 0;
        while(c1 != null || c2 != null || carry>0){
            int sum = carry;
            sum += c1!=null ? c1.val : 0;
            sum += c2!=null ? c2.val : 0;
            c3.next = new ListNode(sum%10);
            carry = sum/10;
            c3 = c3.next;
            if(c2!=null) c2 = c2.next;
            if(c1!=null) c1 = c1.next;
        }
        return l3.next;
    }
}