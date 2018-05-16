/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisenfrecuencias.filtros;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import lectura.ImageManager;

/**
 *
 * @author yohov
 */
public class FiltroGaussiano extends FiltroFrecuencia{
	private int k0;
	private double s;
	private Dimension dim;


	public FiltroGaussiano(int k0, double k1, Dimension dim) {
		super((int)dim.getWidth(),(int) dim.getHeight());
		this.k0 = k0;
		this.s = k1;
		this.dim = dim;
	}

	@Override
	public Image crearFiltro() {
		// incializar el buffer
		BufferedImage bi = new BufferedImage((int)dim.getWidth(),(int)dim.getHeight(), BufferedImage.TYPE_INT_ARGB);
		int tamanoImagen = bi.getWidth();
		for(int i=0; i < bi.getWidth();i++){
			for(int j=0; j < bi.getHeight();j++){
				int u = -1*(tamanoImagen/2)+i;
				int v = (tamanoImagen/2)-j;
				double r  = Math.sqrt(Math.pow(u,2)+Math.pow(v, 2));
				double valor = Math.pow(Math.E, -((Math.pow(i, 2)+Math.pow(j, 2))/(2*Math.pow(s, 2))));
				 // verificamos con respecto al  radio
				int gris = (int)(255*valor);
				if(r <= k0){
					// asignamos el valor al filtro
					getFiltroEspacial()[i][j] = new NumeroComplejo(valor, valor);
					// asignamos el valor a la imagen
					bi.setRGB(i, j, new Color(gris,gris,gris).getRGB());
				}else{
					// asignamos el valor al filtro
					getFiltroEspacial()[i][j] = new NumeroComplejo(valor, valor);
					// asignamos el valor a la imagen
					bi.setRGB(i, j, new Color(255,255,255).getRGB());
				} 
			}
		}
		return ImageManager.toImage(bi);
	}

	public Image modificarFiltro(int k0,double s){
		this.k0 = k0;
		this.s = s;
		return crearFiltro();
	}
}