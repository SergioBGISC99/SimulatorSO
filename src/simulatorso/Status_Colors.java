package simulatorso;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Status_Colors extends DefaultTableCellRenderer {

    static Font obj = new Font("Dialog", Font.BOLD, 12);
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int r, int c) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, r, c);
        if (value == null) {
            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
        } else if (value.equals("Listo")) {
            this.setFont(obj);
            this.setBackground(new Color(255, 255, 77));
            this.setForeground(Color.BLACK);
        } else if (value.equals("Ejecutando")) {
            this.setFont(obj);
            this.setBackground(new Color(77, 255, 77));
            this.setForeground(Color.BLACK);
        } else if (value.equals("Bloqueado")) {
            this.setFont(obj);
            this.setBackground(new Color(255, 77, 77));
            this.setForeground(Color.BLACK);
        } else if (value.equals("Bloqueado / Suspendido")) {
            this.setFont(obj);
            this.setBackground(new Color(255, 173, 51));
            this.setForeground(Color.BLACK);
        } else if (value.equals("Listo / Suspendido")) {
            this.setFont(obj);
            this.setBackground(new Color(102, 204, 255));
            this.setForeground(Color.BLACK);
        } else if (value.equals("Terminado")) {
            this.setFont(obj);
            this.setBackground(new Color(0, 0, 77));
            this.setForeground(Color.WHITE);
        } else if (value.equals("Espera")) {
            this.setFont(obj);
            this.setBackground(new Color(0, 102, 153));
            this.setForeground(Color.WHITE);
        } else if (value.equals("Suspendido")) {
            this.setFont(obj);
            this.setBackground(new Color(140, 26, 255));
            this.setForeground(Color.WHITE);
        } else {
            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
        }
        return this;
    }
}
