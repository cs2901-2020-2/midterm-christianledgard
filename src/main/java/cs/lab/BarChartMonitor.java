package cs.lab;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import java.util.Map;


public class BarChartMonitor extends JFrame {

    public BarChartMonitor( String applicationTitle , String chartTitle,Map datosDePrueba) {
        super( applicationTitle );
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Category",
                "Score",
                createDataset(datosDePrueba),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }

    private CategoryDataset createDataset(Map datosDePrueba) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        datosDePrueba.forEach((k,v) -> dataset.addValue((Double) v,k.toString(), k.toString()));

        return dataset;
    }

}