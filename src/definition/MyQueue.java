/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 13/02/20
 *   Time: 7:24 AM
 */

package definition;

import adt.QueueADT;

public class MyQueue<E> implements QueueADT<E> {
    @Override
    public boolean add(E item) {
        return false;
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

    private static class Node<E> {
        private E data;
        private Node<E> previous;
        private Node<E> next;
    }

}
