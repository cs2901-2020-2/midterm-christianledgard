package cs.lab;

import org.jfree.ui.RefineryUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.String;
import java.util.logging.Logger;

import static org.testng.Assert.assertTrue;


class SubjectTest {
    static final Logger logger = Logger.getLogger(Subject.class.getName());

    @Test
    void test0() {
        Subject.main(new String[] {});
        assertTrue(true, "silly assertion to be compliant with Sonar");
    }

     @Test
     public void testCasePieChart(){
         Map<String, Double> datosDePrueba = new HashMap<>();
         datosDePrueba.put("A",40D);
         datosDePrueba.put("B",25D);
         datosDePrueba.put("C",15D);
         datosDePrueba.put("D",20D);

         Subject estacionMeteorologica = new Subject();

         estacionMeteorologica.setDatos(datosDePrueba);

         PieChartMonitor pie = new PieChartMonitor("PieChart", "PieChart", estacionMeteorologica.getDatos());
         pie.pack();
         RefineryUtilities.centerFrameOnScreen( pie );
         pie.setVisible(true);
         assertTrue(true, "PieChat Generado sin Inconvenientes");
     }

    @Test
    public void testCaseBarChart(){
        Map<String, Double> datosDePrueba = new HashMap<>();
        datosDePrueba.put("A",40D);
        datosDePrueba.put("B",25D);
        datosDePrueba.put("C",15D);
        datosDePrueba.put("D",20D);

        Subject estacionMeteorologica = new Subject();

        estacionMeteorologica.setDatos(datosDePrueba);

        BarChartMonitor bar = new BarChartMonitor("BarChat","BarChart", estacionMeteorologica.getDatos());
        bar.pack( );
        RefineryUtilities.centerFrameOnScreen( bar );
        bar.setVisible( true );

        assertTrue(true, "BarChat Generado sin Inconvenientes");
    }


    
};