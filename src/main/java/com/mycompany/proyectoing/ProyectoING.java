/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoing;

import ClasesObjetos.Ciudad;
import ClasesObjetos.Hotel;
import Vistas.LandingPage;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author Maxi
 */
public class ProyectoING {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        LandingPage l = new LandingPage();
        l.setVisible(true);
        crearCiudades(l, crearHoteles());
       
    }
    
    public static Hotel[] crearHoteles(){
        
        Hotel[] hoteles = new Hotel[15]; 
        hoteles[0] = new Hotel("Hotel Caracas Suites", 3, "30");
        hoteles[0].inicializarHabitaciones();
                
        hoteles[1] = new Hotel("Hotel EuroBuilding", 5, "100");
        hoteles[1].inicializarHabitaciones();
        
        hoteles[2] = new Hotel("Hotel Altamira Suites", 4, "60");
        hoteles[2].inicializarHabitaciones();
        
        hoteles[3] = new Hotel("Hotel Merida Village", 2, "20");
        hoteles[3].inicializarHabitaciones();
        
        hoteles[4] = new Hotel("Hotel Los Andes", 4, "58");
        hoteles[4].inicializarHabitaciones();
        
        hoteles[5] = new Hotel("Hotel Los Churros", 3, "35");
        hoteles[5].inicializarHabitaciones();
        
        hoteles[6] = new Hotel("Hotel Santa Fe Boutique", 4, "90");
        hoteles[6].inicializarHabitaciones();
        
        hoteles[7] = new Hotel("Hotel Habitel Select", 4, "35");
        hoteles[7].inicializarHabitaciones();
        
        hoteles[8] = new Hotel("Hotel Bogota Museo", 3, "55");
        hoteles[8].inicializarHabitaciones();
        
        hoteles[9] = new Hotel("Hotel Hilton", 5, "230");
        hoteles[9].inicializarHabitaciones();
        
        hoteles[10] = new Hotel("Hotel Pod 51", 3, "25");
        hoteles[10].inicializarHabitaciones();
        
        hoteles[11] = new Hotel("Hotel Edison Times Square", 4, "70");
        hoteles[11].inicializarHabitaciones();
        
        hoteles[12] = new Hotel("Hotel Rei", 3, "30");
        hoteles[12].inicializarHabitaciones();
        
        hoteles[13] = new Hotel("Hotel Shibuya Granbell", 4, "60");
        hoteles[13].inicializarHabitaciones();
        
        hoteles[14] = new Hotel("Hotel Keihan Asakusa", 5, "120");
        hoteles[14].inicializarHabitaciones();
        
        return hoteles;
    }
    
    public static void crearCiudades(LandingPage l, Hotel[] hoteles){
        Ciudad ciudad1 = new Ciudad("Caracas", 3, "Ciudad capital de la República Bolivariana de Venezuela, centro de la administración pública central, núcleo " +
                "financiero, comercial y cultural más importante de la nación. Se encuentra ubicada en la zona centro-norte del país, a unos 15 Km.");
        for(int i=0; i< 3; i++){
            ciudad1.agregarHotel(hoteles[i]);
        }
        Ciudad ciudad2 = new Ciudad("Merida", 4, "Es una de las principales localidades de los Andes venezolanos. Se encuentra ubicada sobre una meseta en medio de la región, entre las sierras montañosas de La Culata y Nevada, los parques "
                + "nacionales homónimos, dicha condición geográfica la posiciona como un importante centro turístico."
                + "La localidad de Mérida se encuentra situada a una altitud de 1.820 m s. n. m., asentándose sobre una meseta enclavada en el valle medio del río Chama, delimitada por el mismo y que extiende a lo largo de su cuenca");
        for(int i=3; i< 6; i++){
            ciudad2.agregarHotel(hoteles[i]);
        }
        Ciudad ciudad3 = new Ciudad("Bogota", 2, "Es la capital y ciudad más poblada de Colombia. Tienen más de siete millones de habitantes, lo que la "
                + "convierte en una de las grandes urbes del continente sudamericano."
                + " cuenta con diversas actividades y acervos culturales, es sede de importantes universidades, y acoge eventos de nivel internacional.");
        for(int i=6; i< 9; i++){
            ciudad3.agregarHotel(hoteles[i]);
        }
        Ciudad ciudad4 = new Ciudad("Nueva York", 4, "Es la ciudad más poblada en los Estados Unidos de América, y la segunda aglomeración urbana "
                + "del continente. Es el centro del área metropolitana de Nueva York, la cual está entre las cinco aglomeraciones urbanas más grandes del mundo"
                + "influencia a escala global en los medios de comunicación, la política, la educación, la arquitectura, el entretenimiento, las artes y la moda..");
        for(int i=9; i< 12; i++){
            ciudad4.agregarHotel(hoteles[i]);
        }
        Ciudad ciudad5 = new Ciudad("Tokyo", 5, "Capital del Japón, con sus 14 millones de habitantes se confirma la metrópoli más populosa del país y una de las mayores ciudades del mundo. Su historia se remonta a 1603 cuando Ieyasu Tokugawa estableció el gobierno feudal (el shogunato) y desde entonces goza de un próspero desarrollo. Tokio se identifica como el centro político, económico y cultural de Japón y, en base a la subdivisión administrativa "
                + "del territorio, se divide en 23 distritos que incluyen 26 ciudades, 5 ciudadelas y 8 aldeas.");
        for(int i=12; i< 15; i++){
            ciudad5.agregarHotel(hoteles[i]);
        }
        
        l.recibirCiudades(ciudad1, ciudad2, ciudad3, ciudad4, ciudad5);
    }
}
