package com.ilike.jdk;

import java.util.Calendar;

public class Factory {

    public static void main(String[] args) {
        //是Calendar的静态方法
        Calendar calendar =Calendar.getInstance();
        System.out.println("年:"+calendar.get(Calendar.YEAR));
        System.out.println("月:"+calendar.get(Calendar.MARCH)+1);
        System.out.println("日:"+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:"+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:"+calendar.get(Calendar.MINUTE));
        System.out.println("秒:"+calendar.get(Calendar.SECOND));
    }
}
