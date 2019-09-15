package com.ilike.responsibilitychain;

/**
 * 学院级别处理者
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求编号：" + purchaseRequest.getId() + "被" + this.getName() + "处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
