package com.ilike.state;

/**
 * 不能抽奖
 */
public class NoRaffleState  extends State{
    private RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 当前状态可以扣积分
     */
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分成功了，您可以抽奖了");
        raffleActivity.setState(raffleActivity.CanRaffleState);
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖哦");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
