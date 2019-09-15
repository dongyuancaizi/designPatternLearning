package com.ilike.visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给歌手的评价是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给歌手的评价是成功");
    }
}
