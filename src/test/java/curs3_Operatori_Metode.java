import org.testng.annotations.Test;

public class curs3_Operatori_Metode {


    @Test
    public void metodaTest(){
        adunareDouaNumere( 2 ,5);//ctrclick te duce la metoda
        notaLaExamen("Macra", "Andreea", 8.50);
    }
    public void adunareDouaNumere(int x , int y ) {

       int suma = x + y;
       System.out.println("rezultatul adunarii este = " + suma );
       System.out.println("rezultatul adunarii este = " + ( x + y));
   }
        public void notaLaExamen (String nume, String prenume,double nota)
        {
            System.out.println(nume + prenume + "are nota la examen" + nota);
        }
    }