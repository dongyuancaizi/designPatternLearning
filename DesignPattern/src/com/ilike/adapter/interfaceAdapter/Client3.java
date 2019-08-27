package com.ilike.adapter.interfaceAdapter;

public class Client3 {

    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的变量");
            }
        };
        abstractAdapter.m1();
    }
}
