package com.atguigu.singleton.MySingleton;

public class LazyMode {
    private LazyMode(){
    }
    private static volatile LazyMode lazyMode;
    public LazyMode getInstance(){
        if(lazyMode == null){
            synchronized (LazyMode.class){
                if(lazyMode == null){
                    lazyMode = new LazyMode();
                    // 分配内存
                    // 初始化
                    // 引用指向
                }
            }
        }
        return lazyMode;
    }

}
