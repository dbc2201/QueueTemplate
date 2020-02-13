/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 13/02/20
 *   Time: 7:24 AM
 */

package definition;

import adt.QueueADT;

public class MyQueue<E> implements QueueADT<E> {

    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    private boolean addFirst(E item) {
        return true;
    }

    private boolean addAfter(Node<E> node, E item) {
        return true;
    }

    private Node<E> getNode(int index) {
        return null;
    }

    public boolean add(int index, E item) {
        return true;
    }

    @Override
    public boolean add(E item) {
        return false;
    }

    private E removeFirst() {
        return null;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append("]");
        return sb.toString();
    }

    private static class Node<E> {
        private E data;
        private Node<E> previous;
        private Node<E> next;

        private Node(E data, Node<E> previous, Node<E> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        private E getData() {
            return data;
        }

        private Node<E> getPrevious() {
            return previous;
        }

        private Node<E> getNext() {
            return next;
        }
    }

}
