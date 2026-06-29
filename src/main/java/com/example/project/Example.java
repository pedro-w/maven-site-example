package com.example.project;

public class Example {
    public int add(int x, int y) { return x + y; }
    public static void main(String[] args) {
        System.out.println(new Example().add(99, 1));
    }
}
