package com.ilike.responsibilitychain;

/**
 * 系级别处理者
 */
public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
      if(purchaseRequest.getPrice()<=5000){
          System.out.println("请求编号："+purchaseRequest.getId()+"被"+this.getName()+"处理");
      }else{
          approver.processRequest(purchaseRequest);
      }
    }
}
