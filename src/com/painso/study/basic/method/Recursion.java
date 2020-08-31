package com.painso.study.basic.method;

/**
 * @author ephz3nt
 * @version 0.1
 */
public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.recursion();
    }
    public void recursion(){
        recursion();
    }
}
