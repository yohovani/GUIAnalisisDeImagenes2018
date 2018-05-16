/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import analisisenfrecuencias.filtros.FiltroPersonalizado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author yohov
 */
public class JInternalFrameFiltroPersonalizado extends javax.swing.JInternalFrame {

	/**
	 * Creates new form JInternalFrameFiltroPersonalizado
	 */
	public JInternalFrameFiltroPersonalizado(Image x) {
		fp = new FiltroPersonalizado(new Dimension(470,470));
		this.sizePincel = 1;
		this.FiltroImg = x;
		initComponents();
		this.jLabelTam.setText("Tamaño actual: "+this.sizePincel+" px");
		this.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Filtro = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        X = new javax.swing.JTextField();
        Y = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTam = new javax.swing.JLabel();
        jSliderSizeP = new javax.swing.JSlider();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        Filtro.setBackground(new java.awt.Color(255, 255, 255));
        Filtro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Filtro.setForeground(new java.awt.Color(255, 255, 255));
        Filtro.setMaximumSize(new java.awt.Dimension(470, 470));
        Filtro.setMinimumSize(new java.awt.Dimension(470, 470));
        Filtro.setPreferredSize(new java.awt.Dimension(470, 470));
        Filtro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FiltroMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FiltroMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout FiltroLayout = new javax.swing.GroupLayout(Filtro);
        Filtro.setLayout(FiltroLayout);
        FiltroLayout.setHorizontalGroup(
            FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        FiltroLayout.setVerticalGroup(
            FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones del Filtro"));
        jPanel2.setMaximumSize(new java.awt.Dimension(283, 480));
        jPanel2.setMinimumSize(new java.awt.Dimension(283, 480));

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Puntos Manualmente"));

        jLabel2.setText("X:");

        jLabel3.setText("Y:");

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración de la linea"));

        jLabel1.setText("Tamaño de la linea");

        jLabelTam.setText("Tamaño actual:");

        jSliderSizeP.setMaximum(30);
        jSliderSizeP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderSizePStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelTam))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSliderSizeP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSliderSizeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTam)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
		int size = 470;
		int x1 = evt.getX();
		int y1 = evt.getY();
		fp.getX().add(x1);
		fp.getY().add(y1);
		int x2 = size-x1;
		int y2 = size-y1;
		fp.getX().add(x2);
		fp.getY().add(y2);
//		if(this.sizePincel > 1){
//			int aux = this.sizePincel/2;
//			for(int i=0;i<this.sizePincel/2;i++){
//				if(x1-aux > 0 && x1+aux < size && y1-aux > 0 && y1+aux < size){
//					fp.getX().add(x1-i);
//					fp.getX().add(x1+i);
//					fp.getY().add(y1-i);
//					fp.getY().add(y1+i);
//				}
//					
//			}
//		}
		dibujar();
		
    }//GEN-LAST:event_formMouseDragged

	public void dibujar(){
		for(int i=0;i<fp.getX().size();i++){
			this.Filtro.getGraphics().fillOval(fp.getX().get(i), fp.getY().get(i), this.sizePincel, this.sizePincel);
		}
		this.FiltroImg = fp.crearFiltro();
	}
	
    private void FiltroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltroMouseMoved
        // TODO add your handling code here:
		dibujar();
    }//GEN-LAST:event_FiltroMouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
		if(!X.getText().equals("") && !Y.getText().equals("")){
			if(X.getText().matches("[0-9]+") && Y.getText().matches("[0-9]+")){
				int size = 470;
				int x1 = Integer.parseInt(X.getText());
				int y1 = Integer.parseInt(Y.getText());
				if(x1 > size){
					x1 = size;
					JOptionPane.showMessageDialog(null,"Exediste el tamaño del filtro en X se tomara el maximo como punto a colorear"); 
				}
				if(y1 > size){
					y1 = size;
					JOptionPane.showMessageDialog(null,"Exediste el tamaño del filtro en Y se tomara el maximo como punto a colorear"); 
				}
				fp.getX().add(x1);
				fp.getY().add(y1);
				int x2 = size-x1;
				int y2 = size-y1;
				fp.getX().add(x2);
				fp.getY().add(y2);
				dibujar();
			}else{
				JOptionPane.showMessageDialog(null,"Solo se permite ingresar numeros"); 
			}
		}else{
			JOptionPane.showMessageDialog(null,"Ingresa algún caracter"); 
		}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
		this.fp.setX(new ArrayList());
		this.fp.setY(new ArrayList());
		this.Filtro.repaint();
		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSliderSizePStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderSizePStateChanged
        // TODO add your handling code here:
		this.sizePincel = jSliderSizeP.getValue();
		this.jLabelTam.setText("Tamaño actual: "+this.sizePincel+" px");
    }//GEN-LAST:event_jSliderSizePStateChanged

    private void FiltroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltroMouseDragged
        // TODO add your handling code here:
		int size = 470;
		int x1 = evt.getX();
		int y1 = evt.getY();
		fp.getX().add(x1);
		fp.getY().add(y1);
		int x2 = size-x1;
		int y2 = size-y1;
		fp.getX().add(x2);
		fp.getY().add(y2);
		dibujar();
    }//GEN-LAST:event_FiltroMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Filtro;
    private javax.swing.JTextField X;
    private javax.swing.JTextField Y;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jSliderSizeP;
    // End of variables declaration//GEN-END:variables
	private FiltroPersonalizado fp;
	private int sizePincel;
	private Image FiltroImg;

	public Image getFiltroImg() {
		return FiltroImg;
	}
	
}
