/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int opEntrada1, opEntrada2,opEntrada3;
        double resultado;
        Scanner kb= new Scanner (System.in);
        System.out.println("Convertidor de Unidades métrico decimal a sistema inglés");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1.Conversión de volúmenes");
        System.out.println("2.Conversión de longitud");
        System.out.println("3.Conversión de tempertaturas");
        System.out.println("4.Conversión de masas");
        System.out.println("5.Salir");
        opEntrada1= kb.nextInt();
        switch (opEntrada1){
            case 1:
                System.out.println("Bienvenido al convertidor de volúmenes");
                System.out.println("Introduzca la conversión deseada");
                System.out.println("1.Galones a litros ");
                System.out.println("2.Litros a galones");
                System.out.println("3.Onza líquida a mililitros");
                System.out.println("4.Mililitros a onza fluída");
                opEntrada2=kb.nextInt();
                switch (opEntrada2){
                    case 1:
                        resultado=(pedirMedida()*3.785);
                        System.out.println(resultado+ "litros");
                        break;
                    case 2:
                        resultado=(pedirMedida()/(3.785));
                        System.out.println(resultado +"galones");
                        break;
                    case 3:
                        resultado = (29*pedirMedida());
                        System.out.println(resultado+"mililitros");
                        break;
                    case 4:
                        resultado = (pedirMedida()/(29));
                        System.out.println(resultado +"onza fluída");
                        break;
                }
                break;
            case 2:
                System.out.println("Bienvenido al convertidor de longitudes");
                System.out.println("Introduzca la conversión deseada");
                System.out.println("1.Millas a Kilómetros");
                System.out.println("2.Kilómetros a millas");
                System.out.println("3.Pulgadas a centímetros");
                System.out.println("4.Centímetros a pulgadas");
                System.out.println("5.Pies a centímetros");
                System.out.println("6.Centímetros a pies");
                System.out.println("7.Yardas a centímetros");
                System.out.println("8.Centímetros a yardas");
                opEntrada3=kb.nextInt();
                switch (opEntrada3){
                    case 1:
                        resultado=(pedirMedida()*1.6);
                        System.out.println(resultado +"km");
                        break;
                    case 2:
                        resultado=(pedirMedida()/(1.6));
                        System.out.println(resultado +"millas");
                        break;
                    case 3:
                        resultado=(pedirMedida()*2.54);
                        System.out.println(resultado +"cm");
                        break;
                    case 4: 
                        resultado=(pedirMedida()/(2.54));
                        System.out.println(resultado +"in");
                        break;
                    case 5:
                        resultado=(pedirMedida()*30.48);
                        System.out.println(resultado + "cm");
                        break;
                    case 6:
                        resultado=(pedirMedida()/(30.48));
                        System.out.println(resultado + "pies");
                        break;
                    case 7:
                        resultado=(pedirMedida()*91.4);
                        System.out.println(resultado + "cm");
                        break;
                    case 8:
                        resultado=(pedirMedida()/(91.4));
                        System.out.println(resultado + "yardas");
                        break;        
                }
                break;
            case 3:
                System.out.println("Bienvenido al convertidor de temperaturas");
                System.out.println("Introduzca la conversión deseada");
                System.out.println("1.Celsius a Fahrenheit");
                System.out.println("2.Fahrenheit a Celsius");
                System.out.println("3.Celsius a Kelvin");
                System.out.println("4.Kelvin a Celsius");
                System.out.println("5.Fahrenheit a Kelvin");
                System.out.println("6.Kelvin a Fahrenheit");
                break;
            case 4:
                System.out.println("Bienvenido al convertidor de masas");
                break;
            default:
                System.out.println("¡Vuelve pronto!");
        }
        
    }
    static double pedirMedida(){
        //Variables
        double medida;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduzca la medida a convertir");
        medida=kb.nextDouble();
        return medida;
    }
}
