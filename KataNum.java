/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katanum;

import java.util.Scanner;

/**
 *
 * @author kianaA
 */
public class KataNum {
    
    //Metodo de las unidades 
public static String unidadesBasicas(int Basicas){		
 switch(Basicas){
	case 1:
		return "uno";
	case 2:
		return "dos";
	case 3:
		return "tres";
	case 4:
		return "cuatro";
	case 5:
		return "cinco";
	case 6:
		return "seis";
	case 7:
		return "siete";
	case 8:
		return "ocho";
	case 9:
		return "nueve";
	
	default:
		return "";
 }
}
//Numeros Especiales 
public static String especial1(int Once){
  switch (Once){
	case 11:
		return "once";
	case 12:
		return "doce";
	case 13:
		return "trece";
	case 14:
		return "catorce";
	case 15:
		return "quince";
	case 16:
		return "dieciseis";
	case 17:
		return "diecisiete";
	case 18:
		return "dieciocho";
	case 19:
		return "diecinueve";		
	default:
		return "";
  }
}
//Numeros Especiales 2
public static String especial2(int Veinte){
  switch (Veinte){
	case 21:
		return "veintiuno";
	case 22:
		return "veintidos";
	case 23:
		return "veintitres";
	case 24:
		return "veinticuatro";
	case 25:
		return "veinticinco";
	case 26:
		return "veintiseis";
	case 27:
		return "veintisiente";
	case 28:
		return "veintiocho";
	case 29:
		return "veitinueve";		
	default:
		return "";
  }
}
// Casos de las decenas 
public static String decenas(int Diez){
  switch (Diez){
	case 1:
		return "diez";
	case 2:
		return "veinte";
	case 3:
		return "treinta";
	case 4:
		return "cuarenta";
	case 5:
		return "cincuenta";
	case 6:
		return "sesenta";
	case 7:
		return "setenta";
	case 8:
		return "ochenta";
	case 9:
		return "noventa";		
	default:
		return "";
  }
}
//Casos de las centenas
public static String centenas(int cien){
  switch (cien){
	case 1:
		return "ciento";
        case 2:
		return "doscientos";  
        case 3:
		return "trescientos";
        case 4:
		return "cuantrocientos";
	case 5:
		return "quinientos";
        case 6:
		return "seiscientos";
        case 7:
		return "setesientos";
        case 8:
		return "ochoscientos";
	case 9:
		return "novecientos";
        case 10:
		return "cien";	
        
	default:
		return "";
  }
}
public static String miles(int iMiles){
  switch (iMiles){
	case 1:
		return "mil";
        case 2:
		return "dos mil";  
        case 3:
		return "tres mil";
        case 4:
		return "cuantro mil";
	case 5:
		return "cinco mil";
        case 6:
		return "seis mil";
        case 7:
		return "sete mil";
        case 8:
		return "ocho mil";
	case 9:
		return "nueve mil";	
        case 10: 
               return "diez mil";
	default:
		return "";
  }
}
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un numero del 1 al 10000 = "); 
        int numero = scanner.nextInt();     
        String sTexto;
        
//Realiza las unidades 
int U = numero % 10;
numero = numero  / 10;		
sTexto = unidadesBasicas(U);

 //Realiza las Decenas              
    int iD = numero % 10;
       numero = numero/10; 
    if ((U==0) && (iD>0))
            sTexto = unidadesBasicas (iD);
    else if (iD==1)
            sTexto = especial1(10+U);
    else if (iD==2 )
            sTexto = especial2(20+U);
    else if (iD > 1)
           sTexto = decenas(iD) + " y " + sTexto;
    
//Realiza las centenas 
       int Cen = numero % 10;
       sTexto = centenas(Cen)+ " " + sTexto ;
       
//Realiza las milesimas
   int mil= numero / 10;
       sTexto = miles(mil)+ " " + sTexto ;
       
//Realizar Diez Milesimas 
        /*int cien = numero % 10;
          numero = numero / 10;
       sTexto = */
       
      System.out.println("En letra es = " + sTexto);
      
    }
}