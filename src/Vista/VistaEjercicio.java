/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Modelo.Moneda;
import Modelo.Metodo_Bernolli;
import Modelo.ModeloPoisson;
import Modelo.Dado;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author olgal
 */
public class VistaEjercicio extends javax.swing.JFrame {

    private Moneda moneda;
    private Dado dado;
    private int conteo, conteoDado;
    DefaultTableModel modelo;
    DefaultTableModel modeloDado;
    private ModeloPoisson poisson;
    private Metodo_Bernolli mtd_bernolli;
    ArrayList<Integer> valoresDado;

    /**
     * Creates new form VistaEjercicio
     */
    public VistaEjercicio() {
        initComponents();
        valoresDado = new ArrayList<>();
        moneda = new Moneda();
        ImageIcon incertidumbre;
        incertidumbre = new ImageIcon(getClass().getResource("/Imagenes/duda.png"));
        Icon icono_duda = new ImageIcon(incertidumbre.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
        lblimagen.setIcon(icono_duda);
        conteo = 1;
        modelo = new DefaultTableModel();
        modelo.addColumn("Nro Lanzamiento");
        modelo.addColumn("Resultado");
        conteoDado = 1;
        modeloDado = new DefaultTableModel();
        modeloDado.addColumn("Nro Lanzamiento");
        modeloDado.addColumn("Resultado");
        tabResultados.setModel(modelo);
        tabResultDado.setModel(modeloDado);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelBernoulli = new javax.swing.JPanel();
        lblLanzamiento = new javax.swing.JLabel();
        txtLanzamiento = new javax.swing.JTextField();
        txtResDes = new javax.swing.JTextField();
        lblResDeseado = new javax.swing.JLabel();
        lblProbabilidad = new javax.swing.JLabel();
        LblTituloLanz = new javax.swing.JLabel();
        LblTituloProbab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabResultados = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnLaanzar = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        PanelBernoulli1 = new javax.swing.JPanel();
        txtResultadoDeseado = new javax.swing.JTextField();
        lblResDeseado1 = new javax.swing.JLabel();
        lblProbabilidad1 = new javax.swing.JLabel();
        LblTituloProbab1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabResultDado = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnLanzarDado = new javax.swing.JButton();
        lblDado = new javax.swing.JLabel();
        btnCalcularPoisson = new javax.swing.JButton();
        btnDetenerDado = new javax.swing.JButton();
        btn10Dados = new javax.swing.JButton();
        btn100Dados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTuResultado = new javax.swing.JLabel();
        lblResultadoDado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblProbabilidadDado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblValorDadoMasRepetido = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBernoulli.setBackground(new java.awt.Color(228, 241, 242));

        lblLanzamiento.setText("Nro Lanzamientos");

        txtResDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResDesActionPerformed(evt);
            }
        });

        lblResDeseado.setText("Resultado Deseado");

        LblTituloLanz.setText("Lanzamientos");

        LblTituloProbab.setText("Calculo de Probabilidad");

        tabResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nro_Lanzamiento", "Resultado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabResultados);

        btnLaanzar.setText("Lanzar");
        btnLaanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaanzarActionPerformed(evt);
            }
        });

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/duda.png"))); // NOI18N

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnDetener.setText("Detener");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBernoulliLayout = new javax.swing.GroupLayout(PanelBernoulli);
        PanelBernoulli.setLayout(PanelBernoulliLayout);
        PanelBernoulliLayout.setHorizontalGroup(
            PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulliLayout.createSequentialGroup()
                .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBernoulliLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblTituloProbab)
                        .addGap(56, 56, 56))
                    .addGroup(PanelBernoulliLayout.createSequentialGroup()
                        .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBernoulliLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLanzamiento)
                                    .addComponent(lblResDeseado))
                                .addGap(32, 32, 32)
                                .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCalcular)
                                    .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLanzamiento)
                                        .addComponent(txtResDes, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))))
                            .addGroup(PanelBernoulliLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lblProbabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)))
                .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulliLayout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulliLayout.createSequentialGroup()
                            .addComponent(btnLaanzar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(btnDetener)
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulliLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(101, 101, 101)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulliLayout.createSequentialGroup()
                        .addComponent(LblTituloLanz)
                        .addGap(313, 313, 313))))
        );
        PanelBernoulliLayout.setVerticalGroup(
            PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBernoulliLayout.createSequentialGroup()
                .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBernoulliLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblimagen)
                            .addComponent(btnDetener))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBernoulliLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBernoulliLayout.createSequentialGroup()
                                .addComponent(LblTituloLanz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLanzamiento)
                                    .addComponent(txtLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLaanzar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelBernoulliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblResDeseado)
                                    .addComponent(txtResDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LblTituloProbab))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)
                        .addGap(34, 34, 34)
                        .addComponent(lblProbabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bernoulli", PanelBernoulli);

        PanelBernoulli1.setBackground(new java.awt.Color(228, 241, 242));

        txtResultadoDeseado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoDeseadoActionPerformed(evt);
            }
        });

        lblResDeseado1.setText("Resultado Deseado");

        LblTituloProbab1.setText("Calculo de Probabilidad");

        tabResultDado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nro_Lanzamiento", "Resultado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabResultDado);

        btnLanzarDado.setText("Lanzar");
        btnLanzarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarDadoActionPerformed(evt);
            }
        });

        lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/duda.png"))); // NOI18N

        btnCalcularPoisson.setText("Calcular");
        btnCalcularPoisson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPoissonActionPerformed(evt);
            }
        });

        btnDetenerDado.setText("Detenerse");
        btnDetenerDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerDadoActionPerformed(evt);
            }
        });

        btn10Dados.setText("Lanzar 10 dados");
        btn10Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10DadosActionPerformed(evt);
            }
        });

        btn100Dados.setText("Lanzar 100 dados");
        btn100Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100DadosActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado del dado:");

        jLabel2.setText("Tu resultado:");

        jLabel4.setText("Probabilidad de acierto: ");

        jLabel5.setText("Número más repetido: ");

        javax.swing.GroupLayout PanelBernoulli1Layout = new javax.swing.GroupLayout(PanelBernoulli1);
        PanelBernoulli1.setLayout(PanelBernoulli1Layout);
        PanelBernoulli1Layout.setHorizontalGroup(
            PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulli1Layout.createSequentialGroup()
                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                        .addContainerGap(211, Short.MAX_VALUE)
                        .addComponent(LblTituloProbab1)
                        .addGap(105, 105, 105))
                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn100Dados)
                                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                        .addComponent(btn10Dados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblProbabilidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblResDeseado1)
                                .addGap(32, 32, 32)
                                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCalcularPoisson)
                                    .addComponent(txtResultadoDeseado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(50, 50, 50)
                                        .addComponent(lblTuResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProbabilidadDado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblResultadoDado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblValorDadoMasRepetido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulli1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulli1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulli1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetenerDado)
                    .addComponent(btnLanzarDado))
                .addGap(21, 21, 21))
        );
        PanelBernoulli1Layout.setVerticalGroup(
            PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDado)
                            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                .addComponent(btnLanzarDado)
                                .addGap(31, 31, 31)
                                .addComponent(btnDetenerDado)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblResDeseado1)
                                            .addComponent(txtResultadoDeseado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addComponent(LblTituloProbab1)))
                            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblTuResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcularPoisson)
                            .addComponent(jLabel4)
                            .addComponent(lblProbabilidadDado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulli1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(btn10Dados)
                                        .addGap(36, 36, 36))
                                    .addGroup(PanelBernoulli1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(lblProbabilidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblResultadoDado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)))
                                .addComponent(btn100Dados))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBernoulli1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelBernoulli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblValorDadoMasRepetido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Poisson", PanelBernoulli1);

        jTabbedPane1.addTab("Poisson", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaanzarActionPerformed

        ImageIcon imgmoneda;
        imgmoneda = new ImageIcon(getClass().getResource("/Imagenes/Moneda.gif"));
        Icon icono_moneda = new ImageIcon(imgmoneda.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
        lblimagen.setIcon(icono_moneda);


    }//GEN-LAST:event_btnLaanzarActionPerformed

    private void txtResDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResDesActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int resuldes;
        int nroLanzamiento;
        resuldes=Integer.parseInt(this.txtResDes.getText());
        nroLanzamiento=Integer.parseInt(this.txtLanzamiento.getText());
        mtd_bernolli= new Metodo_Bernolli(resuldes,nroLanzamiento,this.moneda.getProbabilidad());
        this.lblProbabilidad.setText(String.format("%.2f",mtd_bernolli.calculo_Bernoulli())+"%");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
        visualizarMoneda();
        Registrar();


    }//GEN-LAST:event_btnDetenerActionPerformed

    private void txtResultadoDeseadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoDeseadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoDeseadoActionPerformed

    private void btnLanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarDadoActionPerformed
        establecerGifDado();
    }//GEN-LAST:event_btnLanzarDadoActionPerformed

    private void btnCalcularPoissonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPoissonActionPerformed
        poisson = new ModeloPoisson();
        System.out.println(conteoDado);
        poisson.setNumeroOccurencias(conteoDado);
        lblTuResultado.setText(txtResultadoDeseado.getText());
        lblResultadoDado.setText(lanzarDadoUnaVez());
        poisson.setNumeroVecesIntervalo(conteoDado*10);
        lblProbabilidadDado.setText(Double.toString(poisson.getResultado()));
        valorMasDadoRepetido();
    }//GEN-LAST:event_btnCalcularPoissonActionPerformed

    private void btnDetenerDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerDadoActionPerformed
        lanzarDadoUnaVez();
        valorMasDadoRepetido();
    }//GEN-LAST:event_btnDetenerDadoActionPerformed

    private void btn10DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10DadosActionPerformed
        dado = new Dado();
        establecerGifDado();
        for (int i = 0; i < 10; i++) {
            int resultado = dado.lanzarDado();
            RegistrarDado(Integer.toString(resultado));
        }
        valorMasDadoRepetido();
    }//GEN-LAST:event_btn10DadosActionPerformed

    private void btn100DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100DadosActionPerformed
        dado = new Dado();
        establecerGifDado();
        for (int i = 0; i < 100; i++) {
            int resultado = dado.lanzarDado();
            RegistrarDado(Integer.toString(resultado));
        }
        valorMasDadoRepetido();
    }//GEN-LAST:event_btn100DadosActionPerformed

    public void valorMasDadoRepetido() {
        int contador1 =0, contador2 =0, contador3 =0, contador4=0, contador5=0, 
                contador6 = 0;
        
        for (int i = 0; i < valoresDado.size(); i++) {
            switch(valoresDado.get(i)) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                default:
                    contador6++;
                    break;
            }
        } 
       int[] valores = {contador1, contador2, contador3, contador4, contador5, contador6};
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        int mayor = contador1;
        int contadorMayor = 1;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayor) {
                contadorMayor = i;
            }
        }
        lblValorDadoMasRepetido.setText(Integer.toString(contadorMayor));
    }
    
    static void burbuja(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
    }
    
    public String lanzarDadoUnaVez() {
        dado = new Dado();
        int resultado = dado.lanzarDado();
        RegistrarDado(Integer.toString(resultado));
        establecerImagenDado(resultado);
        return Integer.toString(resultado);
    }
    
    public void establecerImagenDado (int resultado) {
        ImageIcon imgDado;
        imgDado = new ImageIcon(getClass().getResource("/Imagenes/Dice/"+resultado+".png"));
        Icon icono_dado = new ImageIcon(imgDado.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
        lblDado.setIcon(icono_dado);
    }
    
    public void establecerGifDado() {
        ImageIcon imgDado;
        imgDado = new ImageIcon(getClass().getResource("/Imagenes/Dice/dado-gif.gif"));
        Icon icono_dado = new ImageIcon(imgDado.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
        lblDado.setIcon(icono_dado);
    }
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
            java.util.logging.Logger.getLogger(VistaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEjercicio().setVisible(true);
            }
        });
    }

    private void visualizarMoneda() {
        if (moneda.lanzar() == true) {
            ImageIcon cara;
            cara = new ImageIcon(getClass().getResource("/Imagenes/cara.png"));
            Icon icono_cara = new ImageIcon(cara.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
            lblimagen.setIcon(icono_cara);
        } else {
            ImageIcon sello;
            sello = new ImageIcon(getClass().getResource("/Imagenes/sello.png"));
            Icon icono_sello = new ImageIcon(sello.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
            lblimagen.setIcon(icono_sello);
        }
    }

    private void Registrar() {
        String registro[] = new String[2];
        registro[0] = Integer.toString(conteo++);
        if (moneda.islado() == true) {
            registro[1] = "Cara";
        } else {
            registro[1] = "Sello";
        }

        modelo.addRow(registro);
    }
    
    private void RegistrarDado(String resultado) {
        String registro[] = new String[2];
        registro[0] = Integer.toString(conteo++);
        registro[1] = resultado;
        valoresDado.add(Integer.parseInt(resultado));
        modeloDado.addRow(registro);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTituloLanz;
    private javax.swing.JLabel LblTituloProbab;
    private javax.swing.JLabel LblTituloProbab1;
    private javax.swing.JPanel PanelBernoulli;
    private javax.swing.JPanel PanelBernoulli1;
    private javax.swing.JButton btn100Dados;
    private javax.swing.JButton btn10Dados;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularPoisson;
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnDetenerDado;
    private javax.swing.JButton btnLaanzar;
    private javax.swing.JButton btnLanzarDado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblLanzamiento;
    private javax.swing.JLabel lblProbabilidad;
    private javax.swing.JLabel lblProbabilidad1;
    private javax.swing.JLabel lblProbabilidadDado;
    private javax.swing.JLabel lblResDeseado;
    private javax.swing.JLabel lblResDeseado1;
    private javax.swing.JLabel lblResultadoDado;
    private javax.swing.JLabel lblTuResultado;
    private javax.swing.JLabel lblValorDadoMasRepetido;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTable tabResultDado;
    private javax.swing.JTable tabResultados;
    private javax.swing.JTextField txtLanzamiento;
    private javax.swing.JTextField txtResDes;
    private javax.swing.JTextField txtResultadoDeseado;
    // End of variables declaration//GEN-END:variables
}