package com.techcircle.moodyz.router;

import javax.swing.*;

public class Route {
    public String path;
    public JPanel component;

    public Route(String path, JPanel component) {
        this.path = path;
        this.component = component;
    }
}
