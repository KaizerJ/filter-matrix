/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filter.matrix;

/**
 *
 * @author Jonay
 */
public class FilterMatrixFrame extends javax.swing.JFrame {

    private int[][] matrix;

    /**
     * Creates new form FilterMatrixFrame
     */
    public FilterMatrixFrame() {
        initComponents();
        initThresholdSlider();
        initMatrix();
        showMatrix();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matrixPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        matrixTextArea = new javax.swing.JTextArea();
        confPanel = new javax.swing.JPanel();
        minLabel = new javax.swing.JLabel();
        minTextField = new javax.swing.JTextField();
        maxLabel = new javax.swing.JLabel();
        maxTextField = new javax.swing.JTextField();
        thresholdSlider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        matrixTextArea.setEditable(false);
        matrixTextArea.setColumns(20);
        matrixTextArea.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        matrixTextArea.setRows(5);
        jScrollPane2.setViewportView(matrixTextArea);

        javax.swing.GroupLayout matrixPanelLayout = new javax.swing.GroupLayout(matrixPanel);
        matrixPanel.setLayout(matrixPanelLayout);
        matrixPanelLayout.setHorizontalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, matrixPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        matrixPanelLayout.setVerticalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, matrixPanelLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        minLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minLabel.setText("Mínimo");

        minTextField.setText("0");
        minTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minTextFieldKeyReleased(evt);
            }
        });

        maxLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxLabel.setText("Máximo");

        maxTextField.setText("100");

        thresholdSlider.setMajorTickSpacing(20);
        thresholdSlider.setMinorTickSpacing(20);
        thresholdSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                thresholdSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout confPanelLayout = new javax.swing.GroupLayout(confPanel);
        confPanel.setLayout(confPanelLayout);
        confPanelLayout.setHorizontalGroup(
            confPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(confPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(confPanelLayout.createSequentialGroup()
                        .addComponent(minTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxTextField))
                    .addGroup(confPanelLayout.createSequentialGroup()
                        .addComponent(minLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(thresholdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        confPanelLayout.setVerticalGroup(
            confPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(confPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confPanelLayout.createSequentialGroup()
                        .addGroup(confPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(confPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confPanelLayout.createSequentialGroup()
                        .addComponent(thresholdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matrixPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matrixPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(confPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thresholdSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_thresholdSliderStateChanged
        showMatrix();
    }//GEN-LAST:event_thresholdSliderStateChanged

    private void minTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTextFieldKeyReleased
        this.initMatrix();
        this.initThresholdSlider();
        this.showMatrix();
    }//GEN-LAST:event_minTextFieldKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FilterMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterMatrixFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterMatrixFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel confPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel matrixPanel;
    private javax.swing.JTextArea matrixTextArea;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JTextField maxTextField;
    private javax.swing.JLabel minLabel;
    private javax.swing.JTextField minTextField;
    private javax.swing.JSlider thresholdSlider;
    // End of variables declaration//GEN-END:variables

    private void initMatrix() {
        int min = Integer.parseInt(this.minTextField.getText());
        int max = Integer.parseInt(this.maxTextField.getText());
        
        int range = max - min;
        
        this.matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                 matrix[i][j] = (int) (Math.random()*range + min);
            }
        }
        
    }

    private void initThresholdSlider() {
        int min = Integer.parseInt(this.minTextField.getText());
        int max = Integer.parseInt(this.maxTextField.getText());
        
        this.thresholdSlider.setMinimum(min);
        this.thresholdSlider.setMaximum(max);
        this.thresholdSlider.setValue((min + max)/2);
        
        int range = max - min;
        int majorTickSpacing = (range / 4) >= 1 ? (int) (range / 4) : 1;
        int minorTickSpacing = (majorTickSpacing / 3) >= 1 ? 
                (int) (majorTickSpacing / 3) : 1;
                
        this.thresholdSlider.setMajorTickSpacing(majorTickSpacing);
        this.thresholdSlider.setMinorTickSpacing(minorTickSpacing);
        this.thresholdSlider.setPaintTicks(true);
        this.thresholdSlider.setPaintLabels(true);      
    }

    private void showMatrix() {
        String matrixString = ""; 
        int threshold = this.thresholdSlider.getValue();
        int maxChars = this.maxTextField.getText().length();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int spacesNeeded;
                if(this.matrix[i][j] <= threshold){
                    matrixString += "-";
                    spacesNeeded = maxChars - 1;
                } else {
                    spacesNeeded = maxChars - (this.matrix[i][j] + "").length();
                    matrixString += this.matrix[i][j] + "";
                }
                for (int space = 0; space <= spacesNeeded; space++) {
                    matrixString += " ";
                }
            }
            matrixString += "\n";
        }
        
        this.matrixTextArea.setText(matrixString);
    }
}
