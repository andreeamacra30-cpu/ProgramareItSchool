package OOP.Incapsulare;

import org.testng.annotations.Test;

public class IncapsulareTest {

    @Test
    public void metodaTest() {


        Angajat marcel = new Angajat("Mitica", "Marcel", 30, 1.76, "HR", "Firma", 4);
        marcel.infoAngajat();
        marcel.lucreaza();
        marcel.setDepartament("Testare");
        System.out.println();

        Student maria = new Student("Maria", "Ana", 18, 1.60, "Litere", "B", 2);
        maria.infoStudent();
        maria.lucreaza();
        maria.getFacultate();
        System.out.println(maria.getFacultate());
    }
}
