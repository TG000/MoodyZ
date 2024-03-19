package com.techcircle.moodyz.app.views.components.global;

import org.intellij.lang.annotations.JdkConstants;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class CustomButton extends JButton {
    private Color backgroundColor;
    private Color foregroundColor;
    private Color hoverColor;
    private Color pressedColor;
    private int radius;
    private int textAlignment;
    private int iconTextGap;
    private Cursor cursor;

    public CustomButton() {
        this("");
    }

    public CustomButton(String text) {
        super(text);
        initDefaults();
    }

    public CustomButton(Icon icon) {
        super(icon);
        initDefaults();
    }

    public CustomButton(String text, Icon icon) {
        super(text, icon);
        initDefaults();
    }

    private void initDefaults() {
        backgroundColor = new Color(59, 89, 182);
        foregroundColor = Color.WHITE;
        hoverColor = new Color(46, 134, 193);
        pressedColor = new Color(33, 97, 140);
        radius = 15;
        textAlignment = SwingConstants.CENTER;
        iconTextGap = 4;
        cursor = Cursor.getDefaultCursor();
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Determine the color based on button state
        Color color = backgroundColor;
        if (getModel().isPressed()) {
            color = pressedColor;
        } else if (getModel().isRollover()) {
            color = hoverColor;
        }

        // Fill the button background with the determined color
        g2.setColor(color);
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, radius, radius));

        Icon icon = getIcon();
        String text = getText();

        // Calculate the available space for content
        int contentWidth = (icon != null ? icon.getIconWidth() + iconTextGap : 0);
        int contentHeight = height;

        // Calculate the x-coordinate for content based on textAlignment
        int contentX = 0;
        if (textAlignment == SwingConstants.CENTER) {
            contentX = (width - contentWidth) / 2;
        } else if (textAlignment == SwingConstants.RIGHT) {
            contentX = width - contentWidth;
        }

        // Draw icon
        if (icon != null) {
            int iconY = (height - icon.getIconHeight()) / 2;
            icon.paintIcon(this, g2, contentX, iconY);
            contentX += icon.getIconWidth() + iconTextGap;
        }

        // Draw text
        if (text != null && !text.isEmpty()) {
            g2.setColor(foregroundColor);
            FontMetrics metrics = g2.getFontMetrics();
            int textWidth = metrics.stringWidth(text);
            int textHeight = metrics.getHeight();
            int textX = contentX;
            int textY = (height - textHeight) / 2 + metrics.getAscent();
            g2.drawString(text, textX, textY);
        }

        g2.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dim = super.getPreferredSize();
        int width = Math.max(dim.width, getIcon() != null ? getIcon().getIconWidth() : 0);
        int height = Math.max(dim.height, getIcon() != null ? getIcon().getIconHeight() : 0);
        return new Dimension(width + 20, height + 10); // Add padding
    }

    // Method to calculate text width
    private int getTextWidth() {
        return getFontMetrics(getFont()).stringWidth(getText());
    }

    @Override
    public Color getBackground() {
        return backgroundColor;
    }

    @Override
    public void setBackground(Color backgroundColor) {
        super.setBackground(backgroundColor);
        this.backgroundColor = backgroundColor;
    }

    @Override
    public Color getForeground() {
        return foregroundColor;
    }

    @Override
    public void setForeground(Color foregroundColor) {
        super.setForeground(foregroundColor);
        this.foregroundColor = foregroundColor;
    }

    public Color getHoverColor() {
        return hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

    public Color getPressedColor() {
        return pressedColor;
    }

    public void setPressedColor(Color pressedColor) {
        this.pressedColor = pressedColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(int textAlignment) {
        this.textAlignment = textAlignment;
        repaint(); // Repaint the component to reflect text alignment change
    }

    // Getter and setter for iconTextGap
    public int getIconTextGap() {
        return iconTextGap;
    }

    @Override
    public void setIconTextGap(int iconTextGap) {
        super.setIconTextGap(iconTextGap);
        this.iconTextGap = iconTextGap;
        repaint(); // Repaint the component to reflect gap change
    }

    @NotNull
    public Cursor getCursor() {
        super.getCursor();
        return cursor;
    }

    @Override
    public void setCursor(Cursor cursor) {
        super.setCursor(cursor);
        this.cursor = cursor;
    }
}