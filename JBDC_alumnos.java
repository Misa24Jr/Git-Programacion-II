package conectaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class alumnos extends javax.swing.JFrame {
	
	ButtonGroup btn;

    public alumnos() {
        initComponents();
        txtid.setVisible(false);
        btn = new ButtonGroup();
        btn.add(rbm);
        btn.add(rbf);
        cargarTabla();
    }


    @SuppressWarnings("unchecked")
                 
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtmatricula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        rbm = new javax.swing.JRadioButton();
        rbf = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Alumnos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Matricula", "Nombre", "Sexo", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Matricula");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("edad");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        btnguardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        txtmatricula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtedad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rbm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbm.setText("Masculino");

        rbf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbf.setText("Femenino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(17, 17, 17)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(rbm)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(rbf))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtmatricula)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbm)
                    .addComponent(rbf))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnlimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String matricula = txtmatricula.getText();
        String nombre = txtnombre.getText();
        int edad = Integer.parseInt(txtedad.getText());
        String email = txtemail.getText();
        String sexo;
        if(rbm.isSelected()==true){
            sexo="M";
        }else if(rbf.isSelected()==true){
            sexo="F";
        } else {
            sexo="M";
        }
        	try {
        		Connection miConexion = conexion.conectarse();
        		PreparedStatement ps = miConexion.prepareStatement("INSERT INTO alumnos(matricula, nombre, edad, email, sexo, activo) VALUES(?, ?, ?, ?, ?, ?)");
        		ps.setString(1, matricula);
        		ps.setString(2, nombre);
        		ps.setInt(3, edad);
        		ps.setString(4, email);
        		ps.setString(5, sexo);
        		ps.setInt(6, 1);
        		ps.executeUpdate();
        		JOptionPane.showMessageDialog(null , "Registro guardado");
        		
        		cargarTabla();
            	Limpiar();
        		
        	} catch(Exception e){
        		JOptionPane.showMessageDialog(null , e.toString());
        	}
    }                                          

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {
    	int id = Integer.parseInt(txtid.getText());
    	 String matricula = txtmatricula.getText();
         String nombre = txtnombre.getText();
         int edad = Integer.parseInt(txtedad.getText());
         String email = txtemail.getText();
         String sexo;
         if(rbm.isSelected()==true){
             sexo="M";
         }else if(rbf.isSelected()==true){
             sexo="F";
         } else {
             sexo="M";
         }
         	try {
         		Connection miConexion = conexion.conectarse();
         		PreparedStatement ps = miConexion.prepareStatement("UPDATE alumnos SET matricula=?, nombre=?, edad=?, sexo=?, email=? WHERE id=?");
         		ps.setString(1, matricula);
         		ps.setString(2, nombre);
         		ps.setInt(3, edad);
         		ps.setString(4, sexo);
         		ps.setString(5, email);
         		ps.setInt(6, id);
         		ps.executeUpdate();
         		JOptionPane.showMessageDialog(null , "Registro modificado");
         		
    		Limpiar();
    		cargarTabla();
    		
    	} catch(Exception e){
    		JOptionPane.showMessageDialog(null , e.toString());
    	} 
    }                                            

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	try {
        	int id = Integer.parseInt(txtid.getText());
        	
        	
        	try {
        		Connection miConexion = conexion.conectarse();
        		PreparedStatement ps = miConexion.prepareStatement("DELETE FROM alumnos WHERE id=?");
        		ps.setInt(1, id);
        		ps.executeUpdate();
        		
        		JOptionPane.showMessageDialog(null , "Registro eliminado");
        		Limpiar();
        		cargarTabla();
        		
        	} catch(Exception e){
        		JOptionPane.showMessageDialog(null , e.toString());
        	}
        	} catch (Exception e) {
        		JOptionPane.showMessageDialog(null , "Hubo algun error al guardar datos\n Codigo de error:"+e.toString());
        	}
        }                                       

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	Limpiar();
    }      
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        try {
        	int fila = jTable1.getSelectedRow();
    		int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
    		Connection miConexion = conexion.conectarse();
    		PreparedStatement ps;
    		ResultSet rs;
    		ps = miConexion.prepareStatement("SELECT matricula, nombre, edad, sexo, email FROM alumnos WHERE id=?");
    		ps.setInt(1, id);
    		rs = ps.executeQuery();
    		
    		while(rs.next()) {
    			txtid.setText(String.valueOf(id));
    			txtmatricula.setText(rs.getString("matricula"));
    			txtnombre.setText(rs.getString("nombre"));
    			txtedad.setText(rs.getString("edad"));
    			txtemail.setText(rs.getString("email"));
    			if(rs.getString("sexo").equals("M")){
    				rbm.setSelected(true);
    			} else if (rs.getString("sexo").equals("F")){
    				rbf.setSelected(true);
    			}
    		}
        } catch (Exception e) {
        	
        }
    }     
    
    private void Limpiar() {
    	txtid.setText("");
    	txtmatricula.setText("");
    	txtnombre.setText("");
    	txtedad.setText("");
    	txtemail.setText("");
    	btn.clearSelection();
    }
    
    private void cargarTabla() {
    	int[] anchos = {10, 50, 100, 30, 100};
    	for(int i=0; i<jTable1.getColumnCount(); i++) {
    		jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
    	}
    	DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
    	modeloTabla.setRowCount(0);
    	PreparedStatement ps;
    	ResultSet rs;
    	ResultSetMetaData rsmd;
    	int columnas;
    	
    	try {
    		Connection miConexion = conexion.conectarse();
    		ps = miConexion.prepareStatement("SELECT id, matricula, nombre, sexo, email FROM alumnos");
    		rs = ps.executeQuery();
    		rsmd = rs.getMetaData();
    		columnas = rsmd.getColumnCount();
    		
    		while(rs.next()) {
    			Object[] fila = new Object [columnas];
    			for(int i=0; i<columnas; i++) {
    				fila[i] = rs.getObject(i+1);
    			}
    			modeloTabla.addRow(fila);
    		}
    	}catch (Exception e){
    		JOptionPane.showMessageDialog(null , e.toString());
    	}
    }
   
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alumnos().setVisible(true);
            }
        });
    }

                  
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbf;
    private javax.swing.JRadioButton rbm;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnombre;               
}
