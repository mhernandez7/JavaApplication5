
package javaapplication5bucles;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Numero {
    
        private  int numero ;
        private  int primo ;
      

    public Numero() {
      this.numero =0;
    }
    public void solicitudNumero(){
    
     
         Scanner read = new Scanner(System.in);
         System.out.println("ingrese un numero: ");
         this.numero = read.nextInt();
    }
    public int divisoresNumero(){
 
    
    for (int i = 1; i<= this.numero ; i++)    
    {
        if(this.numero % i ==0){
        
            this.primo = i+this.primo; 
        }
    }
          return this.primo;
    }
    
    public String numeroPrimo(){
     String mensaje ="";
    this.primo = this.primo -1;
    if (this.numero == this.primo)
    {
    mensaje ="El numero "+this.numero+ " es primo ";
    }
    else
    {
    mensaje ="El numero "+this.numero+ " No es primo";
    }
    return mensaje;
    }
   
    }

