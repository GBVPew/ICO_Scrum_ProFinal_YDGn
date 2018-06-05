
package VentanasInicio;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Scrum extends javax.swing.JFrame {


    public Scrum() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LogoUNAM.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BtnPrincipal = new javax.swing.JButton();
        BtnTeoria = new javax.swing.JButton();
        BtnDesarrolladores = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Info1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Info2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnPrincipal.setText("Principal");
        BtnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrincipalActionPerformed(evt);
            }
        });

        BtnTeoria.setText("Teoría");

        BtnDesarrolladores.setText("Desarrolladores");

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setText("Equipo Scrum");

        Info1.setColumns(20);
        Info1.setRows(5);
        jScrollPane1.setViewportView(Info1);

        Info2.setColumns(20);
        Info2.setRows(5);
        jScrollPane2.setViewportView(Info2);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(BtnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(156, 156, 156)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Titulo)
                                .addComponent(BtnTeoria, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(115, 115, 115)
                            .addComponent(BtnDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPrincipal)
                    .addComponent(BtnTeoria)
                    .addComponent(BtnDesarrolladores))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrincipalActionPerformed
        Principal p = new Principal();
        Fondo.removeAll();
        this.Fondo.add(p.getFondo());
        this.Fondo.repaint();  
    }//GEN-LAST:event_BtnPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scrum scrum = new Scrum();
        scrum.setVisible(true);
        scrum.setResizable(false);
    }

    public JPanel getjPanel1() {
        return Fondo;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.Fondo = jPanel1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDesarrolladores;
    private javax.swing.JButton BtnPrincipal;
    private javax.swing.JButton BtnTeoria;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextArea Info1;
    private javax.swing.JTextArea Info2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
