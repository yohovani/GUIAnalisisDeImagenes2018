/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author yohov
 */
public class Grafica2 {
	JFreeChart grafica;
	XYSeriesCollection datos=new XYSeriesCollection();
	String titulo;
	String etiquetax;
	String etiquetay;
	
	public Grafica2(String t,String x,String y){
		titulo = t;
		etiquetax=x;
		etiquetay=y;
		grafica=ChartFactory.createXYLineChart(titulo, x, y, datos, PlotOrientation.VERTICAL, true, true, true);
	}
	public Grafica2(){
		this("Histograma","x","y");
	}
	
	public void agregarGrafica(String id,double[] x){
		XYSeries r= new XYSeries(id);

		for(int i=0;i<256;i++){
			r.add(i,x[i]);
		}
		
		this.datos.addSeries(r);

	}
	
	public void crearGrafica(double[][] x){
		datos.removeAllSeries();
		agregarGrafica("R",x[0]);
		agregarGrafica("G",x[1]);
		agregarGrafica("B",x[2]);
	}
	
	public JPanel obtieneGrafica(){
		return new ChartPanel(grafica);
	}
	
	public void setTitulo(String t){
		titulo = "Grafica de la Funcion: " + t;	
		grafica.setTitle(titulo);
	}
	
}
