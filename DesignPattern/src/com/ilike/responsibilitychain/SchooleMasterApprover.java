package com.ilike.responsibilitychain;

/**
 * 校长级别处理者
 */
public class SchooleMasterApprover extends Approver {
    public SchooleMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println("请求编号：" + purchaseRequest.getId() + "被" + this.getName() + "处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
