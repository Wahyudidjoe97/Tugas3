package com.company;

public class Main<T> {
    int size;
    stack<T> top;

    public Main() {
        size = 0;
        top = null;
    }

    public void push(T newValue){
        stack<T> ElemenBaru = new stack<T>(newValue, top);
        top = ElemenBaru;
        size++;
    }

    public T pop() {
        stack<T> elemenLama = top;
        if (elemenLama == null){
            return null;
        }
        top = top.getNext();
        size--;
        return elemenLama.getValue();
    }


    public static void main (String[] args){
        Main<String> s = new Main<String>();
        s.push("Kelas 1");
        s.push("Kelas 2");
        s.push("Kelas 3");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }


}
