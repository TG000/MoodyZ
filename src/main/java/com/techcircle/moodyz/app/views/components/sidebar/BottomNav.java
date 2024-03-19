package com.techcircle.moodyz.app.views.components.sidebar;

import com.techcircle.moodyz.app.views.components.global.CustomPanel;
import com.techcircle.moodyz.utils.IconBuilder;
import net.miginfocom.swing.MigLayout;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.awt.*;

/**
 *
 * @author Gica Tran
 */
public class BottomNav extends CustomPanel {
    /**
     * Creates new form BottomNav
     */
    public BottomNav() {
        initComponents();
        init();
    }

    private void init() {
        this.setLayout(new MigLayout("", "25[]push[][]25", "15[]10[]10[]15"));

        this.remove(txtDisplay);
        this.remove(btnAdd);
        this.remove(btnPlaylists);

        this.add(txtDisplay, "h ::30");
        this.add(btnAdd, "skip, wrap, w ::30, h ::30");
        this.add(btnPlaylists, "wrap");

        txtDisplay.setIcon(new IconBuilder(FontAwesomeSolid.BOOKMARK, 22, Color.GRAY).prepareIcon());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JLabel();
        btnAdd = new com.techcircle.moodyz.app.views.components.global.CustomButton();
        btnPlaylists = new com.techcircle.moodyz.app.views.components.global.CustomButton();

        setBackground(new java.awt.Color(25, 25, 25));
        setRadius(20);

        txtDisplay.setFont(new java.awt.Font("Proxima Nova Rg", 1, 16)); // NOI18N
        txtDisplay.setForeground(new java.awt.Color(128, 128, 128));
        txtDisplay.setText("Your Library");
        txtDisplay.setIconTextGap(20);

        btnAdd.setBackground(new java.awt.Color(25, 25, 25));
        btnAdd.setIcon(new IconBuilder(FontAwesomeSolid.PLUS, 14, Color.GRAY).prepareIcon()
        );
        btnAdd.setHoverColor(new java.awt.Color(32, 32, 32));
        btnAdd.setPressedColor(new java.awt.Color(5, 5, 5));
        btnAdd.setPressedForeground(java.awt.Color.white);
        btnAdd.setPressedIcon(new IconBuilder(FontAwesomeSolid.PLUS, 14, Color.DARK_GRAY).prepareIcon()
        );
        btnAdd.setRadius(30);
        btnAdd.setRolloverIcon(new IconBuilder(FontAwesomeSolid.PLUS, 14, Color.WHITE).prepareIcon()
        );

        btnPlaylists.setText("Playlists");
        btnPlaylists.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlaylists.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPlaylists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlaylists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.techcircle.moodyz.app.views.components.global.CustomButton btnAdd;
    private com.techcircle.moodyz.app.views.components.global.CustomButton btnPlaylists;
    private javax.swing.JLabel txtDisplay;
    // End of variables declaration//GEN-END:variables
}
