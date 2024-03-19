package com.techcircle.moodyz.app.views.components.sidebar;

import com.techcircle.moodyz.app.views.components.global.CustomPanel;
import com.techcircle.moodyz.config.AppConfig;
import com.techcircle.moodyz.constants.RouteConstants;
import com.techcircle.moodyz.utils.IconBuilder;
import net.miginfocom.swing.MigLayout;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import java.awt.*;

/**
 *
 * @author Gica Tran
 */
public class TopNav extends CustomPanel {
    /**
     * Creates new form TopNav
     */
    public TopNav() {
        initComponents();
        init();
    }

    private void init() {
        this.setLayout(new MigLayout("wrap, fill", "25[]25", "15[grow]10[grow]15"));

        this.remove(btnHome);
        this.remove(btnSearch);

        this.add(btnHome, "grow");
        this.add(btnSearch, "grow");

        btnHome.setSelected(AppConfig.router.getCurrentRoute() == RouteConstants.HOME);
        btnSearch.setSelected(AppConfig.router.getCurrentRoute() == RouteConstants.SEARCH);

        AppConfig.router.addRouteListener(this::reselectButton);
    }

    private void reselectButton() {
        btnHome.setSelected(AppConfig.router.getCurrentRoute() == RouteConstants.HOME);
        btnSearch.setSelected(AppConfig.router.getCurrentRoute() == RouteConstants.SEARCH);

        this.revalidate();
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new com.techcircle.moodyz.app.views.components.global.CustomButton();
        btnSearch = new com.techcircle.moodyz.app.views.components.global.CustomButton();

        setBackground(new java.awt.Color(25, 25, 25));
        setMaximumSize(new java.awt.Dimension(350, 32767));
        setPreferredSize(new java.awt.Dimension(350, 130));
        setRadius(20);

        btnHome.setBackground(new java.awt.Color(25, 25, 25));
        btnHome.setForeground(new java.awt.Color(128, 128, 128));
        btnHome.setIcon(new IconBuilder(FontAwesomeSolid.HOME, 22, Color.GRAY).prepareIcon()
        );
        btnHome.setText("Home");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setFont(new java.awt.Font("Proxima Nova Rg", 1, 16)); // NOI18N
        btnHome.setHoverColor(new java.awt.Color(25, 25, 25));
        btnHome.setIconTextGap(15);
        btnHome.setPressedColor(new java.awt.Color(25, 25, 25));
        btnHome.setPressedIcon(new IconBuilder(FontAwesomeSolid.HOME, 22, Color.WHITE).prepareIcon()
        );
        btnHome.setRolloverIcon(new IconBuilder(FontAwesomeSolid.HOME, 22, Color.WHITE).prepareIcon()
        );
        btnHome.setSelectedColor(new java.awt.Color(25, 25, 25));
        btnHome.setSelectedForegroundColor(java.awt.Color.white);
        btnHome.setSelectedIcon(new IconBuilder(FontAwesomeSolid.HOME, 22, Color.WHITE).prepareIcon()
        );
        btnHome.setTextAlignment(2);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(25, 25, 25));
        btnSearch.setForeground(new java.awt.Color(128, 128, 128));
        btnSearch.setIcon(new IconBuilder(FontAwesomeSolid.SEARCH, 22, Color.GRAY).prepareIcon()
        );
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFont(new java.awt.Font("Proxima Nova Rg", 1, 16)); // NOI18N
        btnSearch.setHoverColor(new java.awt.Color(25, 25, 25));
        btnSearch.setIconTextGap(15);
        btnSearch.setPressedColor(new java.awt.Color(25, 25, 25));
        btnSearch.setPressedIcon(new IconBuilder(FontAwesomeSolid.SEARCH, 22, Color.WHITE).prepareIcon()
        );
        btnSearch.setRolloverIcon(new IconBuilder(FontAwesomeSolid.SEARCH, 22, Color.WHITE).prepareIcon()
        );
        btnSearch.setSelectedColor(new java.awt.Color(25, 25, 25));
        btnSearch.setSelectedForegroundColor(java.awt.Color.white);
        btnSearch.setSelectedIcon(new IconBuilder(FontAwesomeSolid.SEARCH, 22, Color.WHITE).prepareIcon()
        );
        btnSearch.setTextAlignment(2);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        AppConfig.router.setCurrentRoute(RouteConstants.HOME);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        AppConfig.router.setCurrentRoute(RouteConstants.SEARCH);
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.techcircle.moodyz.app.views.components.global.CustomButton btnHome;
    private com.techcircle.moodyz.app.views.components.global.CustomButton btnSearch;
    // End of variables declaration//GEN-END:variables
}
