/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        int count = 0;

        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }

        int mid;
        // if(count%2==1)
        // {
        //     mid = count/2;
        // }
        // else
        {
            mid = (count/2) + 1; 
        }

        temp = head;
        count = 0;
        while(temp!=null)
        {
            count++;
            if(count==mid)
            {
                return temp;
            }
            temp = temp.next;
        }

        return temp;
        
    }
}