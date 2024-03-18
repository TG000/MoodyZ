package com.techcircle.moodyz.utils.dev;

import javax.swing.*;

public class Debugger {
    public static void log(JFrame mainApp, String message) {
        JOptionPane.showMessageDialog(mainApp, message);
    }
}
