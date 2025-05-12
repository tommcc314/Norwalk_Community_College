/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeCalculatorGUI extends javax.swing.JFrame implements ActionListener {
    public ShapeCalculatorGUI() {
        initComponents();
        CircleButton.addActionListener(this);
        CylinderButton.addActionListener(this);
        RectButton.addActionListener(this);
        RectPrismButton.addActionListener(this);
        SphereButton.addActionListener(this);
        TriPrismButton.addActionListener(this);
        TriangleButton.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CircleButton = new javax.swing.JButton();
        CylinderButton = new javax.swing.JButton();
        RectButton = new javax.swing.JButton();
        RectPrismButton = new javax.swing.JButton();
        SphereButton = new javax.swing.JButton();
        TriangleButton = new javax.swing.JButton();
        TriPrismButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shape Geometry Calculator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Choose the shape that you would like to work with: ");

        CircleButton.setText("Circle");

        CylinderButton.setText("Cylinder");

        RectButton.setText("Rectangle");

        RectPrismButton.setText("Rectangular Prism");

        SphereButton.setText("Sphere");

        TriangleButton.setText("Triangle");

        TriPrismButton.setText("Triangular Prism");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(CircleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RectPrismButton)
                                    .addComponent(CylinderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SphereButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(TriangleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(TriPrismButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CircleButton)
                    .addComponent(CylinderButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RectButton)
                    .addComponent(RectPrismButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TriangleButton)
                    .addComponent(SphereButton))
                .addGap(18, 18, 18)
                .addComponent(TriPrismButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

public static void main(String[] args) {
    ShapeCalculatorGUI calc = new ShapeCalculatorGUI();    
    calc.setVisible(true);
}        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CircleButton;
    private javax.swing.JButton CylinderButton;
    private javax.swing.JButton RectButton;
    private javax.swing.JButton RectPrismButton;
    private javax.swing.JButton SphereButton;
    private javax.swing.JButton TriPrismButton;
    private javax.swing.JButton TriangleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == CircleButton) {
            new CircleCalculatorGUI().setVisible(true);
        }
        else if (source == CylinderButton) {
            new CylinderCalculatorGUI().setVisible(true);
        }
        else if (source == RectButton) {
            new RectangleCalculatorGUI().setVisible(true);
        }
        else if (source == RectPrismButton) {
            new RectPrismCalculatorGUI().setVisible(true);
        }
        else if (source == SphereButton) {
            new SphereCalculatorGUI().setVisible(true);
        }
        else if (source == TriPrismButton) {
            new TriPrismCalculatorGUI().setVisible(true);
        }
        else if (source == TriangleButton) {
            new TriangleCalculatorGUI().setVisible(true);
        }
    }
}
