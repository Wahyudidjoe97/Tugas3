package com.company;

import java.util.ArrayList;

public class stack<T> {
    T value;
    stack<T> next;

    public  stack(T value, stack<T> next){
        this.value = value;
        this.next = next;
    }

    public stack<T> getNext(){
        return  next;
    }
    public T getValue() {
        return value;
    }
}
