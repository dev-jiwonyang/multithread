package com.example.multithread.pracblock;


import java.util.Map;

public class BlockingPractice {

    private Map<String, Boolean> map;

    public static void main(String[] args) {

        BlockingPractice blockingPractice = new BlockingPractice();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    blockingPractice.job("Thread1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public String job(String key) throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Running ..." + key);
        return key + key;
    }

//    public String runOrWait(String key, BlockingPractice job) {
//        if (map.containsKey(key)) {
//            if (map.get(key)) {
//                // 기다림
//            } else {
//                return job(key)
//            }
//        }
//    }
}
