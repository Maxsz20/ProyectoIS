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
        Ciudad ciudad2 = new Ciudad("Merida", 4, "Ciudad capital de la República Bolivariana de Venezuela, centro de la administración pública central, núcleo " +
                "financiero, comercial y cultural más importante de la nación. Se encuentra ubicada en la zona centro-norte del país, a unos 15 Km.");
        for(int i=3; i< 6; i++){
            ciudad2.agregarHotel(hoteles[i]);
        }
        Ciudad ciudad3 = new Ciudad("Bogota", 2, "Ciudad capital de la República Bolivariana de Venezuela, centro de la administración pública central, núcleo " +
                "financiero, comercial y cultural más importante de la nación. Se encuentra ubicada en la zona centro-norte del país, a unos 15 Km.");
        for(int i=6; i< 9; i++){
            ciudad3.agregarHotel(hoteles[i]);
        }
        Ciudad ciudad4 = new Ciudad("Nueva York", 4, "Ciudad capital de la República Bolivariana de Venezuela, centro de la administración pública central, núcleo " +
                "financiero, comercial y cultural más importante de la nación. Se encuentra ubicada en la zona centro-norte del país, a unos 15 Km.");
        for(int i=9; i< 12; i++){
            ciudad4.agregarHotel(hoteles[i]);
        }
        Ciudad ciudad5 = new Ciudad("Tokyo", 5, "Ciudad capital de la República Bolivariana de Venezuela, centro de la administración pública central, núcleo " +
                "financiero, comercial y cultural más importante de la nación. Se encuentra ubicada en la zona centro-norte del país, a unos 15 Km.");
        for(int i=12; i< 15; i++){
            ciudad5.agregarHotel(hoteles[i]);
        }
        
        l.recibirCiudades(ciudad1, ciudad2, ciudad3, ciudad4, ciudad5);
    }
}
