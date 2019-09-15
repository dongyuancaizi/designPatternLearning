package com.ilike.state;

import java.util.Random;

/**
 * 发奖品的状态
 */
public   class DispenseState extends State {

    private RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 当前状态不可以扣积分
     */
    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分");
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
       return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
       if(raffleActivity.getCount()>0){
           System.out.println("恭喜你，中奖了");
           //改变状态为不能抽奖
           raffleActivity.setState(raffleActivity.getNoRaffleState());
       }else{
           System.out.println("奖品发放完了");
           //改变状态为奖品发送完毕
           raffleActivity.setState(raffleActivity.getDispenseOutState());
       }
    }
}
