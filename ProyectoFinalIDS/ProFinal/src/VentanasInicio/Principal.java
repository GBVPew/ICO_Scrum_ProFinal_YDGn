package VentanasInicio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.accessibility.AccessibleContext;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRootPane;


/**
 *
 * @author JoséLuis
 */
public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LogoUNAM.png")).getImage());     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Emenu = new javax.swing.JLabel();
        Teoria = new javax.swing.JButton();
        Scrum = new javax.swing.JButton();
        Equipo = new javax.swing.JButton();
        presen = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        LogoFES = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(680,400);

        Fondo.setBackground(new java.awt.Color(204, 204, 255));
        Fondo.setForeground(new java.awt.Color(0, 51, 51));

        Emenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Emenu.setText("Menú");

        Teoria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Teoria.setText("Teoría Básica Ingeniería de Software");
        Teoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeoriaActionPerformed(evt);
            }
        });

        Scrum.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Scrum.setText("SCRUM");

        Equipo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Equipo.setText("Desarrolladores");

        presen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        presen.setText("<html> Dentro de este proyecto encontraras información sobre teoría básica de la Ingeniería de Software, Scrum y sobre los Desarrolladores. </html>");

        Bienvenida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Bienvenida.setText("Bienvenido y disfruta de nuestro trabajo.");

        LogoFES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFES.png"))); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(presen, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(Bienvenida))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Teoria, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogoFES)
                            .addComponent(Scrum, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(Emenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Bienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoFES)
                .addGap(21, 21, 21)
                .addComponent(Emenu)
                .addGap(18, 18, 18)
                .addComponent(Teoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Scrum)
                .addGap(18, 18, 18)
                .addComponent(Equipo)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeoriaActionPerformed
        Teoria teoria = new Teoria();
        Fondo.removeAll();
        this.Fondo.add(teoria.getFondo());
        this.Fondo.repaint();      
    }//GEN-LAST:event_TeoriaActionPerformed


    public static void main(String args[]) {
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setTitle("YDGn");
        principal.setResizable(false);
    }

  
    public JPanel getFondo() {
        return Fondo;
    }

    public void setFondo(JPanel Fondo) {
        this.Fondo = Fondo;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Emenu;
    private javax.swing.JButton Equipo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LogoFES;
    private javax.swing.JButton Scrum;
    private javax.swing.JButton Teoria;
    private javax.swing.JLabel presen;
    // End of variables declaration//GEN-END:variables
}
