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
        this.setSize(640, 480);//Se declara el tamaño de la pantalla 
        this.setResizable(false);//No deja que el cuadro de la pantalla se haga mas grande
        this.setLocationRelativeTo(this);
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
        presen = new javax.swing.JLabel();
        presen1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        presen2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        presen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        presen.setText("<html> SE PUEDE DEFINIR COMO LA APLICACION DE ENFOQUE SISTEMATICO, DESIPLINADO Y CUANTIFICABLE  HACIA EL DESARROLLO, OPERACION Y MANTENIMIENTO DEL SOFTWARE EL PROCESO DE INGENIERIA DE SOFWARE ES UN CONJUNTO DE ACTIVIDADES QUE PERMITEN TRANSFORMAR LOS REQUISITOS DE UN CLIENTE/USUARIO EN UN SISTEMA SOFTWARE -> REQUISITOS -> DESARROLLO DE SOFTWARE-> SISTEMA DEE SOFTWARE SUS PRINCIPALES COMPONENTES SON: PROCESOS,HERRAMIENTAS, COMPROMISO EN LA CALIDAD  </html>");

        presen1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        presen1.setText("<html> Este en un punto importante ya que las herramientas en la Ingenieria de Software son utilizadas ya que ayudan a realizar de manera mas exacta , eficiente y productiva una tarea Algunos Ejemplos son: lenguajes de programacion, \"Herramientas de modelado\", sistemas de integracion, etc. Las herramientas CASE Son herramientas de diseño, de planificacion, de programacion, de integracion. * EJEMPLOS DE HERRAMIENTAS DE MODELADO SOFTWARE:Catalysis,Objetory,OMT,UML,BOOCH En UML se utilizan diagramas para facilitar el modelado, existen diagrmas ESTATICOS y diagramas Dinamicos </html>");

        jLabel1.setText("HERRAMIENTAS DE LA INGENIERIA DE SOFTWARE");

        jLabel2.setText("¿QUE ES LA INGENIERIA DE SOFTWARE?");

        jLabel3.setText("CALIDAD DE INGENIERIA DE SOFTWARE");

        presen2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        presen2.setText("<html> Un software debe de contar con caliidad ya que en primer lugar dede de estar diseñado como el cliente lo pidio, debe de cumplir con las siguientes caracteristicas caracteristicas utilidad, claridad,confiabilidad,eficiencia y economia. De igual Manera habarca un conjunto clave de herramientas, fases y procesos. </html>");

        jLabel4.setText("Fuentes de consulta ");

        jLabel5.setText("http://cotana.informatica.edu.bo/downloads/ld-Ingenieria.de.software.enfoque.practico.7ed.Pressman.PDF");

        jLabel6.setText("https://cta.aragon.unam.mx/aulavirtual/pluginfile.php/17667/mod_resource/content/1/Introducci%C3%B3n%20de%20Ingenieria%20de%20software%20Archivo%20-%20Parte%202.pdf");

        jLabel7.setText("https://cta.aragon.unam.mx/aulavirtual/pluginfile.php/16760/mod_resource/content/1/Introducci%C3%B3n%20bloque%201.pdf");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Scrum)
                .addGap(301, 301, 301)
                .addComponent(Desarrolladores)
                .addGap(26, 26, 26))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(presen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(presen1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addComponent(presen2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(titulo)
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Scrum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Desarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(presen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presen1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(presen2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel presen;
    private javax.swing.JLabel presen1;
    private javax.swing.JLabel presen2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
