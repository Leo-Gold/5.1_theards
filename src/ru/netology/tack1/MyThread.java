package ru.netology.tack1;

class MyThread extends Thread {

    MyThread(ThreadGroup parent, String name) {
        super(parent, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(3000);
                System.out.println(currentThread().getName() + "���� ������!");
            }
        } catch (InterruptedException ignored) {
        }
    }
}