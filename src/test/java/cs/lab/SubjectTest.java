package cs.lab;

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


class SubjectTest {
    static final Logger logger = Logger.getLogger(Subject.class.getName());    

    // @Test
    // public void testCase0(){
    //     generic(0);
    // }

    // @Test
    // public void testCase1() {
    //     List<String> lines = readFile(1, "input");
    //     String output = readOutput(1);
        
    //     Float temperatura = Float.parseFloat(lines.get(0));  
    //     Float humedad = Float.parseFloat(lines.get(1));  
    //     Float viento = Float.parseFloat(lines.get(2)); 
        
    //     EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica(0F,0F,0F);
        
    //     estacionMeteorologica.setTemperatura(temperatura);
    //     estacionMeteorologica.setHumedad(humedad);
    //     estacionMeteorologica.setViento(viento);
        
    //     Float temperaturaResponse = estacionMeteorologica.getTemperatura();
    //     Float humedadResponse = estacionMeteorologica.getHumedad();
    //     Float vientoResponse = estacionMeteorologica.getViento();
        
    //     Assert.assertEquals(temperatura, temperaturaResponse);
    //     Assert.assertEquals(humedad, humedadResponse);
    //     Assert.assertEquals(viento, vientoResponse);
    // }

    // @Test(invocationCount = 50, threadPoolSize = 50)
    // public void testCase2() {
    //     generic(2);
    // }

    // @Test
    // public void testCase3() {
    //     List<String> lines = readFile(1, "input");
    //     String output = readOutput(1);
        
    //     Float temperatura = Float.parseFloat(lines.get(0));  
    //     Float humedad = Float.parseFloat(lines.get(1));  
    //     Float viento = Float.parseFloat(lines.get(2)); 

    //     Map<String, Float> datos = new HashMap<>();

    //     datos.put("temperatura", temperatura);
    //     datos.put("humedad", humedad);
    //     datos.put("viento", viento);

    //     EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica(0F,0F,0F);
        
    //     estacionMeteorologica.setDatos(datos);
        
    //     Float temperaturaResponse = estacionMeteorologica.getTemperatura();
    //     Float humedadResponse = estacionMeteorologica.getHumedad();
    //     Float vientoResponse = estacionMeteorologica.getViento();
        
    //     Assert.assertEquals(temperatura, temperaturaResponse);
    //     Assert.assertEquals(humedad, humedadResponse);
    //     Assert.assertEquals(viento, vientoResponse);
    // }

    // private void generic(int i) {
    //     List<String> lines = readFile(i, "input");
    //     String output = readOutput(i);
        
    //     Float temperatura = Float.parseFloat(lines.get(0));  
    //     Float humedad = Float.parseFloat(lines.get(1));  
    //     Float viento = Float.parseFloat(lines.get(2)); 
      
    //     EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica(temperatura,humedad,viento);
 
    //     Map response = estacionMeteorologica.getDatos();

    //     Float temperaturaResponse = (Float) response.get("temperatura");
    //     Float humedadResponse = (Float) response.get("humedad");
    //     Float vientoResponse = (Float) response.get("viento");

    //     Assert.assertEquals(temperatura, temperaturaResponse);
    //     Assert.assertEquals(humedad, humedadResponse);
    //     Assert.assertEquals(viento, vientoResponse);
    // }

    // private String readInput(int testNumber){
    //     List<String> lines = readFile(testNumber, "input");
    //     return lines.get(0);
    // }

    // private String readOutput(int testNumber){
    //     List<String> lines = readFile(testNumber, "output");
    //     return lines.get(0);
    // }

    // public List<String> readFile(int testNumber, String type){
    //     String fileName = "test_case<testNumber>_<type>";
    //     fileName = fileName.replace("<testNumber>", Integer.toString(testNumber));
    //     fileName = fileName.replace("<type>", type);
    //     InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
    //     Scanner scan = new Scanner(is);
    //     List<String> lines = new ArrayList<String>();
    //     while(scan.hasNextLine()) {
    //         String line = scan.nextLine();
    //         lines.add(line);
    //     }
    //     return lines;
    // }
    
};