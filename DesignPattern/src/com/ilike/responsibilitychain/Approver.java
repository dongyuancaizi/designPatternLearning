package com.ilike.responsibilitychain;

/**
 * 处理人抽象类
 */
public abstract class Approver {
    /**
     * 下一个处理者
     */
    Approver approver;
    /**
     * 处理人的名字
     */
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 处理请求的方法
     */
  public  abstract  void  processRequest(PurchaseRequest purchaseRequest);

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
