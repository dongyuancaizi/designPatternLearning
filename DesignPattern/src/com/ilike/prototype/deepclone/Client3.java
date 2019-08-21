package com.ilike.prototype.deepclone;

public class Client3 {

    public static void main(String[] args) {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("宋江");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("大牛","大牛类"));

        //方式1深拷贝
        /*DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType1);
        System.out.println(deepProtoType2);
        System.out.println(deepProtoType3);*/

        DeepProtoType deepProtoType4 = (DeepProtoType) deepProtoType.deepClone();
        DeepProtoType deepProtoType5 = (DeepProtoType) deepProtoType.deepClone();
        DeepProtoType deepProtoType6 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType4);
        System.out.println(deepProtoType5);
        System.out.println(deepProtoType6);
    }
}
