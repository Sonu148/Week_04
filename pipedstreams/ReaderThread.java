package com.day_03.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    // constructor for the raed thread
    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    // method for run the program
    public void run() {
        try {
            int data;// initialise the data
            while ((data = pipedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
