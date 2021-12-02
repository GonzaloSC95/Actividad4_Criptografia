package Vista;

import Controlador.Encriptacion_Asimetrica;
import Controlador.Encriptacion_Simetrica;
import Modelo.Coche;
import java.awt.Toolkit;
import javax.crypto.SealedObject;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class Crypto extends javax.swing.JFrame {

    private static String mensajeEnMemoria = "";
    private static Coche cocheEnMemoria = null;

    /**
     * Constructor de la interfaz gráfica
     */
    public Crypto() {
        initComponents();
        setTitle("CRYPTO");
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon.png")));
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        tipoDeEncriptacion = new javax.swing.JToggleButton();
        salir = new javax.swing.JButton();
        encriptarMensaje = new javax.swing.JButton();
        desencriptarMensaje = new javax.swing.JButton();
        encriptarCoche = new javax.swing.JButton();
        desencriptarCoche = new javax.swing.JButton();
        mensajeLabel = new javax.swing.JLabel();
        mensaje = new javax.swing.JTextField();
        matriculaLabel = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        marcaLabel = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        modeloLabel = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        precioLabel = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoText = new javax.swing.JTextArea();
        encriptLabel = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1144, 669));
        setMinimumSize(new java.awt.Dimension(1144, 669));
        setResizable(false);
        setSize(new java.awt.Dimension(1144, 669));

        panelFondo.setBackground(java.awt.Color.black);
        panelFondo.setMaximumSize(new java.awt.Dimension(1114, 669));
        panelFondo.setMinimumSize(new java.awt.Dimension(1114, 669));

        img.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.PNG"))); // NOI18N

        tipoDeEncriptacion.setBackground(new java.awt.Color(238, 79, 0));
        tipoDeEncriptacion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tipoDeEncriptacion.setText("Simétrica");
        tipoDeEncriptacion.setToolTipText("");
        tipoDeEncriptacion.setBorderPainted(false);
        tipoDeEncriptacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoDeEncriptacion.setFocusPainted(false);
        tipoDeEncriptacion.setFocusable(false);
        tipoDeEncriptacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDeEncriptacionActionPerformed(evt);
            }
        });

        salir.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        salir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(238, 79, 0));
        salir.setText("Salir");
        salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 3, true));
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        encriptarMensaje.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        encriptarMensaje.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        encriptarMensaje.setForeground(new java.awt.Color(238, 79, 0));
        encriptarMensaje.setText("Encriptar Mensaje");
        encriptarMensaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 3, true));
        encriptarMensaje.setContentAreaFilled(false);
        encriptarMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encriptarMensaje.setFocusPainted(false);
        encriptarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarMensajeActionPerformed(evt);
            }
        });

        desencriptarMensaje.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        desencriptarMensaje.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        desencriptarMensaje.setForeground(new java.awt.Color(238, 79, 0));
        desencriptarMensaje.setText("Desencriptar Mensaje");
        desencriptarMensaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 3, true));
        desencriptarMensaje.setContentAreaFilled(false);
        desencriptarMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desencriptarMensaje.setFocusPainted(false);
        desencriptarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptarMensajeActionPerformed(evt);
            }
        });

        encriptarCoche.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        encriptarCoche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        encriptarCoche.setForeground(new java.awt.Color(238, 79, 0));
        encriptarCoche.setText("Encriptar Coche");
        encriptarCoche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 3, true));
        encriptarCoche.setContentAreaFilled(false);
        encriptarCoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encriptarCoche.setFocusPainted(false);
        encriptarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarCocheActionPerformed(evt);
            }
        });

        desencriptarCoche.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        desencriptarCoche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        desencriptarCoche.setForeground(new java.awt.Color(238, 79, 0));
        desencriptarCoche.setText("Desencriptar Coche");
        desencriptarCoche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 3, true));
        desencriptarCoche.setContentAreaFilled(false);
        desencriptarCoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desencriptarCoche.setFocusPainted(false);
        desencriptarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptarCocheActionPerformed(evt);
            }
        });

        mensajeLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(238, 79, 0));
        mensajeLabel.setText("Mensaje");

        mensaje.setBackground(java.awt.Color.black);
        mensaje.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        mensaje.setForeground(new java.awt.Color(238, 79, 0));
        mensaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 1, true));
        mensaje.setCaretColor(encriptarMensaje.getForeground());
        mensaje.setSelectionColor(java.awt.Color.black);

        matriculaLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        matriculaLabel.setForeground(new java.awt.Color(238, 79, 0));
        matriculaLabel.setText("Matrícula");

        matricula.setBackground(java.awt.Color.black);
        matricula.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        matricula.setForeground(new java.awt.Color(238, 79, 0));
        matricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 1, true));
        matricula.setCaretColor(encriptarMensaje.getForeground());
        matricula.setSelectionColor(java.awt.Color.black);

        marcaLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        marcaLabel.setForeground(new java.awt.Color(238, 79, 0));
        marcaLabel.setText("Marca");

        marca.setBackground(java.awt.Color.black);
        marca.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        marca.setForeground(new java.awt.Color(238, 79, 0));
        marca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 1, true));
        marca.setCaretColor(encriptarMensaje.getForeground());
        marca.setSelectionColor(java.awt.Color.black);

        modeloLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        modeloLabel.setForeground(new java.awt.Color(238, 79, 0));
        modeloLabel.setText("Modelo");

        modelo.setBackground(java.awt.Color.black);
        modelo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        modelo.setForeground(new java.awt.Color(238, 79, 0));
        modelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 1, true));
        modelo.setCaretColor(encriptarMensaje.getForeground());
        modelo.setSelectionColor(java.awt.Color.black);

        precioLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        precioLabel.setForeground(new java.awt.Color(238, 79, 0));
        precioLabel.setText("Precio");

        precio.setBackground(java.awt.Color.black);
        precio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        precio.setForeground(new java.awt.Color(238, 79, 0));
        precio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 1, true));
        precio.setCaretColor(encriptarMensaje.getForeground());
        precio.setSelectionColor(java.awt.Color.black);

        jScrollPane1.setBorder(null);

        resultadoText.setEditable(false);
        resultadoText.setBackground(java.awt.Color.black);
        resultadoText.setColumns(20);
        resultadoText.setForeground(new java.awt.Color(238, 79, 0));
        resultadoText.setLineWrap(true);
        resultadoText.setRows(5);
        resultadoText.setText("Crypto results........");
        resultadoText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 4, true));
        resultadoText.setCaretColor(new java.awt.Color(238, 79, 0));
        resultadoText.setFocusable(false);
        jScrollPane1.setViewportView(resultadoText);

        encriptLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        encriptLabel.setForeground(new java.awt.Color(238, 79, 0));
        encriptLabel.setText("Encriptación");

        borrar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        borrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        borrar.setForeground(new java.awt.Color(238, 79, 0));
        borrar.setText("Borrar");
        borrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 79, 0), 3, true));
        borrar.setContentAreaFilled(false);
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.setFocusPainted(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(desencriptarMensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addComponent(encriptarCoche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desencriptarCoche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encriptarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addComponent(encriptLabel)
                        .addGap(18, 18, 18)
                        .addComponent(tipoDeEncriptacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                .addComponent(mensajeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                .addComponent(matriculaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(precioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modeloLabel)
                                    .addComponent(marcaLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(195, 195, 195)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(33, 33, 33))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mensajeLabel)
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoDeEncriptacion)
                            .addComponent(encriptLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matriculaLabel)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marcaLabel)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encriptarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(modeloLabel)
                                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precioLabel)
                                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(desencriptarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(encriptarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(desencriptarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
///////////////////BOTON TIPO DE ENCRIPTACION///////////////////////////
    private void tipoDeEncriptacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDeEncriptacionActionPerformed

        ////////////////////////////////////
        if (tipoDeEncriptacion.isSelected()) {
            tipoDeEncriptacion.setText("Asimétrica");

        } else if (!tipoDeEncriptacion.isSelected()) {
            tipoDeEncriptacion.setText("Simétrica");
        }

    }//GEN-LAST:event_tipoDeEncriptacionActionPerformed
//////////BOTON BORRADO/////////////////////////////////////
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        borrado();
    }//GEN-LAST:event_borrarActionPerformed
//////////BOTON SALIR/////////////////////////////////////
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed
/////////////BOTON ENCRIPTAR MENSAJE//////////////////////////////
    private void encriptarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarMensajeActionPerformed
        try {
            borrarCampoCoche();
            ////////////////
            imagenCandado();
            ////////////////////////////////
            String mensajeEncriptado;
            ///////////////////////////////////
            if (!mensaje.getText().isEmpty()) {
                mensajeEnMemoria = mensaje.getText();
                borrarCampoMensaje();
            }
            if (mensajeEnMemoria.isEmpty()) {
                /////////////SI EL CAMPO MENSAJE ESTA VACIO//////////////////
                JOptionPane.showMessageDialog(null, "El campo mensaje "
                        + "no debe estar vacio; y no hay ningún "
                        + "mensaje guardado en memoria", null, JOptionPane.ERROR_MESSAGE);
            } else if (tipoDeEncriptacion.getText().equalsIgnoreCase("Simétrica")) {
                /////////////SI LA ENCRIPTACION ES SIMETRICA//////////////////
                mensajeEncriptado = new String(Encriptacion_Simetrica.mensajeEncriptado(mensajeEnMemoria));
                resultadoText.setText(mensajeEncriptado);
                /////////////SI LA ENCRIPTACION ES ASIMETRICA//////////////////
            } else if (tipoDeEncriptacion.getText().equalsIgnoreCase("Asimétrica")) {
                mensajeEncriptado = new String(Encriptacion_Asimetrica.mensajeEncriptado(mensajeEnMemoria));
                resultadoText.setText(mensajeEncriptado);
            }
            /////////////////////////////////
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El campo mensaje "
                    + "no debe estar vacio; y no hay ningún "
                    + "mensaje guardado en memoria", null, JOptionPane.ERROR_MESSAGE);
            System.err.println("Error --------> " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_encriptarMensajeActionPerformed
/////////////BOTON DESENCRIPTAR MENSAJE//////////////////////////////
    private void desencriptarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptarMensajeActionPerformed
        try {
            borrarCampoCoche();
            ////////////////
            imagenLLaves();
            /////////////////////////////
            String mensajeDesEncriptado;
            //////////////////////////////////
            if (mensajeEnMemoria.isEmpty()) {
                /////////////SI EL CAMPO MENSAJE ESTA VACIO//////////////////
                JOptionPane.showMessageDialog(null, "No hay ningún mensaje "
                        + "encriptado, guardado en la memoria", null, JOptionPane.ERROR_MESSAGE);
            } else if (tipoDeEncriptacion.getText().equalsIgnoreCase("Simétrica")) {
                /////////////SI LA ENCRIPTACION ES SIMETRICA//////////////////
                mensajeDesEncriptado = Encriptacion_Simetrica.mensajeDesEncriptado(Encriptacion_Simetrica.mensajeEncriptado(mensajeEnMemoria));
                resultadoText.setText(mensajeDesEncriptado);
                /////////////SI LA ENCRIPTACION ES ASIMETRICA//////////////////
            } else if (tipoDeEncriptacion.getText().equalsIgnoreCase("Asimétrica")) {
                mensajeDesEncriptado = Encriptacion_Asimetrica.mensajeDesEncriptado(Encriptacion_Asimetrica.mensajeEncriptado(mensajeEnMemoria));
                resultadoText.setText(mensajeDesEncriptado);
            }
            /////////////////////////////////
        } catch (Exception e) {
            System.err.println("Error --------> " + e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "No hay ningún mensaje "
                    + "encriptado, guardado en la memoria", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_desencriptarMensajeActionPerformed
////////////////////BOTON ENCRIPTAR COCHE//////////////////////////////////
    private void encriptarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarCocheActionPerformed
        try {
            borrarCampoMensaje();
            //////////////////
            imagenCandado();
            ////////////////////////////////
            SealedObject cocheEncriptado;
            //////////////////////////////////
            if (cocheEnMemoria == null) {
                String marca = this.marca.getText();
                String modelo = this.modelo.getText();
                double precio = Double.parseDouble(this.precio.getText().replace(",", "."));
                String matricula = this.matricula.getText();
                /////////////SI LOS ATRIBUTOS DEL COCHE ESTAN VACIOS//////////////////
                if (marca.isEmpty() || modelo.isEmpty() || this.precio.getText().isEmpty() || matricula.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ningún atributo del coche "
                            + "puede estar vacio; y el precio del coche debe ser un número. "
                            + "Tampoco hay ningún coche guardado en memoria", null, JOptionPane.ERROR_MESSAGE);
                    //////////////////////////////////

                } else {
                    /////////////SI LOS ATRIBUTOS DEL COCHE NO ESTAN VACIOS//////////////////
                    cocheEnMemoria = new Coche(matricula, marca, modelo, precio);
                    borrarCampoCoche();
                }
            }
            /////////////////////////////////////////////////////////////////////
            if (tipoDeEncriptacion.getText().equalsIgnoreCase("Simétrica")) {
                /////////////SI LA ENCRIPTACION ES SIMETRICA//////////////////
                cocheEncriptado = Encriptacion_Simetrica.cocheEncriptado(cocheEnMemoria);
                resultadoText.setText(cocheEncriptado.toString());
                /////////////SI LA ENCRIPTACION ES ASIMETRICA//////////////////
            } else if (tipoDeEncriptacion.getText().equalsIgnoreCase("Asimétrica")) {
                cocheEncriptado = Encriptacion_Asimetrica.cocheEncriptado(cocheEnMemoria);
                resultadoText.setText(cocheEncriptado.toString());
            }
            /////////////////////////////////
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ningún atributo del coche "
                    + "puede estar vacio; y el precio del coche debe ser un número. "
                    + "Tampoco hay ningún coche guardado en memoria", null, JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No hay ningún coche guardado en memoria, "
                    + "debes rellenar todos los campos del formulario para crear uno. "
                    + "Recuerda, el precio debe estar en formato número", null, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.err.println("Error --------> " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_encriptarCocheActionPerformed
/////////////DESENCRIPTAR COCHE//////////////////////////////////////////////////////////
    private void desencriptarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptarCocheActionPerformed
        try {
            borrarCampoMensaje();
            //////////////////
            imagenLLaves();
            //////////////////////////////////
            Coche cocheDesEncriptado;
            //////////////////////////////////
            //////////////////////////////////////
            if (cocheEnMemoria.equals(null)) {
                /////////////SI LOS ATRIBUTOS DEL COCHE ESTAN VACIOS//////////////////
                JOptionPane.showMessageDialog(null, "No hay ningún coche encriptado, guardado en memoria", null, JOptionPane.ERROR_MESSAGE);
            } else if (tipoDeEncriptacion.getText().equalsIgnoreCase("Simétrica")) {
                /////////////SI LA ENCRIPTACION ES SIMETRICA//////////////////
                cocheDesEncriptado = Encriptacion_Simetrica.cocheDesEncriptado(Encriptacion_Simetrica.cocheEncriptado(cocheEnMemoria));
                resultadoText.setText(cocheDesEncriptado.toString());
                /////////////SI LA ENCRIPTACION ES ASIMETRICA//////////////////
            } else if (tipoDeEncriptacion.getText().equalsIgnoreCase("Asimétrica")) {
                cocheDesEncriptado = Encriptacion_Asimetrica.cocheDesEncriptado(Encriptacion_Asimetrica.cocheEncriptado(cocheEnMemoria));
                resultadoText.setText(cocheDesEncriptado.toString());
            }
            /////////////////////////////////
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ningún atributo del coche "
                    + "puede estar vacio; y el precio del coche debe ser un número", null, JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No hay ningún coche encriptado, guardado en memoria", null, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.err.println("Error --------> " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_desencriptarCocheActionPerformed

    /**
     * Borrar todos los campos
     */
    public void borrado() {
        mensaje.setText("");
        matricula.setText("");
        modelo.setText("");
        precio.setText("");
        marca.setText("");
        resultadoText.setText("");
        mensajeEnMemoria = "";
        cocheEnMemoria = null;
    }

    /**
     * Cambiar la imagen a candado
     */
    public void imagenCandado() {
        /////////////////////////////////////////////
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.PNG"))); // NOI18N
        ////////////////////////////////////////////////
    }

    /**
     * Cambiar la imagen a llaves
     */
    public void imagenLLaves() {
        /////////////////////////////////////////////
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llaves.png"))); // NOI18N
        ////////////////////////////////////////////////
    }

    /**
     * Borrar el campos mensaje
     */
    public void borrarCampoMensaje() {
        mensaje.setText("");
    }

    /**
     * Borrar los atributos del coche
     */
    public void borrarCampoCoche() {
        matricula.setText("");
        marca.setText("");
        modelo.setText("");
        precio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton desencriptarCoche;
    private javax.swing.JButton desencriptarMensaje;
    private javax.swing.JLabel encriptLabel;
    private javax.swing.JButton encriptarCoche;
    private javax.swing.JButton encriptarMensaje;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JTextField matricula;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JTextField mensaje;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JTextField modelo;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JTextArea resultadoText;
    private javax.swing.JButton salir;
    private javax.swing.JToggleButton tipoDeEncriptacion;
    // End of variables declaration//GEN-END:variables
}
