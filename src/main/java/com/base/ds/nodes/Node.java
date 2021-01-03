package com.base.ds.nodes;

public class Node {
    public int data;
    public Node next;
    public Node prev;
    public Node child;

    public Node() {
    }

    public Node(int d) {
        data = d;
    }

    public Node(Node prev, int d) {
        this.prev = prev;
        data = d;
    }

    public Node(int d, Node next) {
        data = d;
        this.next = next;
    }

    public Node(Node prev, int d, Node next) {
        this.prev = prev;
        data = d;
        this.next = next;
    }

    public Node(Node prev, int d, Node next, Node child) {
        this.prev = prev;
        data = d;
        this.next = next;
        this.child = child;
    }
}