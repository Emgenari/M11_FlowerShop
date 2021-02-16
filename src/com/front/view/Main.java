package com.front.view;


import com.front.domain.Frame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Frame appWindow = new Frame();
        appWindow.setVisible(true);
        appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
