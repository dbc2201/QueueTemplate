package adt;

public interface QueueADT<E> {
    boolean add(E item);

    E remove();

    E peek();

    E poll();

    E element();
}
