package com.techcircle.moodyz.app.views.components.global;

import net.miginfocom.swing.MigLayout;
import org.intellij.lang.annotations.JdkConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomPopup extends JPanel {
    private boolean visible;

    public CustomPopup() {
        super();
        initDefault();
    }

    private void initDefault() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        visible = false;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(!isVisible());
            }
        });
    }

    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
        super.setVisible(visible);
    }

    @Override
    public boolean isVisible() {
        return visible;
    }
}