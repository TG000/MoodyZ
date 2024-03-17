package com.techcircle.moodyz.utils;

import javax.swing.*;
import java.awt.*;

public class GUIStyler {
    public void setHoverColor(JComponent component, Color color) {
        component.setOpaque(true);
        component.setBackground(color);
    }

    public void removeHoverColor(JComponent component) {
        component.setOpaque(false);
    }
}
