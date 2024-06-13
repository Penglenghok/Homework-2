package lesson8.Problem4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node("");
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        Node n = new Node(item);
        Node current = header;
        if (header.next == null) {
            header.next = n;
            n.previous = header;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            n.previous = current;
            current.next = n;
        }
    }

    // 2. Remove by passing object
    public Node remove(String item) {
        Node n = new Node(item);
        Node current = header;
        if (header.next == null) {
            return null;
        } else {
            while (current.next != null) {
                if (current.value.equals(item)) {
                    break;
                }
                current = current.next;
            }
            if(current.next != null){
                current.previous.next = current.next;
                current.next.previous = current.previous;
            }else{
                current.previous.next=null;
                current.previous=null;
            }
            return n;
        }
    }

    // 3. Remove the First Node
    public Node removeFirst() {
        if(header.next ==null){
            return null;
        }else{
            Node firstNode = header.next;
            header.next = firstNode.next;
            if (firstNode.next != null) {
                firstNode.next.previous = header;
            }
            firstNode.next = null;
            firstNode.previous = null;
            return firstNode;
        }

        ///Another solution///
//        if (header.next == null) {
//            return null;
//        } else {
//            if(header.next.next!=null){
//                header.next.next.previous = header;
//                header.next = header.next.next;
//            }else{
//                header.next = null;
//            }
//            return header.next;
//        }

    }


    // 4. Prints the list from last to first
    public void printReverse() {
        Node last = header;
        if (header.next == null) {
            System.out.println("Null");
        } else {
            while (last.next != null) {
                last = last.next;
            }
            while (last.previous != null) {
                System.out.println(last.value);
                last = last.previous;
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
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        Node(String s) {
            this.value = s;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println(list);

//        list.remove("Harry");
//        list.remove("Bob");
//        list.remove("Steve");

        System.out.println(list);
//
//			list.addLast("Harry");
//			System.out.println(list);
//			list.removeFirst();
//        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
			System.out.println(list);
//
//			list.addLast("Bob");
//			System.out.println(list);
//			list.printReverse();
        // Call all your implemented Methods
    }
}
