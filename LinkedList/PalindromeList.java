package LinkedList;

import java.util.Stack;

public class PalindromeList {

	    public static void main(String args[])
	    {
	        Node one = new Node(5);
	        Node two = new Node(2);
	        Node three = new Node(4);
	        Node four = new Node(8);
	        Node five = new Node(4);
	        Node six = new Node(2);
	        Node seven = new Node(5);
//	        Node eight = new Node(2);  //not palidrome
	        
	        one.ptr = two;
	        two.ptr = three;
	        three.ptr = four;
	        four.ptr = five;
	        five.ptr = six;
	        six.ptr = seven;
//	        seven.ptr = eight;
	        
	        boolean condition = isPalindrome(one);
	        System.out.println("Linkedlist is Palidrome :" + " "+condition);
	    }
	    static boolean isPalindrome(Node head)
	    {
	  
	        Node slow = head;
	        boolean ispalindrome = true;
	        Stack<Integer> stack = new Stack<Integer>();
	  
	        while (slow != null) {
	            stack.push(slow.data);
	            slow = slow.ptr;
	        }
	  
	        while (head != null) {
	  
	            int i = stack.pop();
	            if (head.data == i) {
	            	ispalindrome = true;
	            }
	            else {
	            	ispalindrome = false;
	                break;
	            }
	            head = head.ptr;
	        }
	        return ispalindrome;
	    }
	}
	  
	class Node {
	    int data;
	    Node ptr;
	    Node(int d)
	    {
	        ptr = null;
	        data = d;
	    }
	}


