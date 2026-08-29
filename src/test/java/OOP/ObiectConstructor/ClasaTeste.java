package OOP.ObiectConstructor;

import org.testng.annotations.Test;

public class ClasaTeste {

    @Test

    public void metodaTest(){

  //  Masina masina1 = new Masina("BMW", "X5", 4, "coupe", 2.0);
//masina1.afisareSpecificatii();
    System.out.println(Masina.pret);
    System.out.println(Math.pow(30,20));

   Masina masina2 = new Masina("VW", "Touareg", 4 , "SUV", 3.0);
   masina2.afisareSpecificatii();

    Masina masina3 = new Masina();
    masina3.afisareSpecificatii();

    Masina masina4 = new Masina("volvo", "v40",4 , "hasback", 1.8 , false);
    masina4.afisareSpecificatii();




    }
}
