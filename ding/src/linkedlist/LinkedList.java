package linkedlist;

public class LinkedList {

	Node head;
	public boolean isEmpty() {return head==null;}
	public void addLast(int data) {
		Node new_node = new Node(data);
		if(isEmpty())
			head = new_node;
		else
		{
			Node last = head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next = new_node;
		}
	}
//	public void display()
//	{
//		Node last = head;
//		while(last!=null)
//		{
//			System.out.println(last.data);
//			last=last.next;
//		}
//	}
	@Override
	public String toString() {
		String s="[";
		Node last = head;
		while(last!=null)
		{
			if(last.next!=null)
				s+=last.data+",";
			else
			{
				s+=last.data;
				}
			last=last.next;
			
		}
		
		
		s=s+"]";
		return s;
	}
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		System.out.println(l);;

	}
	public void remove() {
		
	}

}
