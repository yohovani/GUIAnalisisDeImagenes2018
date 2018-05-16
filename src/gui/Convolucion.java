/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import filtrosespaciales.MascarasBordes;
import java.awt.Image;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author yohov
 */
public class Convolucion extends javax.swing.JInternalFrame {

	/**
	 * Creates new form Convolucion
	 */
	filtrosespaciales.Convolucion c;
	Image imagenResultante;
	private Image imagen;
	private JInternalFrame jInternalImagen;
	
	public Convolucion(Image imagen,JInternalFrame aux) {
		initComponents();
		this.jInternalImagen = aux;
		this.jLabel1.setIcon(new ImageIcon(imagen));
		this.imagen = imagen;
		
		setVisible(true);
	//	this.setResizable(true);
		this.setMaximizable(true);
		this.setClosable(true);
		this.setSize(580, 455);
		campos.add(tf1);
		campos.add(tf2);
		campos.add(tf3);
		campos.add(tf4);
		campos.add(tf5);
		campos.add(tf6);
		campos.add(tf7);
		campos.add(tf8);
		campos.add(tf9);
		campos.add(tf10);
		campos.add(tf11);
		campos.add(tf12);
		campos.add(tf13);
		campos.add(tf14);
		campos.add(tf15);
		campos.add(tf16);
		campos.add(tf17);
		campos.add(tf18);
		campos.add(tf19);
		campos.add(tf20);
		campos.add(tf21);
		campos.add(tf22);
		campos.add(tf23);
		campos.add(tf24);
		campos.add(tf25);
		actualizar();
		
		
	}

	public void actualizar(){
		
		Runnable r = new Runnable() {
			
			
			@Override
			public void run() {
				while(true){
					
					if(jComboBoxMascaras.getSelectedIndex() == 0){
						c = new filtrosespaciales.Convolucion(imagen);
						Image aux = c.aplicar(comprobarMatriz(), 1);
						imagenResultante = aux;
						jLabel1.setIcon(new ImageIcon(aux));
					}else{
						if(jComboBoxMascaras.getSelectedIndex() == 12){
							c = new filtrosespaciales.Convolucion(imagen);
							Image aux = c.aplicarKirsch(1);
							imagenResultante = aux;
							jLabel1.setIcon(new ImageIcon(aux));
						}else{
							c = new filtrosespaciales.Convolucion(imagen);
							Image aux = c.aplicar(MascarasBordes.mascaras[jComboBoxMascaras.getSelectedIndex()-1], 1);
							imagenResultante = aux;
							jLabel1.setIcon(new ImageIcon(aux));
						}
					}
				}

			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
	}
	
	public double[][] comprobarMatriz(){
		double mascara[][] = new double[5][5];

		for(int i=0,x=0;i<5;i++)
			for(int j=0;j<5;j++,x++)
				if(campos.get(x).getText().equals(""))
					mascara[i][j]=0;
				else
					mascara[i][j]=Double.parseDouble(campos.get(x).getText());

		if(mascara[0][0] == 0 && mascara[0][1] == 0 & mascara[0][2] == 0 && mascara[0][3] == 0 && mascara[0][4] == 0
			&& mascara[1][0] == 0 && mascara[1][4] == 0
			&& mascara[4][0] == 0 && mascara[4][1] == 0 & mascara[4][2] == 0 && mascara[4][3] == 0 && mascara[4][4] == 0){
			double newMascara[][]={{mascara[1][1],mascara[1][2],mascara[1][3]},{mascara[2][1],mascara[2][2],mascara[2][3]},
				{mascara[3][1],mascara[3][2],mascara[3][3]}};
			return newMascara;
		}
		
		return mascara;
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
        tf1 = new java.awt.TextField();
        tf2 = new java.awt.TextField();
        tf3 = new java.awt.TextField();
        tf4 = new java.awt.TextField();
        tf5 = new java.awt.TextField();
        tf6 = new java.awt.TextField();
        tf7 = new java.awt.TextField();
        tf8 = new java.awt.TextField();
        tf9 = new java.awt.TextField();
        tf10 = new java.awt.TextField();
        tf11 = new java.awt.TextField();
        tf12 = new java.awt.TextField();
        tf13 = new java.awt.TextField();
        tf14 = new java.awt.TextField();
        tf15 = new java.awt.TextField();
        tf16 = new java.awt.TextField();
        tf17 = new java.awt.TextField();
        tf18 = new java.awt.TextField();
        tf19 = new java.awt.TextField();
        tf20 = new java.awt.TextField();
        tf21 = new java.awt.TextField();
        tf22 = new java.awt.TextField();
        tf23 = new java.awt.TextField();
        tf24 = new java.awt.TextField();
        tf25 = new java.awt.TextField();
        jComboBoxMascaras = new javax.swing.JComboBox<>();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(580, 445));

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });

        tf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf6ActionPerformed(evt);
            }
        });

        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });

        tf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf8ActionPerformed(evt);
            }
        });

        tf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf9ActionPerformed(evt);
            }
        });

        tf10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf10ActionPerformed(evt);
            }
        });

        tf11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf11ActionPerformed(evt);
            }
        });

        tf12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf12ActionPerformed(evt);
            }
        });

        tf13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf13ActionPerformed(evt);
            }
        });

        tf14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf14ActionPerformed(evt);
            }
        });

        tf15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf15ActionPerformed(evt);
            }
        });

        tf16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf16ActionPerformed(evt);
            }
        });

        tf17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf17ActionPerformed(evt);
            }
        });

        tf18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf18ActionPerformed(evt);
            }
        });

        tf19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf19ActionPerformed(evt);
            }
        });

        tf20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf20ActionPerformed(evt);
            }
        });

        tf21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf21ActionPerformed(evt);
            }
        });

        tf22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf22ActionPerformed(evt);
            }
        });

        tf23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf23ActionPerformed(evt);
            }
        });

        tf24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf24ActionPerformed(evt);
            }
        });

        tf25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBoxMascaras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Mascara", "Diferencia Pixeles Gx", "Diferencia Pixeles Gy", "Diferencia Pixeles Separados Gx", "Diferencia Pixeles Separados Gy", "Prewitt Gx", "Prewitt Gy", "Sobel Gx", "Sobel Gy", "Roberts Gx", "Roberts Gy", "Laplace", "Kirch" }));

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setMaximumSize(new java.awt.Dimension(542, 236));
        jLabel1.setMinimumSize(new java.awt.Dimension(542, 236));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(542, 236));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxMascaras, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelar)
                                .addGap(35, 35, 35)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxMascaras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonAceptar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    private void tf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf8ActionPerformed

    private void tf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf9ActionPerformed

    private void tf10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf10ActionPerformed

    private void tf11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf11ActionPerformed

    private void tf12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf12ActionPerformed

    private void tf13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf13ActionPerformed

    private void tf14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf14ActionPerformed

    private void tf15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf15ActionPerformed

    private void tf16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf16ActionPerformed

    private void tf17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf17ActionPerformed

    private void tf18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf18ActionPerformed

    private void tf19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf19ActionPerformed

    private void tf20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf20ActionPerformed

    private void tf21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21ActionPerformed

    private void tf22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf22ActionPerformed

    private void tf23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf23ActionPerformed

    private void tf24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf24ActionPerformed

    private void tf25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf25ActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
		ImagenJInternalFrame frame = (ImagenJInternalFrame)this.jInternalImagen;
        frame.modificarImagen(imagenResultante);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
		JInternalFrame aux = this.jInternalImagen;
		ImagenJInternalFrame aux2 = (ImagenJInternalFrame) aux;
//		aux2.modificarImagen(FiltroEspacial.generaEscalaGrises(aux2.getImagenOriginal()));
		aux2.deshacer();
		aux2.modificarImagen(aux2.getImagenOriginal());
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxMascaras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField tf1;
    private java.awt.TextField tf10;
    private java.awt.TextField tf11;
    private java.awt.TextField tf12;
    private java.awt.TextField tf13;
    private java.awt.TextField tf14;
    private java.awt.TextField tf15;
    private java.awt.TextField tf16;
    private java.awt.TextField tf17;
    private java.awt.TextField tf18;
    private java.awt.TextField tf19;
    private java.awt.TextField tf2;
    private java.awt.TextField tf20;
    private java.awt.TextField tf21;
    private java.awt.TextField tf22;
    private java.awt.TextField tf23;
    private java.awt.TextField tf24;
    private java.awt.TextField tf25;
    private java.awt.TextField tf3;
    private java.awt.TextField tf4;
    private java.awt.TextField tf5;
    private java.awt.TextField tf6;
    private java.awt.TextField tf7;
    private java.awt.TextField tf8;
    private java.awt.TextField tf9;
    // End of variables declaration//GEN-END:variables
	ArrayList<TextField> campos = new ArrayList();
		
		
}
