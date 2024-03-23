/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balok;
import java.util.Scanner;
import java.util.Locale;
 
public class luasbalok {
    public static void main(String args[]){
       
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
       
    System.out.println("# Program Java Luas Permukaan & Volume Balok #");
    System.out.println("==============================================");
    System.out.println();
      
    double panjang, lebar, tinggi;
  
    System.out.print("Input panjang balok: ");
    panjang = input.nextDouble();
    System.out.print("Input lebar balok: ");
    lebar = input.nextDouble();
    System.out.print("Input tinggi balok: ");
    tinggi = input.nextDouble();
     
    System.out.println();
         
    System.out.println("Luas permukaan balok = "
                +Math.round((2*(panjang*lebar)+2*(panjang*tinggi)+
                2*(lebar*tinggi)) * 100)/100.0);
    System.out.println("Volume balok = "
                +Math.round(panjang * lebar * tinggi * 100)/100.0);
  
    input.close();
    }
}
