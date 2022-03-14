package com.spcruzaley.topic.collections.list.linkedlist;

public class CustomLinkedListImplementation<T> {

    private Node<T> head;
    private int size;

    public CustomLinkedListImplementation() {
        size = 0;
    }

    public void insert(T element) {
        Node<T> newNode = new Node<>(element);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Node<T> currentNode = this.head;

            while(currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
        size++;
    }

    public void insertHead(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setNextNode(this.head);
        this.head = newNode;
        size++;
    }

    public void delete(int index) {
        if(size == 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Node<T> node = this.head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }

        node.setNextNode(node.getNextNode().getNextNode());
        size--;
    }

    public T get(int index) {
        Node<T> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }

        return node.getData();
    }

    public int size() {
        return this.size;
    }

    public void displayElements() {
        Node<T> currentNode = this.head;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println();
    }
}

class Node<T> {
    private T data;
    private Node nextNode;

    public Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}