package cs.lab;
import org.jfree.ui.RefineryUtilities;

import java.util.logging.Logger;
import java.util.Map;
import java.util.HashMap;

public class Subject {

    static final Logger logger = Logger.getLogger(Subject.class.getName());    
    private Map<String, Double> datos = new HashMap<>();

    public void setDatos(Map<String, Double> datos) {
        this.datos = datos;
    }

    public Map<String, Double> getDatos() {
        return this.datos;  
    }


    public static void main(String[] args) {
        Map<String, Double> datosDePrueba = new HashMap<>();
        datosDePrueba.put("A",40D);
        datosDePrueba.put("B",25D);
        datosDePrueba.put("C",15D);
        datosDePrueba.put("D",20D);

        PieChartMonitor pie = new PieChartMonitor("PieChart", "PieChart", datosDePrueba);
        pie.pack();
        RefineryUtilities.centerFrameOnScreen( pie );
        pie.setVisible(true);

        BarChartMonitor bar = new BarChartMonitor("BarChat","BarChart", datosDePrueba);
        bar.pack( );
        RefineryUtilities.centerFrameOnScreen( bar );
        bar.setVisible( true );
    }
}

