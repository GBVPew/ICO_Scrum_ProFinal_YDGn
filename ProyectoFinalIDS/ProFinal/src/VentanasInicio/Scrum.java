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
        setTitle("Teoría básica de Scrum");
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Info4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Info5 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Info6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        Info7 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 204));

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

        BtnDesarrolladores.setText("Desarrolladores");

        Titulo.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 51, 51));
        Titulo.setText("Equipo Scrum");

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("--->   METODOLOGIAS AGILES   <---");

        Info4.setEditable(false);
        Info4.setBackground(new java.awt.Color(255, 255, 204));
        Info4.setColumns(20);
        Info4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Info4.setForeground(new java.awt.Color(0, 51, 51));
        Info4.setRows(5);
        Info4.setText("Primero explicaremos que es una METODOLOGIA AGIL:\nEste se centra en el exito personal, tecnico y organizado ya que este ayuda a que se entrege un valor a la \nempresa de forma temprana al igual que continua ya que esta establece los onjetivos del proyecto, ya que \nsu obejtivo de este es entregar el mayor valor posible de una forma frecuente este tambien tiene como \nobjetivo reducir el costo de desarrollo.\n\nSus principales caracteristicas son que tienen que tener motivacion personal y este es flexible a los \ncambios repentinos, la comunicacion y colaboracion entre el equipo es de mucha importancia.");
        Info4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(Info4);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("-- >  ¿QUE ES SCRUM?  <--");

        Info5.setEditable(false);
        Info5.setBackground(new java.awt.Color(255, 255, 204));
        Info5.setColumns(20);
        Info5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Info5.setForeground(new java.awt.Color(0, 51, 51));
        Info5.setRows(5);
        Info5.setText("** PRODUC OWNER:\nEste es el responsable de maximizar el retorno de  la invercion\na base de identificar las funcionalidades de el producto, traslado \na las listas de prioridad, este es el que decide cuales deberan\nser realizadas en cada sprint.\n\n++ SCRUM TEAM:\nEstos son los encargados de construir lo que el dueño de proyecto \nindica, engloba todo la experiencia y conocimeinto potencialmente \npara otorgar en ccada uno de los exprints, estos son voluntarios \ny tieneden a la auto-organizado\n\n--> SCRUM MASTER:\nEste se encarga de hacer todo lo que este en su man para apoyar \nal equipo, de la misma manera al dueño del producto al igual que \nver la organizacion para tener exito. El es el jefe de los mismbors \ndel equipo y este ayuda a impedir impedimentos");
        Info5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane5.setViewportView(Info5);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("-->  ROLES DE SCRUM  <--");

        Info6.setEditable(false);
        Info6.setBackground(new java.awt.Color(255, 255, 204));
        Info6.setColumns(20);
        Info6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Info6.setForeground(new java.awt.Color(0, 51, 51));
        Info6.setRows(5);
        Info6.setText("Scrum pertenece a las metodologias agiles, \nen la cual se trabaja en equipos Cross-funcionales \npara crear un producto o desarrollar proyectos esto \nde forma interactiva y incremental. Este tiene una\nestructura en ciclos de trabajos llamados Sprint y\nde igual manera se desempeñan diferentes Roles\n \n*Product owner\n*Scrum Team\n*Scrum Master");
        Info6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setViewportView(Info6);

        Info7.setEditable(false);
        Info7.setBackground(new java.awt.Color(255, 255, 204));
        Info7.setColumns(20);
        Info7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Info7.setForeground(new java.awt.Color(0, 51, 51));
        Info7.setRows(5);
        Info7.setText("FUENTES DE CONSULTA \n\nhttps://proyectosagiles.org/que-es-scrum/\nhttp://cotana.informatica.edu.bo/downloads/ld-Ingenieria.de.software.enfoque.practico.7ed.Pressman.PDF");
        Info7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane7.setViewportView(Info7);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Scrum.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/roless.jpg"))); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Titulo)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(BtnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156)
                                        .addComponent(BtnTeoria, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(237, 237, 237)
                                .addComponent(BtnDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel3)
                                .addGap(162, 162, 162))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(114, 114, 114))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 21, Short.MAX_VALUE)))))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPrincipal)
                    .addComponent(BtnTeoria)
                    .addComponent(BtnDesarrolladores))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void BtnTeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTeoriaActionPerformed
        Teoria teoria = new Teoria();
        Fondo.removeAll();
        this.Fondo.add(teoria.getFondo());
        this.Fondo.repaint();
    }//GEN-LAST:event_BtnTeoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scrum scrum = new Scrum();
        scrum.setVisible(true);
        scrum.setResizable(false);
    }

    public JPanel getFondo() {
        return Fondo;
    }

    public void setFondo(JPanel Fondo) {
        this.Fondo = Fondo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDesarrolladores;
    private javax.swing.JButton BtnPrincipal;
    private javax.swing.JButton BtnTeoria;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextArea Info4;
    private javax.swing.JTextArea Info5;
    private javax.swing.JTextArea Info6;
    private javax.swing.JTextArea Info7;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
