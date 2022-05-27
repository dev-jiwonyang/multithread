package com.example.multithread;

public class MutliThreadExample {
    // 스레드 호출
    // 1. start -> 새로운 스레드 작업을 위한 호출스택 생성
    // 2. run -> start로 생성된 새로운 호출 스택에 run()을 저장
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadA());
        Thread thread2 = new Thread(new ThreadA());
        System.out.println("STATE: " + thread1.getState()); // NEW -> 생성되었으나 아직 시작되지 않음

        thread1.start();
        thread2.start();


        System.out.println("STATE: " + thread1.getState()); // RUNNABLE -> JVM에서 스레드가 실행 중
    }

    // 스레드 state
    // https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.State.html
    // https://blog.tier1app.com/2014/11/26/thread-dump-analysis/
}
