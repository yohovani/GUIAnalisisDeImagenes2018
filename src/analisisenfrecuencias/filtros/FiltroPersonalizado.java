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
import java.util.ArrayList;
import lectura.ImageManager;

/**
 *
 * @author yohov
 */
public class FiltroPersonalizado extends FiltroFrecuencia{

	private ArrayList<Integer> x,y;
	private Dimension dim;

	public FiltroPersonalizado(Dimension dim) {
		super((int)dim.getWidth(),(int) dim.getHeight());
		this.dim = dim;
		x = new ArrayList();
		y = new ArrayList();
	}

	@Override
	public Image crearFiltro() {
		// incializar el buffer
		BufferedImage bi = new BufferedImage((int)dim.getWidth(),(int)dim.getHeight(), BufferedImage.TYPE_INT_ARGB);
		int tamanoImagen = bi.getWidth();
		
		
		for(int i=0; i < bi.getWidth();i++){
			for(int j=0; j < bi.getHeight();j++){
				bi.setRGB(i, j, Color.WHITE.getRGB());
			}
		}   
		
		for(int i=0;i<x.size();i++){
			getFiltroEspacial()[x.get(i)][y.get(i)] = new NumeroComplejo(1, 1);
			bi.setRGB(x.get(i), y.get(i), Color.BLACK.getRGB());
		}

		return ImageManager.toImage(bi);
	}
	public Image modificarFiltro(int radio, int n){

		return crearFiltro();
	}

	public ArrayList<Integer> getX() {
		return x;
	}

	public ArrayList<Integer> getY() {
		return y;
	}

	public void setX(ArrayList<Integer> x) {
		this.x = x;
	}

	public void setY(ArrayList<Integer> y) {
		this.y = y;
	}
	
	
	
}
