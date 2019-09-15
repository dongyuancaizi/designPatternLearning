package com.ilike.state;

/**
 * 奖品发放完毕，抽奖活动完毕
 */
public   class DispenseOutState extends State {

    private RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }


    @Override
    public void deduceMoney() {
        System.out.println("奖品发放完毕，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完毕，请下次再参加");
       return false;
    }


    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完毕，请下次再参加");
    }
}
