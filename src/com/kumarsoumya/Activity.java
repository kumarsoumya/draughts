package com.kumarsoumya;

public class Activity {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Frame();
            }
        });
    }

}