/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*ListNode p1= headA;
        ListNode p2= headB;

        while(p1!=p2){
            if(p1==null){
                p1= headA;
            }
            else{
                p1= p1.next;
            }

             if(p2==null){
                p2= headB;
            }
            else{
                p2= p2.next;
            }

        }
        return p1;*/

        //approach 2

        Set<ListNode> nodeset = new HashSet<>();

        ListNode nodeA= headA;
        while(nodeA != null){
            nodeset.add(nodeA);
            nodeA=nodeA.next;
        }

        ListNode nodeB=headB;
        while(nodeB!=null){
            if(nodeset.contains(nodeB)){
                return nodeB;
            }
            nodeB=nodeB.next;
        }
        return null;
    }
}