package topInterviewEasy.LinkedList;

public class DeleteNodeSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    class ListNode { 
    	int val; 
    	ListNode next; 
    	ListNode(int x) { 
    		val = x; 
    	}
    }

}
