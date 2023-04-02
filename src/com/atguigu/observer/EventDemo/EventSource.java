package com.atguigu.observer.EventDemo;

public interface EventSource {
    void addListener(EventListener e);
    void removeListener(EventListener e);
}
