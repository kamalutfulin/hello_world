package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (true){
            System.out.println("Hello World! [" + count++ + "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}
