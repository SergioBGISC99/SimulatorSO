package simulatorso;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class graphicPanel extends javax.swing.JPanel {

    static int linePos[] = {30, 60, 90, 120, 150, 180, 210, 240, 270, 300};

    public graphicPanel() {
        initComponents();
        setPreferredSize(new Dimension(1900, 350));
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
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        Shape back = new Rectangle2D.Double(0, 0, 2800, 800);
        g2d.fill(back);
        g2d.setColor(Color.BLACK);
        for (int i = 0; i < 10; i++) {
            g2d.drawString("" + (i + 1), 15, linePos[i]);
        }
        g2d.drawLine(40, 20, 40, 310);
        g2d.drawLine(40, 310, 1800, 310);
        if (Window.ready == true) {
            drawHistogram(g2d);
        }
    }

    public static void drawHistogram(Graphics2D g2d) {
        double interval;
        for (int i = 0; i < 10; i++) {
            Window.hist.get(i).TTP = Window.hist.get(i).TTPR;
        }
        for (int i = 0, j = 1; j < Window.hist.size(); i++, j++) {
            String difti[] = String.valueOf(Window.hist.get(i).getHIP()).split(":");
            String diftj[] = String.valueOf(Window.hist.get(j).getHIP()).split(":");
            if (Integer.parseInt(difti[1]) != Integer.parseInt(diftj[1])) {
                interval = Integer.parseInt(diftj[2]) + 60 - Integer.parseInt(difti[2]);
            } else {
                interval = Integer.parseInt(diftj[2]) - Integer.parseInt(difti[2]);
            }
            interval /= 60;
            Window.hist.get(i).INTERVAL = String.format("%.3f", interval);
        }
        int x1 = 40, x2 = 0;
        g2d.setStroke(new BasicStroke(1));
        for (int i = 0; i < 9; i++) {
            x2 = x1 + 70;
            String aux = MinusTTP(i, Double.parseDouble(Window.hist.get(i).INTERVAL));
            for (int j = 0; j < i + 1; j++) {
                g2d.drawLine(x1, linePos[Window.hist.get(j).pos], x2, linePos[Window.hist.get(j).pos]);
            }
            g2d.drawString("" + aux, x1 + 10, 325);
            x1 = x2;
            g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10f, new float[]{10, 5}, 0));
            g2d.drawLine(x1, 25, x1, 325);
            g2d.setStroke(new BasicStroke(1));
            g2d.drawString(String.valueOf(Window.hist.get(i + 1).HIP), x1 + 10, 340);
        }
        String line = finish(Window.hist.getLast().HIP, x1, x2 + 100, g2d, 9);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 8);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 7);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 6);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 5);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 4);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 3);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 2);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 1);
        x1 += 100;
        x2 += 100;
        line = finish(line, x1, x2 + 100, g2d, 0);
    }

    public static String MinusTTP(int pos, double inter) {
        double tableValue = Double.parseDouble(String.valueOf(Window.graphic_jTable.getValueAt(2, pos))), aux = 0;
        tableValue *= inter;
        for (int i = 0; i < pos + 1; i++) {
            aux = Double.parseDouble(Window.hist.get(i).TTP) - tableValue;
            Window.hist.get(i).TTP = String.format("%.3f", aux);
        }
        return String.format("%.3f", tableValue);
    }

    public static String finish(String interval, int x1, int x2, Graphics2D g2d, int quantity) {
        double pos = -1, aux;
        for (int i = 0; i < Window.hist.size(); i++) {
            if (Double.parseDouble(Window.hist.get(i).TTP) > 0 && pos == -1) {
                pos = Double.parseDouble(Window.hist.get(i).TTP);
            } else if (pos > Double.parseDouble(Window.hist.get(i).TTP) && Double.parseDouble(Window.hist.get(i).TTP) > 0) {
                pos = Double.parseDouble(Window.hist.get(i).TTP);
            }
        }
        g2d.setStroke(new BasicStroke(1));
        for (int i = 0; i < Window.hist.size(); i++) {
            if (Double.parseDouble(Window.hist.get(i).TTP) > 0) {
                g2d.drawLine(x1, linePos[Window.hist.get(i).pos], x2, linePos[Window.hist.get(i).pos]);
            }
            g2d.setStroke(new BasicStroke(1));
            g2d.drawString(pos + " ", x1 + 10, 325);
            aux = Double.parseDouble(Window.hist.get(i).TTP) - pos;
            Window.hist.get(i).TTP = String.format("%.3f", aux);
        }
        g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10f, new float[]{10, 5}, 0));
        g2d.drawLine(x2, 25, x2, 325);
        g2d.setStroke(new BasicStroke(1));
        double timeD = pos / Double.parseDouble(String.valueOf(Window.graphic_jTable.getValueAt(2, quantity)));
        String timeS = String.format("%.3f", timeD);
        timeD = Double.parseDouble(timeS);
        int min = (int) timeD;
        timeD -= min;
        timeD *= 60;
        String hour[] = interval.split(":");
        int sec = (int) (Integer.parseInt(hour[2]) + timeD);
        int mas = 0;
        while (sec >= 60) {
            sec -= 60;
            mas++;
        }
        min += mas;
        min += Integer.parseInt(hour[1]);
        mas = 0;
        while (min >= 60) {
            min -= 60;
            mas++;
        }
        int hours = mas + Integer.parseInt(hour[0]);
        String nHour = hours + ":" + min + ":" + sec;
        g2d.drawString(nHour, x2, 340);
        return nHour;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
