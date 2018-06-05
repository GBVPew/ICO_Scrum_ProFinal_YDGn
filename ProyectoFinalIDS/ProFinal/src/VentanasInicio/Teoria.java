package VentanasInicio;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JoséLuis
 */
public class Teoria extends javax.swing.JFrame {

    public Teoria() {
        initComponents();
        setTitle("Teoría básica Ingeniería de Software");
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LogoUNAM.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        Desarrolladores = new javax.swing.JButton();
        Principal = new javax.swing.JButton();
        Scrum = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Info1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Info2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Referencia = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setPreferredSize(new java.awt.Dimension(567, 392));

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
        Scrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScrumActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Herramientas1.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calidad1.png"))); // NOI18N

        Info1.setEditable(false);
        Info1.setBackground(new java.awt.Color(204, 204, 204));
        Info1.setColumns(20);
        Info1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Info1.setRows(5);
        Info1.setText("       ¿QUE ES LA INGENIERIA DE SOFTWARE?\nSE PUEDE DEFINIR COMO LA APLICACION DE ENFOQUE \nSISTEMATICO, DESIPLINADO Y CUANTIFICABLE \nHACIA EL DESARROLLO, OPERACION Y MANTENIMIENTO \nDEL SOFTWARE EL PROCESO DE INGENIERIA DE SOFWARE \nES UN CONJUNTO DE ACTIVIDADES QUE PERMITEN \nTRANSFORMAR LOS REQUISITOS DE UN CLIENTE/USUARIO\n\nEN UN SISTEMA SOFTWARE \n-> REQUISITOS \n-> DESARROLLO DE SOFTWARE\n-> SISTEMA DEE SOFTWARE \n\nSUS PRINCIPALES COMPONENTES SON: \nPROCESOS, HERRAMIENTAS, COMPROMISO EN LA \nCALIDAD.");
        Info1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Info1);

        Info2.setEditable(false);
        Info2.setBackground(new java.awt.Color(204, 204, 204));
        Info2.setColumns(20);
        Info2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Info2.setRows(5);
        Info2.setText("      HERRAMIENTAS DE LA INGENIERIA DE SOFTWARE\nEste en un punto importante ya que las herramientas \nen la Ingenieria de Software son utilizadas ya que \nayudan a realizar de manera mas exacta , eficiente y \nproductiva una tarea.\n\nAlgunos Ejemplos son: lenguajes de programacion, \n\"Herramientas de modelado\", sistemas de integracion,\netc. \n\nLas herramientas CASE Son herramientas de diseño, de \nplanificacion, de programacion, de integracion. \n* EJEMPLOS DE HERRAMIENTAS DE MODELADO SOFTWARE:\nCatalysis,Objetory,OMT,UML,BOOCH.\nEn UML se utilizan diagramas para facilitar el \nmodelado, existen diagrmas ESTATICOS y diagramas \nDinamicos.\n\n          CALIDAD DE INGENIERIA DE SOFTWARE\nUn software debe de contar con caliidad ya que en \nprimer lugar dede de estar diseñado como el cliente \nlo pidio, debe de cumplir con las siguientes \ncaracteristicas caracteristicas:\n \n-utilidad\n-claridad\n-confiabilidad\n-eficiencia\n-economia\n\nDe igual Manera habarca un conjunto \nclave de herramientas, fases y procesos.");
        jScrollPane2.setViewportView(Info2);

        Referencia.setEditable(false);
        Referencia.setBackground(new java.awt.Color(204, 204, 204));
        Referencia.setColumns(20);
        Referencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Referencia.setRows(5);
        Referencia.setText("Fuentes de consulta \nhttp://cotana.informatica.edu.bo/downloads/ld-Ingenieria.de.software.enfoque.practico.7ed.Pressman.PDF\nhttps://cta.aragon.unam.mx/aulavirtual/pluginfile.php/17667/mod_resource/content/1/Introducci%C3%B3n%20de%20Ingenieria%20de%20software%20Archivo%20-%20Parte%202.pdf\nhttps://cta.aragon.unam.mx/aulavirtual/pluginfile.php/16760/mod_resource/content/1/Introducci%C3%B3n%20bloque%201.pdf\n\nEnlaces de Interés\nhttps://www.youtube.com/watch?v=-76-MOkIYfE&feature=youtu.be\nhttps://www.youtube.com/watch?v=POVEtBbDcB8&feature=youtu.be\nhttps://www.youtube.com/watch?v=IrMdHif3Yso&feature=youtu.be\nhttps://www.youtube.com/watch?v=fHPs6NwNAe4&feature=youtu.be");
        jScrollPane4.setViewportView(Referencia);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(Principal)
                                    .addGap(191, 191, 191)
                                    .addComponent(Scrum)
                                    .addGap(197, 197, 197)
                                    .addComponent(Desarrolladores))
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(63, 63, 63)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(titulo))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Scrum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addComponent(Desarrolladores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalActionPerformed
        Principal p = new Principal();
        Fondo.removeAll();
        this.Fondo.add(p.getFondo());
        this.Fondo.repaint();   
    }//GEN-LAST:event_PrincipalActionPerformed

    private void ScrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScrumActionPerformed
        Scrum scrum = new Scrum();
        Fondo.removeAll();
        this.Fondo.add(scrum.getFondo());
        this.Fondo.repaint();
    }//GEN-LAST:event_ScrumActionPerformed

    public static void main(String args[]) {
        Teoria teoria = new Teoria();
        teoria.setVisible(true);
        teoria.setResizable(false);
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
    private javax.swing.JTextArea Info1;
    private javax.swing.JTextArea Info2;
    private javax.swing.JButton Principal;
    private javax.swing.JTextArea Referencia;
    private javax.swing.JButton Scrum;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
