package com.ilike.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable{

    private static  final long serialVersionUID=68558288628875L;
    private String name;

    private DeepCloneableTarget deepCloneableTarget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepProtoType() {
    }

    /**
     * 深拷贝，方式1，使用clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        Object deep=null;
        try {
            //基本数据类型的克隆
            deep=super.clone();
            //对引用类型的属性单独处理
            DeepProtoType deepProtoType= (DeepProtoType) deep;
            deepProtoType.deepCloneableTarget= (DeepCloneableTarget)deepCloneableTarget.clone();
            return deepProtoType;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * 深拷贝，方式2，通过对象的序列化实现(推荐)
     * @return
     */
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream  bos =null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis =null;
        ObjectInputStream ois=null;
        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType deepProtoType= (DeepProtoType) ois.readObject();
            return deepProtoType;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        return null;

    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
