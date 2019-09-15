package com.ilike.memento.game;

/**
 * 游戏角色
 */
public class GameRole {
    /**
     * 攻击力
     */
    private int vit;
    /**
     * 防御能力
     */
    private int def;

    /**
     * 根据当前状态创建Memento
     * @return
     */
    public Memento createMemento(){
      return new Memento(vit,def);
    }

    /**
     * 从备忘录对象，恢复GameRole的状态
     * @param memento
     */
    public void recoverGameRoleFromMemento(Memento memento){
      this.vit=memento.getVit();
      this.def=memento.getDef();
    }

    /**
     * 显示当前游戏角色的状态
     */
    public void display(){
        System.out.println("游戏角色当前的攻击力："+vit+" , 防御力："+def);

    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
