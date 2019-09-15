package com.ilike.state;

import java.util.Random;

/**
 * 能抽奖的状态
 */
public   class CanRaffleState extends State {

    private RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 当前状态不可以扣积分
     */
    @Override
    public void deduceMoney() {
        System.out.println("已经扣除过积分了");
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        int num = new Random().nextInt(10);
        if(num==0){
            //改变活动状态为发放奖品
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾，没有抽中奖品");
            //改变活动状态为不能抽奖
             raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
