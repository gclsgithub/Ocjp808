package com.study;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {

    private Object[] elements;
    private int size= 0;
    private static final int DEFAULT_INITAL_CAPACITY = 16;
    
    public MyStack(){
        this.elements  = new Object[DEFAULT_INITAL_CAPACITY]; 
    }
    
    public void push(Object e ){
        ensureCaoacity();
        elements[size++] = e;
    }

    /**
     * 会出现错误的情况,因为当一个数组在不断发生变化的时候我们的size只是一个指针去指向的这个数组里面的某一个值,当删除一个数据的时候也只是把指针向前后者向后移动
     * 并没有清除这个对象的引用,所以这个对象的引用会一直存在直到MyStack的生命周期结束.,所以当我们移动指针的时候需要把对应pop()出来的数据给清除掉
     * @return
     */
    public Object pop(){
        if (size == 0){
            throw  new EmptyStackException();
        }
        Object obj  = elements[--size];
        elements[size] = null;
        return obj;
    }


    /**
     * 过量扩容
     */
    private void ensureCaoacity() {
        if (elements.length >= DEFAULT_INITAL_CAPACITY){
            elements = Arrays.copyOf(elements,2*size+1);
        }
    }

}
