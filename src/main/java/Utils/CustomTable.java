package Utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class CustomTable {
    private void setCenterRenderer(JTable table, int columnIndex) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        centerRenderer.setBackground(Color.WHITE);
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
    }
    
    public void customJTable(JTable table) {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setForeground(Color.BLACK);
        tableHeader.setFont(new Font("Tahoma", Font.BOLD, 13));

        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        headerRenderer.setOpaque(false);

        Dimension headerSize = tableHeader.getPreferredSize();
        headerSize.height = 30;
        tableHeader.setPreferredSize(headerSize);

        for (int i = 0; i < table.getColumnCount(); i++) {
            setCenterRenderer(table, i);
            table.getColumnModel().getColumn(i).setCellEditor(null); 
        }
    }
}
