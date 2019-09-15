package com.ilike.responsibilitychain;

public class Client {

    public static void main(String[] args) {
        //创建请求
        PurchaseRequest pr1 = new PurchaseRequest(1, 31000, 1);
        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchooleMasterApprover viceSchooleMasterApprover = new ViceSchooleMasterApprover("王副校长");
        SchooleMasterApprover schooleMasterApprover = new SchooleMasterApprover("桑校长");

        //将各个审批级别的下一个处理者设置好(处理人构成环形)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchooleMasterApprover);
        collegeApprover.setApprover(schooleMasterApprover);
        schooleMasterApprover.setApprover(departmentApprover);
        schooleMasterApprover.processRequest(pr1);
        
    }
}
