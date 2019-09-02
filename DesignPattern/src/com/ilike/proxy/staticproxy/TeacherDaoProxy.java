package com.ilike.proxy.staticproxy;

/**
 * 静态代理对象
 */
public class TeacherDaoProxy  implements IIeacherDao{

    private IIeacherDao iIeacherDao;//目标对象，通过接口来聚合

    public TeacherDaoProxy(IIeacherDao iIeacherDao) {
        this.iIeacherDao = iIeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        iIeacherDao.teach();
        System.out.println("代理结束");
    }
}
