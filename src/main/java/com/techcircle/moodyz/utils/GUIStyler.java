package com.techcircle.moodyz.utils;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class GUIStyler {
    private final HashMap<JComponent, Color> backgroundColorList;
    private final HashMap<JComponent, Color> foregroundColorList;
    private final HashMap<JButton, Icon> iconList;

    public GUIStyler() {
        backgroundColorList = new HashMap<>();
        foregroundColorList = new HashMap<>();
        iconList = new HashMap<>();
    }

    public void setHoverBgColor(JComponent component, Color color) {
        backgroundColorList.put(component, component.getBackground());
        component.setOpaque(true);
        component.setBackground(color);
    }

    public void removeHoverBgColor(JComponent component) {
        if (backgroundColorList.containsKey(component)) {
            component.setOpaque(false);
            component.setBackground(backgroundColorList.get(component));
            backgroundColorList.remove(component);
        }
    }

    public void setHoverTextColor(JComponent component, Color color) {
        foregroundColorList.put(component, component.getForeground());
        component.setForeground(color);
    }

    public void removeHoverTextColor(JComponent component) {
        if (foregroundColorList.containsKey(component)) {
            component.setForeground(foregroundColorList.get(component));
            foregroundColorList.remove(component);
        }
    }

    public void setHoverButtonColor(JButton button, Color color, Icon icon) {
        setHoverTextColor(button, color);

        if (iconList.containsKey(button)) {
            iconList.replace(button, button.getIcon());
        }
        else {
            iconList.put(button, button.getIcon());
        }

        button.setIcon(icon);
    }

    public void removeHoverButtonColor(JButton button) {
        removeHoverTextColor(button);

        if (iconList.containsKey(button)) {
            button.setIcon(iconList.get(button));
            iconList.remove(button);
        }
    }
}
