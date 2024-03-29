package Zuo;

//打印两个有序链表的公共部分
//【题目】 给定两个有序链表的头指针head1和head2，打印两个 链表的公共部分。
public class C03_PrintCommonPart {
	static class Node{
		int value;
		Node next;
		public Node(int val) {
			this.value=val;
		}
	}
	public static void main(String[] args) {
//		Node node1 = new Node(1);
//		node1.next = new Node(2);
//		node1.next.next = new Node(3);
//		node1.next.next.next = new Node(4);
//		
//		
//		Node node2 = new Node(2);
//		node2.next = new Node(4);
		
		Node node1 = new Node(2);
		node1.next = new Node(3);
		node1.next.next = new Node(5);
		node1.next.next.next = new Node(6);

		Node node2 = new Node(1);
		node2.next = new Node(2);
		node2.next.next = new Node(5);
		node2.next.next.next = new Node(7);
		node2.next.next.next.next = new Node(8);
		
		PrintCommonPart(node1,node2);
	}
	
	public static void PrintCommonPart(Node head1,Node head2) {
		while(head1!=null && head2!=null) {
			if(head1.value<head2.value) {
				head1 = head1.next;
			}else if(head1.value>head2.value) {
				head2 = head2.next;
			}else {
				System.out.print(head1.value+" ");
				head1 = head1.next;
				head2 = head2.next;
			}
		}
	}
}
