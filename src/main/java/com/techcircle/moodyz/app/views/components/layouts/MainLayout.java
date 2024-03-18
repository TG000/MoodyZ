package com.techcircle.moodyz.app.views.components.layouts;

import com.techcircle.moodyz.app.views.forms.SongDetails;
import com.techcircle.moodyz.config.AppConfig;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Gica Tran
 */
public class MainLayout extends javax.swing.JLayeredPane {
    /**
     * Creates new form Layout
     */
    public MainLayout() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("filly", "8[350]8[grow]8[350]8", "0[]0"));
        this.add(new SideBar(), "grow");
        this.add(AppConfig.getCurrentPage(), "grow");
        this.add(new SongDetails(), "grow");

        AppConfig.router.addRouteListener(this::reloadCurrentPage);
    }

    private void reloadCurrentPage() {
        remove(getComponent(1));

        add(AppConfig.getCurrentPage(), "grow", 1);

        revalidate();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
