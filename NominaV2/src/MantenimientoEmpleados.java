/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empleados;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Leonel Miranda
 */
public class MantenimientoEmpleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoEmpleados
     */
    public MantenimientoEmpleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_salariob = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_email = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        txt_departamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_codigoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_puestoa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_fdcon = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        label_estatus = new javax.swing.JLabel();

        jLabel1.setText("Nombre del empleado:");

        jLabel11.setText("Titulo Profesional:");

        jLabel3.setText("direccion:");

        jLabel12.setText("Salario base:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Email:");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Genero:");

        jLabel4.setText("codigo de empleado:");

        jLabel5.setText("Departamento:");

        jLabel6.setText("Codigo asignado:");

        jLabel7.setText("telefono:");

        jLabel8.setText("Puesto Asignado:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Mantenimiento Empleados");

        jLabel10.setText("Estado:");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Fecha de Contratacion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 492, Short.MAX_VALUE)
                        .addComponent(label_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(291, 291, 291))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_nombre)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_codigoa)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_telefono)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_puestoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_email)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_genero)
                                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fdcon)
                                    .addComponent(jLabel15)
                                    .addComponent(txt_titulo)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_salariob, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(334, 334, 334)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(283, 283, 283)
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton4))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel9)
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_codigoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8))
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_puestoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)
                            .addGap(11, 11, 11)
                            .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_fdcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addGap(11, 11, 11)
                            .addComponent(txt_salariob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton4)
                    .addGap(25, 25, 25)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/covid", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into empleados values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_direccion.getText().trim());
            pst.setString(4, txt_departamento.getText().trim());
            pst.setString(5, txt_codigoa.getText().trim());
            pst.setString(6, txt_telefono.getText().trim());
            pst.setString(7, txt_puestoa.getText().trim());
            pst.setString(8, txt_email.getText().trim());
            pst.setString(9, txt_genero.getText().trim());
            pst.setString(10, txt_estado.getText().trim());
            pst.setString(11, txt_fdcon.getText().trim());
            pst.setString(12, txt_titulo.getText().trim());
            pst.setString(13, txt_salariob.getText().trim());
            pst.executeUpdate();

            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_departamento.setText("");
            txt_codigoa.setText("");
            txt_telefono.setText("");
            txt_puestoa.setText("");
            txt_email.setText("");
            txt_genero.setText("");
            txt_estado.setText("");
            txt_fdcon.setText("");
            txt_titulo.setText("");
            txt_salariob.setText("");
            txt_buscar.setText("");

            label_estatus.setText("Registro exitoso.");
        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite actualizar registros en la base de datos
       try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/covid", "root", "");
            PreparedStatement pst = cn.prepareStatement("update empleados set NombreDelEmpleado = ?, Direccion = ?, Departamento = ?, CodigoAsignado = ?, Telefono = ?, PuestoAsignado = ?, Email = ?, Genero = ?, Estado = ?, FechaDeContratacion = ?, TituloProfesional = ?, SalarioBase = ?,  where ID = " + ID);

            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_direccion.getText().trim());
            pst.setString(3, txt_departamento.getText().trim());
            pst.setString(4, txt_codigoa.getText().trim());
            pst.setString(5, txt_telefono.getText().trim());
            pst.setString(6, txt_puestoa.getText().trim());
            pst.setString(7, txt_email.getText().trim());
            pst.setString(8, txt_genero.getText().trim());
            pst.setString(9, txt_estado.getText().trim());
            pst.setString(10, txt_fdcon.getText().trim());
            pst.setString(11, txt_titulo.getText().trim());
            pst.setString(12, txt_salariob.getText().trim());
            
            pst.executeUpdate();

            label_estatus.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from alumnos where ID = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_departamento.setText("");
            txt_codigoa.setText("");
            txt_telefono.setText("");
            txt_puestoa.setText("");
            txt_email.setText("");
            txt_genero.setText("");
            txt_estado.setText("");
            txt_fdcon.setText("");
            txt_titulo.setText("");
            txt_salariob.setText("");
            txt_buscar.setText("");

            label_estatus.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Codigo que permite consultar registros en la base de datos
       try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/covid", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from empleados where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_nombre.setText(rs.getString("NombreDelEmpleado"));
                txt_direccion.setText(rs.getString("DireccionDelEmpleado"));
                txt_departamento.setText(rs.getString("Departamento"));
                txt_codigoa.setText(rs.getString("CodigoAsignado"));
                txt_telefono.setText(rs.getString("TelefonoDelEmpleado"));
                txt_puestoa.setText(rs.getString("PuestoAsignado"));
                txt_email.setText(rs.getString("EmailDelEmpleado"));
                txt_genero.setText(rs.getString("Genero"));
                txt_estado.setText(rs.getString("Estado"));
                txt_fdcon.setText(rs.getString("FechaDeContratacion"));
                txt_titulo.setText(rs.getString("Titulo"));
                txt_salariob.setText(rs.getString("SueldoBase"));
               
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_estatus;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigoa;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fdcon;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_puestoa;
    private javax.swing.JTextField txt_salariob;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
