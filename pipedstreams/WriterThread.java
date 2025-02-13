package com.day_03.pipedstreams;
import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            String data = "Hello from Writer Thread!";
            pipedOutputStream.write(data.getBytes());
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}