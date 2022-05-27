package com.example.multithread.pracblock;


public class BlockingPractice {

    public static void main(String[] args) throws InterruptedException {

        Thread order1 = new Thread(new Order());
        Thread order2 = new Thread(new Order());

        order1.start();
        order2.start();

        Thread.sleep(1000);

        System.out.println(order1.getState()); // RUNNABLE
        System.out.println(order2.getState()); // BLOCKED
    }
}

// 참고 : https://velog.io/@ljs0429777/10%EC%A3%BC%EC%B0%A8-%EA%B3%BC%EC%A0%9C-%EB%A9%80%ED%8B%B0%EC%93%B0%EB%A0%88%EB%93%9C-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D