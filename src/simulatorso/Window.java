package simulatorso;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class Window extends javax.swing.JFrame {

    static boolean ready = false, loaded = false, loaded2 = false;
    Calendar cal = Calendar.getInstance();
    Date PST[] = new Date[10];
    Date S1T[] = new Date[10];
    Date S2T[] = new Date[10];
    Date BST[] = new Date[10];
    Date RST[] = new Date[10];
    static DecimalFormat df4 = new DecimalFormat(".0000");
    int suc[] = {20, 30, 40, 50};
    int ram[] = {256, 512, 640, 1024};
    int random;
    static int contExe = 0;
    static LinkedList<Graphic> hist = new LinkedList<>();
    static LinkedList<Task> task = new LinkedList<>();
    static LinkedList<Task> taskC = new LinkedList<>();
    static LinkedList fini = new LinkedList();
    static String estatus[] = {"Listo", "Ejecutando", "Bloqueado", "Bloqueado", "Bloqueado / Suspendido", "Listo / Suspendido", "Terminado", "Suspendido", "Espera"};
    static Status_Colors colors = new Status_Colors();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public Window() {
        initComponents();
        setBoxPriority(main_jTable, main_jTable.getColumnModel().getColumn(4));
        setBoxEvent1(main_jTable, main_jTable.getColumnModel().getColumn(6));
        setBoxEvent2(main_jTable, main_jTable.getColumnModel().getColumn(9));
        setBoxRM(main_jTable, main_jTable.getColumnModel().getColumn(16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hour_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        main_jTable = new javax.swing.JTable();
        loadTable_button = new javax.swing.JButton();
        start_button = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        linesPanel2 = new simulatorso.linesPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ready_jTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        exe_jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        suc1_jTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        suc2_jTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        blosus_jTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        lissus_jTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        terminado_jTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        graphic_jTable = new javax.swing.JTable();
        graphic_button = new javax.swing.JButton();
        cpu_combo = new javax.swing.JComboBox<>();
        jScrollPane15 = new javax.swing.JScrollPane();
        graphicPanel1 = new simulatorso.graphicPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        parthner_jTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        ram_jTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        virtual_jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("HORA DEL SISTEMA:");

        hour_label.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hour_label.setForeground(new java.awt.Color(0, 102, 102));
        hour_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hour_label.setText("00:00:00");

        main_jTable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        main_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "HIP", "TTP", "Q", "P", "ESTATUS", "SUC1", "HISUC1", "TTSUC1", "SUC2", "HISUC2", "TTSUC2", "HIBS", "TTBS", "HILS", "TTLS", "RM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        main_jTable.setShowGrid(true);
        main_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(main_jTable);
        if (main_jTable.getColumnModel().getColumnCount() > 0) {
            main_jTable.getColumnModel().getColumn(0).setResizable(false);
            main_jTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            main_jTable.getColumnModel().getColumn(1).setResizable(false);
            main_jTable.getColumnModel().getColumn(1).setPreferredWidth(43);
            main_jTable.getColumnModel().getColumn(2).setResizable(false);
            main_jTable.getColumnModel().getColumn(2).setPreferredWidth(21);
            main_jTable.getColumnModel().getColumn(3).setResizable(false);
            main_jTable.getColumnModel().getColumn(3).setPreferredWidth(4);
            main_jTable.getColumnModel().getColumn(4).setResizable(false);
            main_jTable.getColumnModel().getColumn(4).setPreferredWidth(5);
            main_jTable.getColumnModel().getColumn(5).setResizable(false);
            main_jTable.getColumnModel().getColumn(5).setPreferredWidth(124);
            main_jTable.getColumnModel().getColumn(6).setResizable(false);
            main_jTable.getColumnModel().getColumn(6).setPreferredWidth(31);
            main_jTable.getColumnModel().getColumn(7).setResizable(false);
            main_jTable.getColumnModel().getColumn(7).setPreferredWidth(43);
            main_jTable.getColumnModel().getColumn(8).setResizable(false);
            main_jTable.getColumnModel().getColumn(8).setPreferredWidth(41);
            main_jTable.getColumnModel().getColumn(9).setResizable(false);
            main_jTable.getColumnModel().getColumn(9).setPreferredWidth(31);
            main_jTable.getColumnModel().getColumn(10).setResizable(false);
            main_jTable.getColumnModel().getColumn(10).setPreferredWidth(43);
            main_jTable.getColumnModel().getColumn(11).setResizable(false);
            main_jTable.getColumnModel().getColumn(11).setPreferredWidth(41);
            main_jTable.getColumnModel().getColumn(12).setResizable(false);
            main_jTable.getColumnModel().getColumn(12).setPreferredWidth(43);
            main_jTable.getColumnModel().getColumn(13).setResizable(false);
            main_jTable.getColumnModel().getColumn(13).setPreferredWidth(31);
            main_jTable.getColumnModel().getColumn(14).setResizable(false);
            main_jTable.getColumnModel().getColumn(14).setPreferredWidth(43);
            main_jTable.getColumnModel().getColumn(15).setResizable(false);
            main_jTable.getColumnModel().getColumn(15).setPreferredWidth(31);
            main_jTable.getColumnModel().getColumn(16).setResizable(false);
            main_jTable.getColumnModel().getColumn(16).setPreferredWidth(20);
        }

        loadTable_button.setText("CARGAR TABLA");
        loadTable_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTable_buttonActionPerformed(evt);
            }
        });

        start_button.setText("INICIAR SIM.");
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(start_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loadTable_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hour_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hour_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadTable_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start_button)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        linesPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTO");

        ready_jTable.setBackground(new java.awt.Color(255, 255, 77));
        ready_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ready_jTable.setShowGrid(true);
        ready_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(ready_jTable);
        if (ready_jTable.getColumnModel().getColumnCount() > 0) {
            ready_jTable.getColumnModel().getColumn(0).setResizable(false);
            ready_jTable.getColumnModel().getColumn(1).setResizable(false);
            ready_jTable.getColumnModel().getColumn(2).setResizable(false);
            ready_jTable.getColumnModel().getColumn(3).setResizable(false);
            ready_jTable.getColumnModel().getColumn(4).setResizable(false);
            ready_jTable.getColumnModel().getColumn(5).setResizable(false);
            ready_jTable.getColumnModel().getColumn(6).setResizable(false);
            ready_jTable.getColumnModel().getColumn(7).setResizable(false);
            ready_jTable.getColumnModel().getColumn(8).setResizable(false);
            ready_jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EJECUTANDO");

        exe_jTable.setBackground(new java.awt.Color(77, 255, 77));
        exe_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        exe_jTable.setShowGrid(true);
        exe_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(exe_jTable);
        if (exe_jTable.getColumnModel().getColumnCount() > 0) {
            exe_jTable.getColumnModel().getColumn(0).setResizable(false);
            exe_jTable.getColumnModel().getColumn(1).setResizable(false);
            exe_jTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BLOQUEO 1");

        suc1_jTable.setBackground(new java.awt.Color(255, 77, 77));
        suc1_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        suc1_jTable.setShowGrid(true);
        suc1_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(suc1_jTable);
        if (suc1_jTable.getColumnModel().getColumnCount() > 0) {
            suc1_jTable.getColumnModel().getColumn(0).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(1).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(2).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(3).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(4).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(5).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(6).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(7).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(8).setResizable(false);
            suc1_jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BLOQUEO 2");

        suc2_jTable.setBackground(new java.awt.Color(255, 77, 77));
        suc2_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        suc2_jTable.setShowGrid(true);
        suc2_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(suc2_jTable);
        if (suc2_jTable.getColumnModel().getColumnCount() > 0) {
            suc2_jTable.getColumnModel().getColumn(0).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(1).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(2).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(3).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(4).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(5).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(6).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(7).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(8).setResizable(false);
            suc2_jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BLOQUEADO / SUSPENDIDO");

        blosus_jTable.setBackground(new java.awt.Color(255, 173, 51));
        blosus_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        blosus_jTable.setShowGrid(true);
        blosus_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(blosus_jTable);
        if (blosus_jTable.getColumnModel().getColumnCount() > 0) {
            blosus_jTable.getColumnModel().getColumn(0).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(1).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(2).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(3).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(4).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(5).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(6).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(7).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(8).setResizable(false);
            blosus_jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LISTO / SUSPENDIDO");

        lissus_jTable.setBackground(new java.awt.Color(102, 204, 255));
        lissus_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lissus_jTable.setShowGrid(true);
        lissus_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(lissus_jTable);
        if (lissus_jTable.getColumnModel().getColumnCount() > 0) {
            lissus_jTable.getColumnModel().getColumn(0).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(1).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(2).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(3).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(4).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(5).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(6).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(7).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(8).setResizable(false);
            lissus_jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TERMINADO");

        terminado_jTable.setBackground(new java.awt.Color(0, 0, 77));
        terminado_jTable.setForeground(new java.awt.Color(255, 255, 255));
        terminado_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        terminado_jTable.setShowGrid(true);
        terminado_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(terminado_jTable);
        if (terminado_jTable.getColumnModel().getColumnCount() > 0) {
            terminado_jTable.getColumnModel().getColumn(0).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(1).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(2).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(3).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(4).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(5).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(6).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(7).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(8).setResizable(false);
            terminado_jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout linesPanel2Layout = new javax.swing.GroupLayout(linesPanel2);
        linesPanel2.setLayout(linesPanel2Layout);
        linesPanel2Layout.setHorizontalGroup(
            linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linesPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(294, 294, 294))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linesPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, linesPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(267, 267, 267))
        );
        linesPanel2Layout.setVerticalGroup(
            linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linesPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(linesPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(linesPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(linesPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(linesPanel2);

        graphic_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        graphic_jTable.setShowGrid(true);
        jScrollPane14.setViewportView(graphic_jTable);
        if (graphic_jTable.getColumnModel().getColumnCount() > 0) {
            graphic_jTable.getColumnModel().getColumn(0).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(1).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(2).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(3).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(4).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(5).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(5).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(6).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(6).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(7).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(7).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(8).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(8).setPreferredWidth(20);
            graphic_jTable.getColumnModel().getColumn(9).setResizable(false);
            graphic_jTable.getColumnModel().getColumn(9).setPreferredWidth(20);
        }

        graphic_button.setText("CARGAR TABLA");
        graphic_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphic_buttonActionPerformed(evt);
            }
        });

        cpu_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.20", "0.50", "0.80" }));

        javax.swing.GroupLayout graphicPanel1Layout = new javax.swing.GroupLayout(graphicPanel1);
        graphicPanel1.setLayout(graphicPanel1Layout);
        graphicPanel1Layout.setHorizontalGroup(
            graphicPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2300, Short.MAX_VALUE)
        );
        graphicPanel1Layout.setVerticalGroup(
            graphicPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jScrollPane15.setViewportView(graphicPanel1);

        jLabel9.setText("CPU Ocioso");

        jLabel10.setText("CPU Ocupado");

        jLabel11.setText("CPU / Procesos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(graphic_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                            .addComponent(cpu_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graphic_button)
                    .addComponent(cpu_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel4);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SISTEMA COMPAÑERO");

        parthner_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "128", "256", "384", "512", "640", "768", "896", "1024", "1152", "1280", "1408", "1536", "1664", "1792", "1920", "2048", "2176", "2304", "2432", "2560", "2688", "2816", "2944", "3072", "3200", "3328", "3456", "3584", "3712", "3840", "3968", "4096", "4224", "4352", "4480", "4608", "4736", "4864", "4992", "5120", "5248", "5376", "5504", "5632", "5760", "5888", "6016", "6144", "6272", "6400", "6528", "6656", "6784", "6912", "7040", "7168", "7296", "7424", "7552", "7680", "7808", "7936"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        parthner_jTable.setShowGrid(true);
        parthner_jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane17.setViewportView(parthner_jTable);
        if (parthner_jTable.getColumnModel().getColumnCount() > 0) {
            parthner_jTable.getColumnModel().getColumn(0).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(1).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(2).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(3).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(4).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(5).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(6).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(7).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(8).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(9).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(10).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(11).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(12).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(13).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(14).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(15).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(16).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(17).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(18).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(19).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(20).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(21).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(22).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(23).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(24).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(25).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(26).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(27).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(28).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(29).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(30).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(31).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(32).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(33).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(34).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(35).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(36).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(37).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(38).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(39).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(40).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(41).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(42).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(43).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(44).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(45).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(46).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(47).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(48).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(49).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(50).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(51).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(52).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(53).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(54).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(55).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(56).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(57).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(58).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(59).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(60).setResizable(false);
            parthner_jTable.getColumnModel().getColumn(61).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 2461, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane16.setViewportView(jPanel3);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MEMORIA RAM");

        ram_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ram_jTable.setShowGrid(true);
        jScrollPane18.setViewportView(ram_jTable);
        if (ram_jTable.getColumnModel().getColumnCount() > 0) {
            ram_jTable.getColumnModel().getColumn(0).setResizable(false);
            ram_jTable.getColumnModel().getColumn(1).setResizable(false);
            ram_jTable.getColumnModel().getColumn(2).setResizable(false);
            ram_jTable.getColumnModel().getColumn(3).setResizable(false);
            ram_jTable.getColumnModel().getColumn(4).setResizable(false);
            ram_jTable.getColumnModel().getColumn(5).setResizable(false);
            ram_jTable.getColumnModel().getColumn(6).setResizable(false);
            ram_jTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MEMORIA VIRTUAL");

        virtual_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        virtual_jTable.setShowGrid(true);
        jScrollPane19.setViewportView(virtual_jTable);
        if (virtual_jTable.getColumnModel().getColumnCount() > 0) {
            virtual_jTable.getColumnModel().getColumn(0).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(1).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(2).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(3).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(4).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(5).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(6).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(7).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(8).setResizable(false);
            virtual_jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadTable_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTable_buttonActionPerformed
        // TODO add your handling code here:
        loaded = true;
        main_jTable.setDefaultRenderer(Object.class, colors);
        //ID
        int idArray[] = new int[10];
        idArray[0] = (int) (Math.random() * (999 - 100)) + 100;
        for (int i = 1; i < 10; i++) {
            idArray[i] = (int) (Math.random() * (999 - 100)) + 100;
            for (int j = 0; j < i; j++) {
                if (idArray[i] == idArray[j]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            main_jTable.setValueAt(idArray[i], i, 0);
        }
        //HORA DE INICIO PROCESO
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                cal.setTime(new Date());
                cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) + 1);
            } else {
                random = (int) (Math.random() * (60 - 30)) + 30;
                cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + random);
            }
            PST[i] = cal.getTime();
            String pst = dateFormat.format(PST[i]);
            main_jTable.setValueAt(pst, i, 1);
        }
        //TIEMPO TOTAL DE PROCESAMIENTO
        for (int i = 0; i < 10; i++) {
            int TTP = (int) (Math.random() * (300 - 240)) + 240;
            main_jTable.setValueAt(TTP, i, 2);
        }
        //QUANTUM
        for (int i = 0; i < 10; i++) {
            main_jTable.setValueAt(5, i, 3);
        }
        //PRIORIDAD
        for (int i = 0; i < 10; i++) {
            int PRI = (int) (Math.random() * 11);
            main_jTable.setValueAt(PRI, i, 4);
        }
        //SUCESO 1
        for (int i = 0; i < 10; i++) {
            int suc1 = (int) (Math.random() * 4);
            main_jTable.setValueAt(suc[suc1], i, 6);
        }
        //HORA DE INICIO SUCESO 1
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * (60 - 30)) + 30;
            cal.setTime(PST[i]);
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + random);
            S1T[i] = cal.getTime();
            String s1t = dateFormat.format(S1T[i]);
            main_jTable.setValueAt(s1t, i, 7);
        }
        //TIEMPO TOTAL SUCESO 1
        for (int i = 0; i < 10; i++) {
            if ((int) main_jTable.getValueAt(i, 6) != 50) {
                random = (int) (Math.random() * (40 - 20)) + 20;
            } else {
                random = 120;
            }
            main_jTable.setValueAt(random, i, 8);
        }
        //SUCESO 2
        for (int i = 0; i < 10; i++) {
            int suc2 = (int) (Math.random() * 4);
            main_jTable.setValueAt(suc[suc2], i, 9);
        }
        //HORA DE INICIO SUCESO 2
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * (60 - 30)) + 30;
            cal.setTime(S1T[i]);
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + (int) main_jTable.getValueAt(i, 8) + random);
            S2T[i] = cal.getTime();
            String s2t = dateFormat.format(S2T[i]);
            main_jTable.setValueAt(s2t, i, 10);
        }
        //TIEMPO TOTAL SUCESO 2
        for (int i = 0; i < 10; i++) {
            if ((int) main_jTable.getValueAt(i, 9) != 50) {
                random = (int) (Math.random() * (40 - 20)) + 20;
            } else {
                random = 120;
            }
            main_jTable.setValueAt(random, i, 11);
        }
        //HORA DE INICIO BLOQUEADO / SUSPENDIDO
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * (60 - 30)) + 30;
            cal.setTime(S2T[i]);
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + (int) main_jTable.getValueAt(i, 11) + random);
            BST[i] = cal.getTime();
            String bst = dateFormat.format(BST[i]);
            main_jTable.setValueAt(bst, i, 12);
        }
        //TIEMPO TOTAL BLOQUEADO / SUSPENDIDO
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * (40 - 20)) + 20;
            main_jTable.setValueAt(random, i, 13);
        }
        //HORA DE INICIO LISTO / SUSPENDIDO
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * (60 - 30)) + 30;
            cal.setTime(BST[i]);
            cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + (int) main_jTable.getValueAt(i, 13) + random);
            RST[i] = cal.getTime();
            String rst = dateFormat.format(RST[i]);
            main_jTable.setValueAt(rst, i, 14);
        }
        //TIEMPO TOTAL LISTO / SUSPENDIDO
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * (40 - 20)) + 20;
            main_jTable.setValueAt(random, i, 15);
        }
        //REQUERIMIENTO DE MEMORIA
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * 4);
            main_jTable.setValueAt(ram[random], i, 16);
        }
    }//GEN-LAST:event_loadTable_buttonActionPerformed

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        // TODO add your handling code here:
        if (loaded == true && loaded2 == true) {
            loadTable_button.setEnabled(false);
            start_button.setEnabled(false);
            main_jTable.clearSelection();
            main_jTable.setEnabled(false);
            graphic_button.setEnabled(false);
            graphic_jTable.clearSelection();
            graphic_jTable.setEnabled(false);
            cpu_combo.setEnabled(false);
            ready = true;
            for (int i = 0; i < 10; i++) {
                int ID = (int) main_jTable.getValueAt(i, 0);
                String HIP = (String) main_jTable.getValueAt(i, 1);
                int TTP = (int) main_jTable.getValueAt(i, 2);
                int Q = (int) main_jTable.getValueAt(i, 3);
                int P = (int) main_jTable.getValueAt(i, 4);
                int SUC1 = (int) main_jTable.getValueAt(i, 6);
                String HISUC1 = (String) main_jTable.getValueAt(i, 7);
                int TTSUC1 = (int) main_jTable.getValueAt(i, 8);
                int SUC2 = (int) main_jTable.getValueAt(i, 9);
                String HISUC2 = (String) main_jTable.getValueAt(i, 10);
                int TTSUC2 = (int) main_jTable.getValueAt(i, 11);
                String HIBS = (String) main_jTable.getValueAt(i, 12);
                int TTBS = (int) main_jTable.getValueAt(i, 13);
                String HILS = (String) main_jTable.getValueAt(i, 14);
                int TTLS = (int) main_jTable.getValueAt(i, 15);
                int RM = (int) main_jTable.getValueAt(i, 16);
                Task newTask = new Task(ID, HIP, TTP, Q, P, 8, SUC1, HISUC1, TTSUC1, SUC2, HISUC2, TTSUC2, HIBS, TTBS, HILS, TTLS, RM, false, false, false);
                task.add(newTask);
                taskC.add(newTask);
            }
            task.sort(null);
            for (int i = 0; i < 10; i++) {
                Graphic quad3 = new Graphic(String.format("%.3f", ((double) taskC.get(i).getTTP())), taskC.get(i).getHIP(), String.format("%.3f", ((double) taskC.get(i).getTTP() / 60)), null, i);
                hist.add(quad3);
            }
            paintStatus();
        } else {
            JOptionPane.showMessageDialog(this, "Debe cargar las tablas primero");
        }
    }//GEN-LAST:event_start_buttonActionPerformed

    private void graphic_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphic_buttonActionPerformed
        // TODO add your handling code here:
        histogramTable();
        loaded2 = true;
    }//GEN-LAST:event_graphic_buttonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
        updateTime();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable blosus_jTable;
    private static javax.swing.JComboBox<String> cpu_combo;
    private static javax.swing.JTable exe_jTable;
    private simulatorso.graphicPanel graphicPanel1;
    private javax.swing.JButton graphic_button;
    static javax.swing.JTable graphic_jTable;
    private static javax.swing.JLabel hour_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private simulatorso.linesPanel linesPanel2;
    private static javax.swing.JTable lissus_jTable;
    private javax.swing.JButton loadTable_button;
    static javax.swing.JTable main_jTable;
    private static javax.swing.JTable parthner_jTable;
    private static javax.swing.JTable ram_jTable;
    private static javax.swing.JTable ready_jTable;
    private javax.swing.JButton start_button;
    private static javax.swing.JTable suc1_jTable;
    private static javax.swing.JTable suc2_jTable;
    private static javax.swing.JTable terminado_jTable;
    private static javax.swing.JTable virtual_jTable;
    // End of variables declaration//GEN-END:variables

    public static void updateTime() {
        while (true) {
            try {
                Date date = new Date();
                String time = dateFormat.format(date);
                hour_label.setText(time);
                if (ready == true) {
                    startTasks();
                }
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static void paintStatus() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (task.get(i).getID() == (int) main_jTable.getValueAt(j, 0)) {
                    main_jTable.setValueAt(estatus[task.get(i).getSTATUS()], j, 5);
                }
            }
        }
    }

    public static void checkPriority() {
        int memoryUsed = 0;
        for (int i = 0; i < 10; i++) {
            if (memoryUsed + task.get(i).getRM() <= 8000 && task.get(i).getActive() == true && (task.get(i).getSTATUS() != 4 || task.get(i).getSTATUS() != 5)) {
                switch (task.get(i).getSTATUS()) {
                    case 0 ->
                        memoryUsed += task.get(i).getRM();
                    case 1 ->
                        memoryUsed += task.get(i).getRM();
                    case 2 ->
                        memoryUsed += task.get(i).getRM();
                    case 3 ->
                        memoryUsed += task.get(i).getRM();
                    default -> {
                    }
                }
            } else if (task.get(i).getActive() == true && (task.get(i).getSTATUS() == 0 || task.get(i).getSTATUS() == 1 || task.get(i).getSTATUS() == 2 || task.get(i).getSTATUS() == 3)) {
                if (task.get(i).getSTATUS() == 1) {
                    contExe--;
                }
                task.get(i).setSTATUS(7);
            }
        }
    }

    public static void startTasks() {
        for (int i = 0; i < 10; i++) {
            if (hour_label.getText().equals(task.get(i).getHIP())) {
                task.get(i).setSTATUS(0);
                task.get(i).setActive(true);
                break;
            }
            if (task.get(i).getSTATUS() == 0 && contExe < 3) {
                contExe++;
                task.get(i).setSTATUS(1);
            }
            if (hour_label.getText().equals(task.get(i).getHISUC1())) {
                task.get(i).setS1act(true);
                switch (task.get(i).getSTATUS()) {
                    case 0 ->
                        task.get(i).setSTATUS(2);
                    case 1 -> {
                        contExe--;
                        task.get(i).setQ(5);
                        task.get(i).setSTATUS(2);
                    }
                    case 7 ->
                        task.get(i).setSTATUS(2);
                    default -> {
                    }
                }
            }
            if (hour_label.getText().equals(task.get(i).getHISUC2())) {
                task.get(i).setS2act(true);
                switch (task.get(i).getSTATUS()) {
                    case 0 ->
                        task.get(i).setSTATUS(3);
                    case 1 -> {
                        contExe--;
                        task.get(i).setQ(5);
                        task.get(i).setSTATUS(3);
                    }
                    case 2 ->
                        task.get(i).setSTATUS(3);
                    case 7 ->
                        task.get(i).setSTATUS(3);
                    default -> {
                    }
                }
            }
            if (hour_label.getText().equals(task.get(i).getHIBS())) {
                switch (task.get(i).getSTATUS()) {
                    case 0 ->
                        task.get(i).setSTATUS(4);
                    case 1 -> {
                        contExe--;
                        task.get(i).setQ(5);
                        task.get(i).setSTATUS(4);
                    }
                    case 2 ->
                        task.get(i).setSTATUS(4);
                    case 3 ->
                        task.get(i).setSTATUS(4);
                    case 7 ->
                        task.get(i).setSTATUS(4);
                    default -> {
                    }
                }
            }
            if (hour_label.getText().equals(task.get(i).getHILS())) {
                switch (task.get(i).getSTATUS()) {
                    case 0 ->
                        task.get(i).setSTATUS(5);
                    case 1 -> {
                        contExe--;
                        task.get(i).setQ(5);
                        task.get(i).setSTATUS(5);
                    }
                    case 2 ->
                        task.get(i).setSTATUS(5);
                    case 3 ->
                        task.get(i).setSTATUS(5);
                    case 7 ->
                        task.get(i).setSTATUS(5);
                    default -> {
                    }
                }
            }
        }
        checkPriority();
        for (int i = 0; i < 10; i++) {
            if (task.get(i).getSTATUS() == 1) {
                task.get(i).setQ(task.get(i).getQ() - 1);
                if (task.get(i).getQ() >= 0) {
                    task.get(i).setTTP(task.get(i).getTTP() - 1);
                }
                for (int j = 0; j < 10; j++) {
                    if (task.get(i).getID() == (Integer) main_jTable.getValueAt(j, 0)) {
                        main_jTable.setValueAt(task.get(i).getQ(), j, 3);
                        main_jTable.setValueAt(task.get(i).getTTP(), j, 2);
                        if (task.get(i).getQ() == -1) {
                            task.get(i).setQ(5);
                            task.get(i).setSTATUS(0);
                            main_jTable.setValueAt(task.get(i).getQ(), j, 3);
                            contExe--;
                        }
                        if (task.get(i).getTTP() == 0) {
                            task.get(i).setQ(5);
                            task.get(i).setSTATUS(6);
                            main_jTable.setValueAt(task.get(i).getQ(), j, 3);
                            contExe--;
                            task.get(i).setActive(false);
                            fini.add(task.get(i).getID());
                        }
                    }
                }
            }
            if (task.get(i).getSTATUS() == 2) {
                task.get(i).setTTSUC1(task.get(i).getTTSUC1() - 1);
                for (int j = 0; j < 10; j++) {
                    if (task.get(i).getID() == (Integer) main_jTable.getValueAt(j, 0)) {
                        main_jTable.setValueAt(task.get(i).getQ(), j, 3);
                        main_jTable.setValueAt(task.get(i).getTTSUC1(), j, 8);
                        if (task.get(i).getTTSUC1() == 0) {
                            task.get(i).setSTATUS(0);
                            task.get(i).setS1act(false);
                        }
                    }
                }
            }
            if (task.get(i).getSTATUS() == 3) {
                task.get(i).setTTSUC2(task.get(i).getTTSUC2() - 1);
                for (int j = 0; j < 10; j++) {
                    if (task.get(i).getID() == (Integer) main_jTable.getValueAt(j, 0)) {
                        main_jTable.setValueAt(task.get(i).getQ(), j, 3);
                        main_jTable.setValueAt(task.get(i).getTTSUC2(), j, 11);
                        if (task.get(i).getTTSUC2() == 0) {
                            task.get(i).setS2act(false);
                            if (task.get(i).getTTSUC1() != 0) {
                                task.get(i).setSTATUS(2);
                            } else if (task.get(i).getTTP() != 0) {
                                task.get(i).setSTATUS(0); 
                            }
                        }
                    }
                }
            }
            if (task.get(i).getSTATUS() == 4) {
                task.get(i).setTTBS(task.get(i).getTTBS() - 1);
                for (int j = 0; j < 10; j++) {
                    if (task.get(i).getID() == (Integer) main_jTable.getValueAt(j, 0)) {
                        main_jTable.setValueAt(task.get(i).getQ(), j, 3);
                        main_jTable.setValueAt(task.get(i).getTTBS(), j, 13);
                        if (task.get(i).getTTBS() == 0) {
                            if (task.get(i).getTTSUC2() != 0) {
                                task.get(i).setSTATUS(3);
                            } else if (task.get(i).getTTSUC1() != 0) {
                                task.get(i).setSTATUS(2);
                            } else if (task.get(i).getTTP() != 0) {
                                task.get(i).setSTATUS(0);
                            }
                        }
                    }
                }
            }
            if (task.get(i).getSTATUS() == 5) {
                task.get(i).setTTLS(task.get(i).getTTLS() - 1);
                for (int j = 0; j < 10; j++) {
                    if (task.get(i).getID() == (Integer) main_jTable.getValueAt(j, 0)) {
                        main_jTable.setValueAt(task.get(i).getQ(), j, 3);
                        main_jTable.setValueAt(task.get(i).getTTLS(), j, 15);
                        if (task.get(i).getTTLS() == 0) {
                            if (task.get(i).getTTBS() != 0) {
                                task.get(i).setSTATUS(4);
                            } else if (task.get(i).getTTSUC2() != 0) {
                                task.get(i).setSTATUS(3);
                            } else if (task.get(i).getTTSUC1() != 0) {
                                task.get(i).setSTATUS(2);
                            } else if (task.get(i).getTTP() != 0) {
                                task.get(i).setSTATUS(0);
                            }
                        }
                    }
                }
            }
            if (task.get(i).getSTATUS() == 7 && task.get(i).getActive() == true) {
                if (task.get(i).getTTP() != 0) {
                    task.get(i).setSTATUS(0);
                }
                if (task.get(i).getTTSUC1() != 0 && task.get(i).getS1act() == true) {
                    task.get(i).setSTATUS(2);
                }
                if (task.get(i).getTTSUC2() != 0 && task.get(i).getS2act() == true) {
                    task.get(i).setSTATUS(3);
                }
            }
        }
        checkPriority();
        paintStatus();
        printStatusTable();
        parthnerSystem();
    }

    public static void printStatusTable() {
        LinkedList read = new LinkedList();
        LinkedList exec = new LinkedList();
        LinkedList suc1 = new LinkedList();
        LinkedList suc2 = new LinkedList();
        LinkedList bloS = new LinkedList();
        LinkedList reaS = new LinkedList();

        for (int i = 0; i < task.size(); i++) {
            if (task.get(i).getActive() == true) {
                switch (task.get(i).getSTATUS()) {
                    case 0 ->
                        read.add(task.get(i).getID());
                    case 1 ->
                        exec.add(task.get(i).getID());
                    case 2 ->
                        suc1.add(task.get(i).getID());
                    case 3 ->
                        suc2.add(task.get(i).getID());
                    case 4 ->
                        bloS.add(task.get(i).getID());
                    case 5 ->
                        reaS.add(task.get(i).getID());
                    default -> {
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            ready_jTable.setValueAt(null, 0, i);
            suc1_jTable.setValueAt(null, 0, i);
            suc2_jTable.setValueAt(null, 0, i);
            blosus_jTable.setValueAt(null, 0, i);
            lissus_jTable.setValueAt(null, 0, i);
        }
        for (int i = 0; i < 3; i++) {
            exe_jTable.setValueAt(null, 0, i);
        }
        for (int i = 0; i < read.size(); i++) {
            ready_jTable.setValueAt(read.get(i), 0, i);
        }
        for (int i = 0; i < exec.size(); i++) {
            exe_jTable.setValueAt(exec.get(i), 0, i);
        }
        for (int i = 0; i < suc1.size(); i++) {
            suc1_jTable.setValueAt(suc1.get(i), 0, i);
        }
        for (int i = 0; i < suc2.size(); i++) {
            suc2_jTable.setValueAt(suc2.get(i), 0, i);
        }
        for (int i = 0; i < bloS.size(); i++) {
            blosus_jTable.setValueAt(bloS.get(i), 0, i);
        }
        for (int i = 0; i < reaS.size(); i++) {
            lissus_jTable.setValueAt(reaS.get(i), 0, i);
        }
        for (int i = 0; i < fini.size(); i++) {
            terminado_jTable.setValueAt(fini.get(i), 0, i);
        }
    }

    public static void histogramTable() {
        double cpuValue = Double.parseDouble((String) cpu_combo.getSelectedItem());
        for (int i = 0; i < 10; i++) {
            double idleCPU = Math.pow(cpuValue, i + 1);
            double busyCPU = 1 - idleCPU;
            double prosCPU = busyCPU / (i + 1);
            graphic_jTable.setValueAt(df4.format(idleCPU), 0, i);
            graphic_jTable.setValueAt(df4.format(busyCPU), 1, i);
            graphic_jTable.setValueAt(df4.format(prosCPU), 2, i);
        }
    }

    public static void parthnerSystem() {
        LinkedList parthner = new LinkedList();
        LinkedList virtualM = new LinkedList();
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            virtualM.add(0);
            int spaces = 0;
            if (taskC.get(i).getActive()) {
                if (taskC.get(i).getSTATUS() == 0 || taskC.get(i).getSTATUS() == 1 || taskC.get(i).getSTATUS() == 2 || taskC.get(i).getSTATUS() == 3) {
                    spaces = taskC.get(i).getRM() / 128;
                    for (int j = 0; j < spaces; j++) {
                        parthner.add(taskC.get(i).getID());
                    }
                    virtualM.set(i, 0);
                } else if (taskC.get(i).getSTATUS() == 4 || taskC.get(i).getSTATUS() == 5 || taskC.get(i).getSTATUS() == 7) {
                    virtualM.set(i, taskC.get(i).getID());
                }
            }
        }
        for (int i = 0; i < 62; i++) {
            parthner_jTable.setValueAt(null, 0, i);
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ram_jTable.setValueAt(null, i, j);
            }
        }
        for (int i = 0; i < 10; i++) {
            virtual_jTable.setValueAt(null, 0, i);
        }
        for (int i = 0; i < parthner.size(); i++) {
            parthner_jTable.setValueAt(parthner.get(i), 0, i);
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (cont < parthner.size()) {
                    ram_jTable.setValueAt(parthner.get(cont++), i, j);
                }
            }
        }
        for (int i = 0; i < virtualM.size(); i++) {
            virtual_jTable.setValueAt(virtualM.get(i), 0, i);
        }
    }

    public void setBoxPriority(JTable table, TableColumn column) {
        JComboBox c = new JComboBox();
        for (int i = 0; i < 11; i++) {
            c.addItem(i);
        }
        column.setCellEditor(new DefaultCellEditor(c));
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setToolTipText("Seleccione la prioridad.");
        column.setCellRenderer(render);
    }

    public void setBoxEvent1(JTable table, TableColumn column) {
        JComboBox c = new JComboBox();
        for (int i = 0; i < suc.length; i++) {
            c.addItem(suc[i]);
        }
        column.setCellEditor(new DefaultCellEditor(c));
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setToolTipText("Seleccione el suceso 1.");
        column.setCellRenderer(render);
    }

    public void setBoxEvent2(JTable table, TableColumn column) {
        JComboBox c = new JComboBox();
        for (int i = 0; i < suc.length; i++) {
            c.addItem(suc[i]);
        }
        column.setCellEditor(new DefaultCellEditor(c));
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setToolTipText("Seleccione el suceso 2.");
        column.setCellRenderer(render);
    }

    public void setBoxRM(JTable table, TableColumn column) {
        JComboBox c = new JComboBox();
        for (int i = 0; i < ram.length; i++) {
            c.addItem(ram[i]);
        }
        column.setCellEditor(new DefaultCellEditor(c));
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setToolTipText("Seleccione el requerimiento de memoria.");
        column.setCellRenderer(render);
    }
}
