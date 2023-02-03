/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertorgrados;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ConvertorGrados {
        
    static double Fahrenheit(double temperaturaCelsius){
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        return temperaturaFahrenheit;
    }
    
    static double Kelvin(double temperaturaCelsius){
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        return temperaturaKelvin;
    }


    public static void main(String[] args) {
        int seleccionar=1;
        Scanner sel = new Scanner(System.in);
        while(seleccionar==1) {
            System.out.println("Convetidor de Celsius a Fahrenheit y Kelvin");
            System.out.print("Inserte la cantidad en celsius a convertir: ");
            double temperaturaCelsius = sel.nextDouble();
            System.out.println("\n" + "Celsius = " + temperaturaCelsius);
            System.out.println("Fahrenheit = " + Fahrenheit(temperaturaCelsius));
            System.out.println("Kelvin = " + Kelvin(temperaturaCelsius) + "\n");

            System.out.println("Desea repetir el proceso? \n1)SI  2)NO");
            seleccionar = sel.nextInt();
        } 
        sel.close();
    }
    
}


