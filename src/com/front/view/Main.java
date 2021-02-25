package com.front.view;

import com.front.domain.Frame;
import com.front.domain.MainPanel;
import com.front.domain.SecondaryPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Frame appWindow = new Frame();
        appWindow.setVisible(true);
        appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}