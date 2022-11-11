package util;

import java.util.LinkedList;

public class SpecialDeque<T> {
    private LinkedList<T> specialDeque = new LinkedList<>();
    public void pushFirst(T v){
        specialDeque.addFirst(v);
    }

    public void pushLast(T v){
        specialDeque.addLast(v);
    }

    public T popFirst(){
        return specialDeque.removeFirst();
    }

    public T popLast(){
        return specialDeque.removeLast();
    }

    public T peekFirst(){
        return specialDeque.getFirst();
    }

    public T peekLast(){
        return specialDeque.getLast();
    }

    public T getIndex(int index){
        return specialDeque.get(index);
    }

    public int size(){
        return specialDeque.size();
    }

    public boolean empty(){
        return specialDeque.isEmpty();
    }

    public String toString(){
        return specialDeque.toString();
    }
}
