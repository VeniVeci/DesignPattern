package com.atguigu.singleton.MySingleton;


public class SingleObject {
    private SingleObject(){
        if(singleObject != null){
            throw new RuntimeException("hhh");
        }
    }

    private static volatile SingleObject singleObject;
    public static SingleObject getInstance(){
        if(singleObject == null){
            synchronized (SingleObject.class){
                if(singleObject == null){
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }

    private Object readResolve() {
        return singleObject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singleObject;
    }

}
