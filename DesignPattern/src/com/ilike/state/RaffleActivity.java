package com.ilike.state;

public class RaffleActivity{

    /**
     * 表示活动当前的状态
     */
    private State state;
    /**
     * 奖品的数量
     */
    int count=0;

    State dispenseOutState =new DispenseOutState(this);
    State CanRaffleState =new CanRaffleState(this);
    State DispenseState =new DispenseState(this);
    State NoRaffleState =new NoRaffleState(this);

    public RaffleActivity(int count) {
        this.count = count;
        this.state=getNoRaffleState();
    }


    public void setCount(int count) {
        this.count = count;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getCanRaffleState() {
        return CanRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        CanRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return DispenseState;
    }

    public void setDispenseState(State dispenseState) {
        DispenseState = dispenseState;
    }

    public State getNoRaffleState() {
        return NoRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        NoRaffleState = noRaffleState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount=count;
        count--;
        return curCount;
    }

    /**
     * 扣分
     */
    public void deduceMoney() {
        state.deduceMoney();
    }

    /**
     * 发放奖品
     */
    public void raffle() {
        if(state.raffle()){
            state.dispensePrize();
        }

    }
}
