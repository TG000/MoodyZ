package com.techcircle.moodyz.app.views.components.sidebar;

import com.techcircle.moodyz.app.views.components.global.RoundedPanel;
import com.techcircle.moodyz.config.AppConfig;
import com.techcircle.moodyz.constants.RouteConstants;
import com.techcircle.moodyz.utils.GUIStyler;
import com.techcircle.moodyz.utils.IconBuilder;
import net.miginfocom.swing.MigLayout;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.awt.*;

/**
 *
 * @author Gica Tran
 */
public class TopNav extends RoundedPanel {
    private GUIStyler guiStyler;

    /**
     * Creates new form TopNav
     */
    public TopNav() {
        super(20);
        initComponents();
        init();
    }

    private void init() {
        guiStyler = new GUIStyler();
        this.setLayout(new MigLayout("wrap, fill", "20[]20", "15[grow]10[grow]15"));

        this.remove(btnHome);
        this.remove(btnSearch);

        this.add(btnHome, "grow");
        this.add(btnSearch, "grow");

        if (AppConfig.getCurrentRoute() == RouteConstants.HOME) {
            guiStyler.setHoverTextColor(btnHome, Color.WHITE);
            btnHome.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.HOME, 22, Color.WHITE));
            guiStyler.setHoverTextColor(btnSearch, Color.GRAY);
            btnSearch.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.SEARCH, 22, Color.GRAY));
        }
        else {
            guiStyler.setHoverTextColor(btnSearch, Color.WHITE);
            btnSearch.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.SEARCH, 22, Color.WHITE));
            guiStyler.setHoverTextColor(btnHome, Color.WHITE);
            btnHome.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.HOME, 22, Color.GRAY));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(25, 25, 25));
        setMaximumSize(new java.awt.Dimension(350, 32767));
        setPreferredSize(new java.awt.Dimension(350, 130));

        btnHome.setBackground(new java.awt.Color(25, 25, 25));
        btnHome.setFont(new java.awt.Font("Proxima Nova Rg", 1, 16)); // NOI18N
        btnHome.setForeground(new java.awt.Color(128, 128, 128));
        btnHome.setText("   Home");
        btnHome.setBorder(null);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(25, 25, 25));
        btnSearch.setFont(new java.awt.Font("Proxima Nova Rg", 1, 16)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(128, 128, 128));
        btnSearch.setText("    Search");
        btnSearch.setBorder(null);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        if (AppConfig.getCurrentRoute() != RouteConstants.HOME) {
            guiStyler.setHoverTextColor(btnHome, Color.WHITE);
            btnHome.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.HOME, 22, Color.WHITE));
        }
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        if (AppConfig.getCurrentRoute() != RouteConstants.HOME) {
            guiStyler.removeHoverTextColor(btnHome);
            btnHome.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.HOME, 22, Color.GRAY));
        }
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        if (AppConfig.getCurrentRoute() != RouteConstants.SEARCH) {
            guiStyler.setHoverTextColor(btnSearch, Color.WHITE);
            btnSearch.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.SEARCH, 22, Color.WHITE));
        }
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        if (AppConfig.getCurrentRoute() != RouteConstants.SEARCH) {
            guiStyler.removeHoverTextColor(btnSearch);
            btnSearch.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.SEARCH, 22, Color.GRAY));
        }
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        AppConfig.redirect(RouteConstants.HOME);
        guiStyler.setHoverTextColor(btnHome, Color.WHITE);
        btnHome.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.HOME, 22, Color.WHITE));
        guiStyler.setHoverTextColor(btnSearch, Color.GRAY);
        btnSearch.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.SEARCH, 22, Color.GRAY));
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        AppConfig.redirect(RouteConstants.SEARCH);
        guiStyler.setHoverTextColor(btnSearch, Color.WHITE);
        btnSearch.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.SEARCH, 22, Color.WHITE));
        guiStyler.setHoverTextColor(btnHome, Color.GRAY);
        btnHome.setIcon(new IconBuilder().prepareIcon(FontAwesomeSolid.HOME, 22, Color.GRAY));
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSearch;
    // End of variables declaration//GEN-END:variables
}
