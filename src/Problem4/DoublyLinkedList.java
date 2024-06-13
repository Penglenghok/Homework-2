package Problem4;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node("");
		}
		//1. adds to the end of the list
		public void addLast(String item){
			Node n =new Node(item);
			Node current = header;
			if(header.next == null){
				header.next = n;
				n.previous = header;
			}else{
				while(current.next != null) {
					current = current.next;
				}
				n.previous=current;
				current.next = n;
			}
		}
		// 2. Remove by passing object
		public Node remove(String item){
			Node n = new Node(item);
			Node current=header;
			if(header.next == null){
				return null;
			}else{
				while(current.next != null) {
					if(current.value.equals(item)){
						break;
					}
					current=current.next;
				}
				current.previous.next=current.next;
				current.next.previous=current.previous;
				return n;
			}
		}

		// 3. Remove the First Node
		public Node removeFirst() {

			if(header.next ==null){
				return null;
			}else{
				header.next.next.previous= header;
				header.next= header.next.next;
				return header.next.next;
			}

		}


		// 4. Prints the list from last to first
		 public void printReverse() {
			Node last = header;
			if(header.next ==null){
				System.out.println("Null");
			}else{
				while (last.next!=null){
					last=last.next;
				}
				while (last.previous!=null){
					System.out.println(last.value);
					last=last.previous;
				}
			}
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			Node(String s){
				this.value=s;
			}
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);

			list.remove("Harry");

			System.out.println(list);
			list.addLast("Harry");
			System.out.println(list);
			list.removeFirst();
			System.out.println(list);

			list.addLast("Bob");
			System.out.println(list);
			list.printReverse();
			// Call all your implemented Methods 
		}
}
