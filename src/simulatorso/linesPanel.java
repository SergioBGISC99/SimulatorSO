package simulatorso;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class linesPanel extends javax.swing.JPanel {

    public linesPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(214, 217, 223));
        g2d.fillRect(0, 0, 1000, 1000);
        g2d.setColor(Color.BLACK);
        g2d.drawLine(40, 55, 580, 55);
        g2d.drawLine(120, 55, 120, 115);
        g2d.drawLine(120, 115, 500, 115);
        g2d.drawLine(500, 55, 500, 115);
        g2d.drawLine(100, 170, 520, 170);
        g2d.drawLine(100, 55, 100, 170);
        g2d.drawLine(520, 55, 520, 170);
        g2d.drawLine(80, 230, 540, 230);
        g2d.drawLine(80, 55, 80, 230);
        g2d.drawLine(540, 55, 540, 230);
        g2d.drawLine(60, 290, 560, 290);
        g2d.drawLine(60, 55, 60, 290);
        g2d.drawLine(560, 55, 560, 290);
        g2d.drawLine(400, 345, 580, 345);
        g2d.drawLine(580, 55, 580, 345);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
