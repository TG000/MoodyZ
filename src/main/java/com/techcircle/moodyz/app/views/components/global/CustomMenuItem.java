package com.techcircle.moodyz.app.views.components.global;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomMenuItem extends JMenuItem {
    private Color hoverColor;
    private Color normalColor;

    public CustomMenuItem() {
        super("");
        initDefaults();
    }

    private void initDefaults() {
        normalColor = UIManager.getColor("MenuItem.background");
        hoverColor = Color.LIGHT_GRAY; // Default hover color
        attachHoverListener();
    }

    private void attachHoverListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(normalColor);
            }
        });
    }

    public Color getNormalColor() {
        return normalColor;
    }

    public void setNormalColor(Color normalColor) {
        this.normalColor = normalColor;
    }

    public Color getHoverColor() {
        return hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }
}
