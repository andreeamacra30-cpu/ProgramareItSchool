import org.testng.annotations.Test;

public class metodaReturn {


    @Test
    public void metodaTest(){
        System.out.println(getSalariu());
        System.out.println(getNume());
        System.out.println(rezultatCalcul());
    }

    public Integer getSalariu(){

        Integer salariu = 10000;
        return salariu;

    }

    public String getNume(){

        String nume = "Andreea";
        return nume;
    }

    public double rezultatCalcul(){

        double rezultat = Math.cos(35.4);
        return rezultat;
    }


}
