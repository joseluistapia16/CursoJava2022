/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.curso2022_2.views;

import com.curso2022_2.dao.CrudDocente;
import com.curso2022_2.domain.Docente;
import com.curso2022_2.domain.Usuario;
import com.curso2022_2.procesos.Procesos;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario
 */
public class EditDocente1 extends javax.swing.JDialog {

    CrudDocente crud = new CrudDocente();
    Usuario user1 = null;
    String rutaImagen = "";
    Docente objDC = null;
    String opc[] = { "PPP", "VINCULACION","DESARROLLO", "INGLES", "TITULACION" };

    /**
     * Creates new form NewDocente
     */
    public EditDocente1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        imagenVacia();
    }

    public EditDocente1(Usuario obj, Docente objc, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        objDC = objc;
        // imagenVacia();
        user1 = obj;
        dataCharge(objc);
        System.out.println("user 1 " + user1.getData());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        horas = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        gestoria = new javax.swing.JComboBox<>();
        lb4 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        actu = new javax.swing.JToggleButton();
        eliminar = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cedula");

        lb2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Apellidos");

        lb10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb10.setText("Sueldo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Gestoria");

        cedula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });

        horas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        horas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horasKeyTyped(evt);
            }
        });

        apellidos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        apellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nombres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gestoria.setModel(new javax.swing.DefaultComboBoxModel<>(opc));

        lb4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb4.setText("Horas");

        sueldo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gestoria, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb2)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb10)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gestoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto.setIcon(new javax.swing.ImageIcon("C:\\Users\\sopor\\Downloads\\avatar1.png")); // NOI18N
        foto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        actu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        actu.setText("Actualizar");
        actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton3.setText("Salir");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sin imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        var car = evt.getKeyChar();
        if (cedula.getText().length() >= 10) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getImage("\\Users\\sopor\\Downloads\\avatar1.png");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        imagenVacia();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuActionPerformed
        save();
    }//GEN-LAST:event_actuActionPerformed

    private void horasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horasKeyTyped
        var car = evt.getKeyChar();
        if (horas.getText().length() >= 3) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_horasKeyTyped

    private void sueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyTyped
        var car = evt.getKeyChar();
        if (sueldo.getText().length() >= 12) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_sueldoKeyTyped

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      var res = crud.delete(objDC.getCedula());
        JOptionPane.showMessageDialog(null, res);
        actu.setEnabled(false);
        eliminar.setEnabled(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void save() {
        var numero = sueldo.getText();
        var horas1 = horas.getText();
        if (numero == null || "".equals(numero) || numero.trim().length() == 0) {
            numero = "0.0";
            sueldo.setText(numero);
        }
        if (horas1 == null || "".equals(horas1) || horas1.trim().length() == 0) {
            horas1 = "0";
            horas.setText(horas1);
        }
        var ruta = Procesos.getMsqlPath(rutaImagen);
        var ges = "" + gestoria.getSelectedItem();
        System.out.println("imagen ruta " + ruta + " combo " + ges);
        var obj = new Docente(cedula.getText(), user1.getUsuario(), nombres.getText(), apellidos.getText(),
                Double.parseDouble(numero),
                Integer.parseInt(horas1), ges, "A", ruta);

        System.out.println("obj " + obj.getData());
        var msg = crud.update(obj);
        JOptionPane.showMessageDialog(null, msg);
    }

    private void getImage(String path) {
        var dlg = new JFileChooser(path);
        dlg.setFileFilter(new FileNameExtensionFilter("Archivos de imagen",
                "tif", "jpg", "jpeg", "png", "gif"));
        var opc = dlg.showOpenDialog(this);
        if (opc == JFileChooser.APPROVE_OPTION) {
            var fil = dlg.getSelectedFile().getPath();
            foto.setIcon(new ImageIcon(fil));
            ImageIcon icon = new ImageIcon(fil);
            Image img = icon.getImage();
            Image nueva = img.getScaledInstance(450, 360, Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(nueva);
            foto.setIcon(newIcon);
            rutaImagen = dlg.getSelectedFile().getPath();
            System.out.println("Ruta " + rutaImagen);
        }
    }

    private void chargeImage(String path) {
        var fil = path;
        if (path.trim().length()<1){
            imagenVacia();
        }else{
        foto.setIcon(new ImageIcon(fil));
        ImageIcon icon = new ImageIcon(fil);
        Image img = icon.getImage();
        Image nueva = img.getScaledInstance(450, 360, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(nueva);
        foto.setIcon(newIcon);
        rutaImagen=path;
        System.out.println("Ruta " + rutaImagen);
        }

    }

    public void imagenVacia() {
        String fil = "\\Fichas Crear\\img\\sin_imagen.png";
        //String fil = "\\Users\\sopor\\OneDrive\\Documentos\\NetBeansProjects\\F_Crear\\F_Crear\\src\\img\\sin_imagen.png";
        foto.setIcon(new ImageIcon(fil));
        ImageIcon icon = new ImageIcon(fil);
        Image img = icon.getImage();
        System.out.println(fil + " Foto  " + foto.getWidth() + " " + foto.getHeight());
        Image newimg = img.getScaledInstance(450, 360, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcono = new ImageIcon(newimg);
        foto.setIcon(newIcono);
        rutaImagen = fil;
    }

    private void dataCharge(Docente obj) {
        cedula.setText(obj.getCedula());
        cedula.setEditable(false);
        nombres.setText(obj.getNombre());
        apellidos.setText(obj.getApellido());
        sueldo.setText(obj.getSueldo().toString());
        horas.setText(""+obj.getHoras());
        rutaImagen = obj.getImagen();   
        var pos= getOpc(obj.getGestoria());
        gestoria.setSelectedIndex(pos);
        chargeImage(rutaImagen);
    }
    
    private int getOpc(String cmb){
        var pos =0;
        for (int i = 0; i < opc.length; i++) {
            if (cmb.equals(opc[i])) {
                pos = i;
                break;
            }
        }
        
        return pos;
        
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
            java.util.logging.Logger.getLogger(EditDocente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDocente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDocente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDocente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditDocente1 dialog = new EditDocente1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton actu;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JToggleButton eliminar;
    private javax.swing.JLabel foto;
    private javax.swing.JComboBox<String> gestoria;
    private javax.swing.JTextField horas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb4;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
