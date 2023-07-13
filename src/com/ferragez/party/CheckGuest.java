package com.ferragez.party;


import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String[] arrayname=  new String[11];

        //inserisco valori per ogniuno i sarebbe indice cioe 0,1,2,3 posizione//
      arrayname[0] = "dua lipa";
       arrayname[1] = "Paris Hilton";
        arrayname[2] = "Manuel Agnelli";
       arrayname[3] = "JA-AX";
       arrayname[4] = "Francesco Totti";
       arrayname[5] = "Illary Blasi";
       arrayname[6] = "bbe bio";
       arrayname[7] = "luis";
       arrayname[8] = "Pardes Zarei";
        arrayname[9] = "Martina Maccherei";
       arrayname[10] = "Rachel Zellic";


        System.out.println("inserisci il tuo nome ");
        String Username = Scanner.nextLine();
   boolean list= false;
         //recorrido de vector, per vedere  se il nome corrisponde  a quello che inserisce l'utente  facciamo 1 ciclo
        for (int i = 0; i <= arrayname.length; i++){

            if(Username.equalsIgnoreCase(arrayname[i])){
    list=true;
break;
  }
}
       if(list){
            System.out.println(" brava puoi entrare " + Username);
        }else  {
            System.out.println("non puoi entrare" + Username);
        }
    }
}
