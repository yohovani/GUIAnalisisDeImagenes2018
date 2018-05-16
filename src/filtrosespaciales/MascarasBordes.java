/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtrosespaciales;

import java.awt.Image;
import java.awt.image.BufferedImage;
import lectura.ImageManager;

/**
 *
 * @author Roberto Cruz Leija
 */
public class MascarasBordes {
    // kirch
    private static double[][] kirsch1 = {{-3, -3, 5}, {-3, 0, 5}, {-3, -3, 5}};
    private static double[][] kirsch2 = {{-3, 5, 5}, {-3, 0, 5}, {-3, -3, -3}};
    private static double[][] kirsch3 = {{5, 5, 5}, {-3, 0, -3}, {-3, -3, -3}};
    private static double[][] kirsch4 = {{5, 5, -3}, {5, 0, -3}, {-3, -3, -3}};
    private static double[][] kirsch5 = {{5, -3, -3}, {5, 0, -3}, {5, -3, -3}};
    private static double[][] kirsch6 = {{-3, -3, -3}, {5, 0, -3}, {5, 5, -3}};
    private static double[][] kirsch7 = {{-3, -3, -3}, {-3, 0, -3}, {5, 5, 5}};
    private static double[][] kirsch8 = {{-3, -3, -3}, {-3, 0, 5}, {-3, 5, 5}};
    public static double[][][] arregloMascaras = {kirsch1, kirsch2, kirsch3,
        kirsch4, kirsch5, kirsch6,
        kirsch7, kirsch8};
   
	private static double[][] diferenciaPixelesGx = 
{{0.0, 0.0, 0.0}, 
{0.0, 1.0, -1.0},
{0.0, 0.0, 0.0}};
private static double[][] diferenciaPixelesGy =
{{0.0, -1.0, 0.0}, 
{0.0, 1.0, 0.0},
{0.0, 0.0, 0.0}};
// mascara de diferencia de pixeless separados
private static double[][] diferenciaPixelesSeparadosGx =
{{0.0, 0.0, 0.0},
{1.0, 0.0, -1.0},
{0.0, 0.0, 0.0}};
private static double[][] diferenciaPixelesSeparadosGy = {{0.0, -1.0, 0.0},
{0.0, 0.0, 0.0}, 
{0.0, 1.0, 0.0}};
// mascara de operador prewitt
private static double[][] prewittGx = 
{{1.0, 0.0, -1.0}, 
{1.0, 0.0, -1.0}, 
{1.0, 0.0, -1.0}};
private static double[][] prewittGy = 
{{-1.0, -1.0, -1.0}, 
{0.0, 0.0, 0.0}, 
{1.0, 1.0, 1.0}};
// mascara de operador Sobel
private static double[][] SobelGx =
{{1.0, 0.0, -1.0}, {2.0, 0.0, -2.0}, {1.0, 0.0, -1.0}};
private static double[][] SobelGy = 
{{-1.0, -2.0, -1.0}, {0.0, 0.0, 0.0}, {1.0, 2.0, 1.0}};
// mascara dde operador Roberts
private static double[][] robertsGx = 
{{0.0, 0.0, -1.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 0.0}};
private static double[][] robertsGy = 
{{-1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 0.0}};
// creamos mascara de Laplace
private static double[][] laplace = {{0.0, 1.0, 0.0}, {1.0, -4.0, 1.0}, {0.0, 1.0, 0.0}};
public static double[][][] mascaras={diferenciaPixelesGx,diferenciaPixelesGy,diferenciaPixelesSeparadosGx,diferenciaPixelesSeparadosGy,prewittGx,prewittGy
,SobelGx,SobelGy,robertsGx,robertsGy,laplace};
    

}
