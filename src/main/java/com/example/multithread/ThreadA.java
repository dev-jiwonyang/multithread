package com.example.multithread;

public class ThreadA implements Runnable {
    // 스레드 구현
    // 1. extends Thread
    // 2. implements Runnable (클래스 상속이 더 가능하므로 유용)
    @Override
    public void run() {
        System.out.println("This is Thread A");
    }
}