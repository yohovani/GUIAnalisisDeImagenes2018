/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtrosespaciales;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import lectura.ImageManager;

/**
 *
 * @author Roberto Cruz Leija
 */
public class DispersionHistograma {
    public static Image ecualizarHistograma(double[][]histograma, Image imagenOriginal){
      // calculamos nxm
      int nxm = imagenOriginal.getHeight(null)*imagenOriginal.getWidth(null);
      // declaramos el nuevo histograma
      int[][] ecualizacion= new int[3][256];
	   BufferedImage nueva = new BufferedImage(imagenOriginal.getWidth(null)
									, imagenOriginal.getHeight(null),BufferedImage.TYPE_INT_RGB);
     for(int j=0;j<3;j++){
		 double tmp = 0;
		for(int g=0; g<256;g++){
			
		  for(int i=0; i <=g;i++)
			  tmp+=histograma[j][i];

		  tmp/=nxm;
		  ecualizacion[j][g]= (int)Math.round(tmp*255);
		}
		// modificamos la imagen 
		  BufferedImage bio = ImageManager.toBufferedImage(imagenOriginal);
		 
		  for(int y=0; y<imagenOriginal.getHeight(null);y++)
			  for(int x=0; x<imagenOriginal.getWidth(null);x++){
			   // modificar el tono de la imagen en base al nuevo 
			   // histograma
			   Color color = new Color(bio.getRGB(x, y));
			   
			   int r = ecualizacion[j][color.getRed()];
			   int g = ecualizacion[j][color.getGreen()];
			   int b = ecualizacion[j][color.getBlue()];
			   color = new Color(r,g,b);
			   nueva.setRGB(x, y, color.getRGB());
			  }
	 }
        return ImageManager.toImage(nueva);
    }
}
