package com.techcircle.moodyz.utils;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GUIStyler {
    private final HashMap<JComponent, Color> componentBgColor;
    private final HashMap<JComponent, Color> componentTextColor;

    public GUIStyler() {
        componentBgColor = new HashMap<>();
        componentTextColor = new HashMap<>();
    }

    public void setHoverBgColor(JComponent component, Color color) {
        componentBgColor.put(component, component.getBackground());
        component.setOpaque(true);
        component.setBackground(color);
    }

    public void removeHoverBgColor(JComponent component) {
        if (componentBgColor.containsKey(component)) {
            component.setOpaque(false);
            component.setBackground(componentBgColor.get(component));
            componentBgColor.remove(component);
        }
    }

    public void setHoverTextColor(JComponent component, Color color) {
        componentTextColor.put(component, component.getForeground());
        component.setForeground(color);
    }

    public void removeHoverTextColor(JComponent component) {
        if (componentTextColor.containsKey(component)) {
            component.setForeground(componentTextColor.get(component));
            componentTextColor.remove(component);
        }
    }
}
