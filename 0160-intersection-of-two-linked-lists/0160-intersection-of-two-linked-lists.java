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

        /*Set<ListNode> nodeset = new HashSet<>();

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
        return null;*/


        //approach 3

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
    
        ListNode p = headA;
        while(p!=null){
            stack1.push(p);
            p = p.next;
        }

        p = headB;
        while(p!=null){
            stack2.push(p);
            p = p.next;
        }

        p = null;

        while(!stack1.isEmpty() && !stack2.isEmpty() && (stack1.peek() == stack2.peek())){
            p = stack1.pop();
            stack2.pop();
        }
        return p;

    }
}