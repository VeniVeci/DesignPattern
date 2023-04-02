package com.atguigu.singleton.MySingleton;

/**
 * @Description
 * @create 2022/3/22 - 16:53
 */
public class LazyMan {
    private LazyMan(){
        if(lazyMan != null){
            throw new RuntimeException("hhh");
        }
    }

    private static volatile LazyMan lazyMan;
    public static LazyMan getInstance(){
        if(lazyMan == null){
            synchronized (LazyMan.class){
                if(lazyMan == null){
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }

    private Object readResolve() {
        return lazyMan;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return lazyMan;
    }

}
