
package VentanasInicio;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Desarrolladores extends javax.swing.JFrame {

    public Desarrolladores() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LogoUNAM.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Fondo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Vero = new javax.swing.JTextArea();
        BtnPrincipal = new javax.swing.JButton();
        BtnTeoria = new javax.swing.JButton();
        BtnScrum = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Pewa = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Jose = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Oswaldo = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Kiana = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Luis = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 229, 244));

        Titulo.setBackground(new java.awt.Color(153, 0, 51));
        Titulo.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        Titulo.setText("Desarrolladores");

        Vero.setBackground(new java.awt.Color(251, 229, 251));
        Vero.setColumns(20);
        Vero.setForeground(new java.awt.Color(102, 0, 0));
        Vero.setRows(5);
        Vero.setText("                    --> Verónica Lira Mendoza\nN°Cuenta: 312217125 \nCorreo Electronico: liramendozaveronica@gmail.com \nSemestre: Sexto \nRedes Sociales: *Facebook @Veronica Lira     **GitHub @Verónica Lira");
        jScrollPane1.setViewportView(Vero);

        BtnPrincipal.setText("Principal");
        BtnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrincipalActionPerformed(evt);
            }
        });

        BtnTeoria.setText("Teoría");
        BtnTeoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTeoriaActionPerformed(evt);
            }
        });

        BtnScrum.setText("Scrum");
        BtnScrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnScrumActionPerformed(evt);
            }
        });

        Pewa.setBackground(new java.awt.Color(252, 233, 252));
        Pewa.setColumns(20);
        Pewa.setForeground(new java.awt.Color(51, 0, 0));
        Pewa.setRows(5);
        Pewa.setText("                    --> Vanesa Pewalty García Bazán\nN°Cuenta: 313173712 \nCorreo Electronico: pewalty@hotmail.com \nSemestre: Sexto \nRedes Sociales: *Facebook @Vanesa Garcia     **GitHub @GBVPew");
        jScrollPane2.setViewportView(Pewa);

        Jose.setBackground(new java.awt.Color(253, 229, 253));
        Jose.setColumns(20);
        Jose.setForeground(new java.awt.Color(102, 0, 0));
        Jose.setRows(5);
        Jose.setText("                    --> José Luis Martínez Espíritu\nN°Cuenta: 313139389 \nCorreo Electronico: joseloespiritu_8v@hotmail.com \nSemestre: Sexto \nRedes Sociales: *Facebook @José Luis Mtnez Esp  **GitHub @JoseLuisEspiritu");
        jScrollPane3.setViewportView(Jose);

        Oswaldo.setBackground(new java.awt.Color(251, 228, 251));
        Oswaldo.setColumns(20);
        Oswaldo.setRows(5);
        Oswaldo.setText("                    --> Angel Oswaldo Ramírez Castillo\nN°Cuenta: 313341641\nCorreo Electronico: weskeryoka@gmail.com \nSemestre: Sexto \nRedes Sociales: *Facebook @Oswaldo Wesker   **GitHub @AORC");
        jScrollPane4.setViewportView(Oswaldo);

        Kiana.setBackground(new java.awt.Color(252, 232, 252));
        Kiana.setColumns(20);
        Kiana.setForeground(new java.awt.Color(102, 0, 0));
        Kiana.setRows(5);
        Kiana.setText("                    --> Kiana Alejandra Chávez Ceballos\nN°Cuenta: 313217915\nCorreo Electronico: kianaalejandra23@hotmail.com \nSemestre: Sexto \nRedes Sociales: *Facebook @Anaki Sama      **GitHub @KianitaSama");
        jScrollPane5.setViewportView(Kiana);

        Luis.setBackground(new java.awt.Color(253, 233, 253));
        Luis.setColumns(20);
        Luis.setRows(5);
        Luis.setText("                    --> Luis Ángel García CervantesN°Cuenta: 313217915\nN°Cuenta:  313058044 \nCorreo Electronico: Luis_garciacervantes@yahoo.com.mx\nSemestre: Sexto \nRedes Sociales: *Facebook @Luis Garcia     **GitHub @LuisGC01");
        jScrollPane6.setViewportView(Luis);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Veronica.jpeg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vanesa.jpeg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/José Luis.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Oswaldo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Kiana.jpg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Luis Angel.jpg"))); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnTeoria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnScrum, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Titulo)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(BtnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTeoria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnScrum, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrincipalActionPerformed
        Principal p = new Principal();
        Fondo.removeAll();
        this.Fondo.add(p.getFondo());
        this.Fondo.repaint();
    }//GEN-LAST:event_BtnPrincipalActionPerformed

    private void BtnTeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTeoriaActionPerformed
        Teoria teoria = new Teoria();
        Fondo.removeAll();
        this.Fondo.add(teoria.getFondo());
        this.Fondo.repaint();
    }//GEN-LAST:event_BtnTeoriaActionPerformed

    private void BtnScrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnScrumActionPerformed
        Scrum scrum = new Scrum();
        Fondo.removeAll();
        this.Fondo.add(scrum.getFondo());
        this.Fondo.repaint();
    }//GEN-LAST:event_BtnScrumActionPerformed

    public static void main(String args[]) {
        Desarrolladores desarrolladores = new Desarrolladores();
        desarrolladores.setVisible(true);
        desarrolladores.setResizable(false);
        
    }

    public JPanel getFondo() {
        return Fondo;
    }

    public void setFondo(JPanel Fondo) {
        this.Fondo = Fondo;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPrincipal;
    private javax.swing.JButton BtnScrum;
    private javax.swing.JButton BtnTeoria;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextArea Jose;
    private javax.swing.JTextArea Kiana;
    private javax.swing.JTextArea Luis;
    private javax.swing.JTextArea Oswaldo;
    private javax.swing.JTextArea Pewa;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextArea Vero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
