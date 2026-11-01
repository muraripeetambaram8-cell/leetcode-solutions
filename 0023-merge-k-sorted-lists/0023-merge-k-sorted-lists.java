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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode result = null;
        for(int i=0;i<lists.length;i++){
            result=merge(result,lists[i]);
        }
        return result;
    }
    public ListNode merge(ListNode node1,ListNode node2){
        if(node1==null){
            return node2;
        }
        if(node2==null){
            return node1;
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(node1!=null&&node2!=null){
            if(node1.val>=node2.val){
                temp.next=node2;
                node2=node2.next;
            }else{
                temp.next=node1;
                node1=node1.next;
            }
            temp=temp.next;
        }
       if(node1!=null){
        temp.next=node1;
       }else{
        temp.next=node2;
       }
        return dummy.next;
    }
}