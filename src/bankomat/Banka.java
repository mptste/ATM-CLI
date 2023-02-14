/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankomat;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Banka {
    
      public static void main(String[] args) {

          
      Scanner sca = new Scanner(System.in);
        
      int pinKod = 2253, pin = 2253, count = 0;
      
      while (count < 3) {            
            count++;
            System.out.println("Pokusaj broj: " + count + " \nUnesite PIN kod: ");
            pinKod = sca.nextInt();
            
            if (pinKod == pin) {
                System.out.println("Dobrodosli, validacija PIN kod-a uspesna");
                Racun Milan = new Racun("Milan", "CT2588741");
                Milan.prikazatiMeni();
                break;
              }
            else{
                System.out.println("Netacan PIN kod");
            }
        }
        if (count == 3) {
            System.out.println("Vas nalog je zakljucan nakon 3 neuspela pokusaja");
            
        }
      
    }

