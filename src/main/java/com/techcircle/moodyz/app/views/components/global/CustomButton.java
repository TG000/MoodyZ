package com.techcircle.moodyz.app.views.components.global;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class CustomButton extends JButton {
    private Color backgroundColor;
    private Color foregroundColor;
    private Color hoverColor;
    private Color hoverForegroundColor;
    private Color pressedColor;
    private Color pressedForegroundColor;
    private Color selectedColor;
    private Color selectedForegroundColor;
    private int radius;
    private int textAlignment;
    private int iconTextGap;
    private Cursor cursor;
    private Icon rolloverIcon;

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
        hoverForegroundColor = Color.WHITE;
        pressedColor = new Color(33, 97, 140);
        pressedForegroundColor = Color.WHITE;
        radius = 15;
        textAlignment = SwingConstants.CENTER;
        iconTextGap = 0;
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

        Color color = backgroundColor;
        Color textColor = foregroundColor;
        Icon icon = getIcon();
        String text = getText();

        if (isSelected()) {
            color = selectedColor;
            textColor = selectedForegroundColor;
            icon = getSelectedIcon();
        } else {
            if (getModel().isPressed()) {
                color = pressedColor;
                textColor = pressedForegroundColor;
                icon = getPressedIcon();
            } else if (getModel().isRollover()) {
                color = hoverColor;
                textColor = hoverForegroundColor;
                icon = getRolloverIcon();
            }
        }

        g2.setColor(color);
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, radius, radius));

        // Calculate the available space for content
        int contentWidth = (icon != null ? icon.getIconWidth() + iconTextGap : 0);

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
            g2.setColor(textColor); // Set the color for the icon
            icon.paintIcon(this, g2, contentX, iconY);
            contentX += icon.getIconWidth() + iconTextGap;
        }

        // Draw text
        if (text != null && !text.isEmpty()) {
            if (icon == null) {
                contentX -= getTextWidth() / 2;
            }
            g2.setColor(textColor);
            FontMetrics metrics = g2.getFontMetrics();
            int textHeight = metrics.getHeight();
            int textY = (height - textHeight) / 2 + metrics.getAscent();
            g2.drawString(text, contentX, textY);
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

    public int getTextWidth() {
        FontMetrics fontMetrics = this.getFontMetrics(this.getFont());
        String buttonText = this.getText();
        return fontMetrics.stringWidth(buttonText);
    }

    public Color getHoverForegroundColor() {
        return hoverForegroundColor;
    }

    public void setHoverForegroundColor(Color hoverForegroundColor) {
        this.hoverForegroundColor = hoverForegroundColor;
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
        repaint();
    }

    public int getIconTextGap() {
        return iconTextGap;
    }

    @Override
    public void setIconTextGap(int iconTextGap) {
        super.setIconTextGap(iconTextGap);
        this.iconTextGap = iconTextGap;
        repaint();
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

    @Override
    public Icon getRolloverIcon() {
        return rolloverIcon;
    }

    @Override
    public void setRolloverIcon(Icon rolloverIcon) {
        super.setRolloverIcon(rolloverIcon);
        this.rolloverIcon = rolloverIcon;
    }

    public Color getPressedForegroundColor() {
        return pressedForegroundColor;
    }

    public void setPressedForeground(Color pressedForegroundColor) {
        this.pressedForegroundColor = pressedForegroundColor;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
    }

    public Color getSelectedForegroundColor() {
        return selectedForegroundColor;
    }

    public void setSelectedForegroundColor(Color selectedForegroundColor) {
        this.selectedForegroundColor = selectedForegroundColor;
    }
}