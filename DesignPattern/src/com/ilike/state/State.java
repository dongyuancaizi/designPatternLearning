package com.ilike.state;

/**
 * 状态抽象类
 */
public abstract class State {
    /**
     * 扣除积分--50
     */
    public abstract void deduceMoney();

    /**
     * 是否抽中奖品
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();
}
