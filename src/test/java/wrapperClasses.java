import org.testng.annotations.Test;

public class wrapperClasses {

    int numar = 5;
    Integer numar2 = 7;




    @Test
    public void metodaTest(){
        System.out.println(numar);
        System.out.println(numar2.toString());

        if(numar < 7){
            System.out.println("nimic");
        }
        String nume;
        if(numar2.toString().equals("7")){
            System.out.println(numar2);
        }
    }
}
