import org.testng.annotations.Test;

public class STRUCTURI_ALTERNATIVE {
    @Test
    public void metodaTest() {
        //verificareNumar();
        //verificareLitera("A");
        // verificareNumarulCinci(5);
        //verificareZiSaptamana(8);
        verificareNumarParPozitivSauNumarParNegativ(-8);
    }

   public void verificareNumar(int nr) {

       if (8 > 5) {
            System.out.println("Numarul 8 este mai mare decat 5");
       } else {
          System.out.println("Numarul 4 nu este mai mare decat 5");

        }
    }

    public void verificareLitera(String litera) {
        String word = ("Automation");
        if (word.contains(litera)) {
            System.out.println(litera + "este in cuvantul Automation");
        } else {
            System.out.println(litera + "nu este in cuvantul Automation");
        }
    }

    public void verificareNumarulCinci(int nr) {
        if (nr > 5) {
            System.out.println(nr + " este mai mare decat 5");
        } else if (nr < 5) {
            System.out.println(nr + " este mai mic decat 5");
        } else {
            System.out.println(nr + " este egal cu 5");
        }
    }


    public void verificareZiSaptamana(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Miercuri nu este o zi a saptamanii");
        }

    }
       public void verificareNumarParPozitivSauNumarParNegativ(int nr) {
           if(nr % 2 == 0 && nr >0){
               System.out.println( nr + " Numarul este par si este pozitiv");
           }
           else if (nr % 2 == 0 && nr < 0){
               System.out.println( nr + " Numarul este par si negativ.");
           }
           else{
               System.out.println( nr + " Numarul nu este par");
           }
       }
}