package lesson9.Prob2;

import lesson8.Prob4.DoublyLinkedList;

public class ArrayStackDemo {
    public class Node{
        Integer data;
        Node next;
        Node previous;

        public Node(Integer data) {
            this.data = data;
        }
    }

    Node head;
    int size = 0;

    public ArrayStackDemo() {
        head = new Node(null);
    }

    public void push(Integer data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (isEmpty()){
            head.previous = null;
        }else{
            head.previous = newNode;
        }

        head = newNode;

        size++;
    }

    public Integer pop() {
        Integer data = head.data;
        if(isEmpty()){
            return null;
        }else {
            head = head.next;
            head.previous = null;
        }
        --size;
        return data;
    }

    public Integer peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public int size(){
        return size;
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        toString(sb, head);
        System.out.println(sb);
    }

    private void toString(StringBuilder sb, ArrayStackDemo.Node n) {
        if(n==null){
            sb.append("null");
            return;
        }
        if(n.data != null) sb.append(n.data + " ");
        toString(sb, n.next);
    }

    public static void main(String[] args) {
        ArrayStackDemo demo = new ArrayStackDemo();
        demo.push(1);
        demo.push(2);
        demo.push(3);
        System.out.println("Peek: " + demo.peek());
        demo.display();
        System.out.println("Size: " + demo.size());

        System.out.println("Pop: " + demo.pop());
        System.out.println("Pop: " + demo.pop());
        System.out.println("Pop: " + demo.pop());
        System.out.println("Pop: " + demo.pop());
        System.out.println("Pop: " + demo.pop());

        demo.display();
    }
}
