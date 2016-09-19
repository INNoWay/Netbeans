package view;

import controller.ControllerBubbleSort;
import controller.ControllerInsertionSort;
import controller.ControllerQuickSort;
import controller.ControllertMergeSort;
import controllerDez.ControllerBubbleSortDez;
import controllerDez.ControllerInsertionSortDez;
import controllerDez.ControllerQuickSortDez;
import controllerDez.ControllertMergeSortDez;
import javax.swing.table.DefaultTableModel;
import model.BubbleSort;
import model.InsertionSort;
import model.MergeSort;
import model.QuickSort;

public class JFMenu extends javax.swing.JFrame {

    QuickSort qqs= new QuickSort();
    BubbleSort bbs= new BubbleSort();
    MergeSort mms= new MergeSort();
    InsertionSort iis= new InsertionSort();
    
    public JFMenu() {
        
        initComponents();
                
        this.setLocationRelativeTo(null);
        
        setResizable(false); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodos de Ordenação");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Tamanho da Entrada");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Cenario");

        jTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Algoritimo", "Tempo Exec", "Qtde Trocas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Relatorio");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButton1.setText("Random");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButton2.setText("Inversamente Ordenado");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButton3.setText("Grupos 10% iguais");
        jRadioButton3.setToolTipText("");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButton4.setText("30 Elementos");

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButton5.setText("20.000 Elementos");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Executar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
        //joga na Tabela
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable.getModel();    
        Object[] linha = null;  
        
        float duration1,duration2,duration3,duration4;
        long startTime1,startTime2,startTime3,startTime4;
        long endTime1,endTime2,endTime3,endTime4;
        
        if((jRadioButton4.isSelected() && jRadioButton2.isSelected())||((jRadioButton5.isSelected() && jRadioButton2.isSelected()))){        
        
        startTime1 = System.currentTimeMillis();//Start time 
        
        ControllerInsertionSort is=new ControllerInsertionSort();
        is.controllerInsertionSort();
        
        endTime1 = System.currentTimeMillis();// end time  
        System.out.println("");   
        duration1=(float) ((endTime1 - startTime1) / 1000d);        
        System.out.printf("InsertionSort: %.3f  segundos%n", (endTime1 - startTime1) / 1000d);
        int qtdInsertion = iis.setInsertionSort();                        
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("InsertionSort",0,0);
        tabelaModelo.setValueAt(duration1,0,1);
        tabelaModelo.setValueAt(qtdInsertion,0,2); 
        System.out.println("");
        System.out.println("");       
        
        startTime2 = System.currentTimeMillis();//Start time 
        
        ControllerBubbleSort bs=new ControllerBubbleSort();
        bs.controllerBubbleSort();
        
        endTime2 = System.currentTimeMillis();// end time  
        System.out.println("");        
        duration2=(float) ((endTime2 - startTime2) / 1000d);
        System.out.printf("BubbleSort: %.3f  segundos%n", (endTime2 - startTime2) / 1000d);
        int qtdBubble = bbs.setBubbleSort();            
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("BubbleSort",1,0);
        tabelaModelo.setValueAt(duration2,1,1);
        tabelaModelo.setValueAt(qtdBubble,1,2);  
          
        System.out.println("");
        System.out.println("");
        
        startTime3 = System.currentTimeMillis();//Start time   
        
        ControllerQuickSort qs=new ControllerQuickSort();
        qs.controllerQuickSort();
        
        endTime3 = System.currentTimeMillis();// end time  
        System.out.println("");
        duration3=(float) ((endTime3 - startTime3) / 1000d);
        System.out.printf("QuickSort: %.3f  segundos%n", (endTime3 - startTime3) / 1000d);
        int qtdQuick = qqs.setQuickSort();
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("QuickSort",2,0);
        tabelaModelo.setValueAt(duration3,2,1);
        tabelaModelo.setValueAt(qtdQuick,2,2); 
        
        System.out.println("");
        System.out.println("");
        
        startTime4 = System.currentTimeMillis();//Start time 
        
        ControllertMergeSort ms=new ControllertMergeSort();
        ms.controllertMergeSort();
        
        endTime4 = System.currentTimeMillis();// end time  
        System.out.println("");
        duration4=(float) ((endTime4 - startTime4) / 1000d);
        System.out.printf("MergeSort: %.3f  segundos%n", (endTime4 - startTime4) / 1000d);
        int qtdMerge = mms.setMergeSort();
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("MergeSort",3,0);
        tabelaModelo.setValueAt(duration4,3,1);
        tabelaModelo.setValueAt(qtdMerge,3,2); 
        }        
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||((jRadioButton5.isSelected() && jRadioButton1.isSelected()))){
         
        startTime1 = System.currentTimeMillis();//Start time 
        
        ControllerInsertionSort is=new ControllerInsertionSort();
        is.controllerInsertionSort();
        
        endTime1 = System.currentTimeMillis();// end time  
        System.out.println("");   
        duration1=(float) ((endTime1 - startTime1) / 1000d);        
        System.out.printf("InsertionSort: %.3f  segundos%n", (endTime1 - startTime1) / 1000d);
        int qtdInsertion = iis.setInsertionSort();                        
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("InsertionSort",0,0);
        tabelaModelo.setValueAt(duration1,0,1);
        tabelaModelo.setValueAt(qtdInsertion,0,2); 
        System.out.println("");
        System.out.println("");       
        
        startTime2 = System.currentTimeMillis();//Start time 
        
        ControllerBubbleSort bs=new ControllerBubbleSort();
        bs.controllerBubbleSort();
        
        endTime2 = System.currentTimeMillis();// end time  
        System.out.println("");        
        duration2=(float) ((endTime2 - startTime2) / 1000d);
        System.out.printf("BubbleSort: %.3f  segundos%n", (endTime2 - startTime2) / 1000d);
        int qtdBubble = bbs.setBubbleSort();            
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("BubbleSort",1,0);
        tabelaModelo.setValueAt(duration2,1,1);
        tabelaModelo.setValueAt(qtdBubble,1,2);  
          
        System.out.println("");
        System.out.println("");
        
        startTime3 = System.currentTimeMillis();//Start time   
        
        ControllerQuickSort qs=new ControllerQuickSort();
        qs.controllerQuickSort();
        
        endTime3 = System.currentTimeMillis();// end time  
        System.out.println("");
        duration3=(float) ((endTime3 - startTime3) / 1000d);
        System.out.printf("QuickSort: %.3f  segundos%n", (endTime3 - startTime3) / 1000d);
        int qtdQuick = qqs.setQuickSort();
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("QuickSort",2,0);
        tabelaModelo.setValueAt(duration3,2,1);
        tabelaModelo.setValueAt(qtdQuick,2,2); 
        
        System.out.println("");
        System.out.println("");
        
        startTime4 = System.currentTimeMillis();//Start time 
        
        ControllertMergeSort ms=new ControllertMergeSort();
        ms.controllertMergeSort();
        
        endTime4 = System.currentTimeMillis();// end time  
        System.out.println("");
        duration4=(float) ((endTime4 - startTime4) / 1000d);
        System.out.printf("MergeSort: %.3f  segundos%n", (endTime4 - startTime4) / 1000d);
        int qtdMerge = mms.setMergeSort();
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("MergeSort",3,0);
        tabelaModelo.setValueAt(duration4,3,1);
        tabelaModelo.setValueAt(qtdMerge,3,2);  
        
        }
        
                
        if((jRadioButton4.isSelected()&& jRadioButton3.isSelected())||(jRadioButton5.isSelected()&& jRadioButton3.isSelected())){
        
        startTime1 = System.currentTimeMillis();//Start time 
        
        ControllerInsertionSortDez iss=new ControllerInsertionSortDez();
        iss.controllerInsertionSortDez();
        
        endTime1 = System.currentTimeMillis();// end time  
        System.out.println("");   
        duration1=(float) ((endTime1 - startTime1) / 1000d);        
        System.out.printf("InsertionSort: %.3f  segundos%n", (endTime1 - startTime1) / 1000d);
        int qtdInsertion = iis.setInsertionSort();                        
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("InsertionSort",0,0);
        tabelaModelo.setValueAt(duration1,0,1);
        tabelaModelo.setValueAt(qtdInsertion,0,2); 
        System.out.println("");
        System.out.println("");       
        
        startTime2 = System.currentTimeMillis();//Start time 
        
        ControllerBubbleSortDez bss=new ControllerBubbleSortDez();
        bss.controllerBubbleSortDez();
        
        endTime2 = System.currentTimeMillis();// end time  
        System.out.println("");        
        duration2=(float) ((endTime2 - startTime2) / 1000d);
        System.out.printf("BubbleSort: %.3f  segundos%n", (endTime2 - startTime2) / 1000d);
        int qtdBubble = bbs.setBubbleSort();            
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("BubbleSort",1,0);
        tabelaModelo.setValueAt(duration2,1,1);
        tabelaModelo.setValueAt(qtdBubble,1,2);  
          
        System.out.println("");
        System.out.println("");
        
        startTime3 = System.currentTimeMillis();//Start time   
        
        ControllerQuickSortDez qss=new ControllerQuickSortDez();
        qss.controllerQuickSortDez();
        
        endTime3 = System.currentTimeMillis();// end time  
        System.out.println("");
        duration3=(float) ((endTime3 - startTime3) / 1000d);
        System.out.printf("QuickSort: %.3f  segundos%n", (endTime3 - startTime3) / 1000d);
        int qtdQuick = qqs.setQuickSort();
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("QuickSort",2,0);
        tabelaModelo.setValueAt(duration3,2,1);
        tabelaModelo.setValueAt(qtdQuick,2,2); 
        
        System.out.println("");
        System.out.println("");
        
        startTime4 = System.currentTimeMillis();//Start time 
        
        ControllertMergeSortDez mss=new ControllertMergeSortDez();
        mss.controllertMergeSortDez();
        
        endTime4 = System.currentTimeMillis();// end time  
        System.out.println("");
        duration4=(float) ((endTime4 - startTime4) / 1000d);
        System.out.printf("MergeSort: %.3f  segundos%n", (endTime4 - startTime4) / 1000d);
        int qtdMerge = mms.setMergeSort();
        tabelaModelo.addRow(linha);        
        tabelaModelo.setValueAt("MergeSort",3,0);
        tabelaModelo.setValueAt(duration4,3,1);
        tabelaModelo.setValueAt(qtdMerge,3,2);
      
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static final transient javax.swing.JRadioButton jRadioButton1 = new javax.swing.JRadioButton();
    public static final transient javax.swing.JRadioButton jRadioButton2 = new javax.swing.JRadioButton();
    public static final transient javax.swing.JRadioButton jRadioButton3 = new javax.swing.JRadioButton();
    public static final transient javax.swing.JRadioButton jRadioButton4 = new javax.swing.JRadioButton();
    public static final transient javax.swing.JRadioButton jRadioButton5 = new javax.swing.JRadioButton();
    private javax.swing.JScrollPane jScrollPane1;
    public static final transient javax.swing.JTable jTable = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
