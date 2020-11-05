package cs.lab;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import java.util.Map;


public class PieChartMonitor extends JFrame {

    private static final long serialVersionUID = 1L;

    public PieChartMonitor(String applicationTitle, String chartTitle, Map<String, Double> datosDePrueba) {
        super(applicationTitle);
        PieDataset dataset = createDataset(datosDePrueba);
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }


    private  PieDataset createDataset(Map<String, Double> datosDePrueba) {
        DefaultPieDataset result = new DefaultPieDataset();
        datosDePrueba.forEach(result::setValue);
        return result;
    }

    private JFreeChart createChart(PieDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createPieChart3D(
            title,                  // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;

    }
}