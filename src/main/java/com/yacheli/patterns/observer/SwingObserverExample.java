package com.yacheli.patterns.observer;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        new SwingObserverExample().go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("Don't do it"));
        button.addActionListener(event -> System.out.println("Do it"));

        frame.add(button);
        frame.setVisible(true);
    }
}
