package com.techcircle.moodyz.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class GUIStyler {
    public void makeRounded(JComponent component, int cornerRadius) {
        component.setOpaque(false); // Make the component transparent
        component.setBorder(BorderFactory.createEmptyBorder(cornerRadius, cornerRadius, cornerRadius, cornerRadius));
        component.setLayout(new BorderLayout() {
            @Override
            public void layoutContainer(Container target) {
                super.layoutContainer(target);
                Component[] comps = target.getComponents();
                if (comps.length > 0) {
                    Rectangle bounds = target.getBounds();
                    Insets insets = target.getInsets();
                    int x = insets.left;
                    int y = insets.top;
                    int width = bounds.width - insets.left - insets.right;
                    int height = bounds.height - insets.top - insets.bottom;
                    for (Component comp : comps) {
                        comp.setBounds(x, y, width, height);
                    }
                }
            }
        });
        component.setOpaque(true);
    }
}
