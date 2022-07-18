package LinkedList;

public class ReverseList {

		 
	    private Node head;
	 
	    private static class Node {
	    	
	        private int val;
	        private Node next;
	 
	        Node(int val) {
	            this.val = val;
	 
	        }
	    }
	 
	    public void addToLastNode(Node node) {
	 
	        if (head == null) {
	            head = node;
	        } else {
	            Node temp = head;
	            while (temp.next != null)
	                temp = temp.next;
	 
	            temp.next = node;
	        }
	    }
	 
	    public void printList(Node head) {
	    	
	        Node temp = head;
	        while (temp != null) {
	            System.out.format("%d ", temp.val);
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	 
	    public static Node reverseLinkedList(Node currentNode)
	    {
	        Node preNode=null;
	        Node nextNode;
	        
	        while(currentNode != null)
	        {
	            nextNode=currentNode.next;
	            currentNode.next=preNode;
	            preNode=currentNode;
	            currentNode=nextNode;
	            
	        }
	        return preNode;
	    }
	 
	    public static void main(String[] args) {
	    	
	    	ReverseList list = new ReverseList();
	    	
	    	 System.out.println("Original List");
	     
	        Node head=new Node(7);
	        list.addToLastNode(head);
	        list.addToLastNode(new Node(3));
	        list.addToLastNode(new Node(8));
	        list.addToLastNode(new Node(4));
	        list.addToLastNode(new Node(5));
	 
	        list.printList(head);
	       
	        Node reverseHead=reverseLinkedList(head);
	        System.out.println("After reversing");
	        list.printList(reverseHead);
	 
	    }
	 
	}
	 

