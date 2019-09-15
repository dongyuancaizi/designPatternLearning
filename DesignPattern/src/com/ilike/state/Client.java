package com.ilike.state;

public class Client {

    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 0; i <300 ; i++) {
            System.out.println("--------第--------"+(i+1)+"-------次抽奖------------");
            //参加抽奖，第一次点击扣除积分
            raffleActivity.deduceMoney();
            //第二步，抽奖
            raffleActivity.raffle();
        }
    }
}
