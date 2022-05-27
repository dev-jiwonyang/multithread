package com.example.multithread.pracblock;

public class Order implements Runnable {

    @Override
    public void run() {
        makeFood();
    }

    public static synchronized void makeFood() {
        while (true) {
        }
    }

}

