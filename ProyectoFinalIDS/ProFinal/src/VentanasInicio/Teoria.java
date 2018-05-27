package VentanasInicio;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JoséLuis
 */
public class Teoria extends javax.swing.JFrame {
    
    public Teoria() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LogoUNAM.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        image1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        Desarrolladores = new javax.swing.JButton();
        Principal = new javax.swing.JButton();
        Scrum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Fondo.setPreferredSize(new java.awt.Dimension(567, 392));

        javax.swing.GroupLayout image1Layout = new javax.swing.GroupLayout(image1);
        image1.setLayout(image1Layout);
        image1Layout.setHorizontalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        image1Layout.setVerticalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("Ingeniería de Software");

        Desarrolladores.setText("Desarrolladores");

        Principal.setText("Principal");
        Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalActionPerformed(evt);
            }
        });

        Scrum.setText("Scrum");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Principal)
                .addGap(128, 128, 128)
                .addComponent(Scrum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(Desarrolladores)
                .addGap(24, 24, 24))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Scrum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Desarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalActionPerformed
        Principal p = new Principal();
        //this.setTitle("");
        this.Fondo.removeAll();
        this.Fondo.add(p.getFondo(), BorderLayout.CENTER);
        this.Fondo.revalidate();
        this.setPreferredSize(p.getPreferredSize());
        this.Fondo.repaint();
        //this.setTitle("YDGn");
    }//GEN-LAST:event_PrincipalActionPerformed

    public static void main(String args[]) {
       Teoria teoria = new Teoria();
       teoria.setVisible(true);
//       teoria.setTitle("Teoría básica Ingeniería de Software");
       //teoria.setResizable(false);
    }

    public JPanel getFondo() {
        return Fondo;
    }

    public void setFondo(JPanel Fondo) {
        this.Fondo = Fondo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desarrolladores;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton Principal;
    private javax.swing.JButton Scrum;
    private javax.swing.JPanel image1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
