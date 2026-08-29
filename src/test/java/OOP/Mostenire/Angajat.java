package OOP.Mostenire;

public class Angajat extends Persoana{

    String departament;
    String firma;
    Integer vechime;

    public Angajat(String nume, String prenume, Integer varsta, Double inaltime, String departament, String firma,Integer vechime) {
        super(nume, prenume, varsta, inaltime);
        this.departament = departament;
        this.firma = firma;
        this.vechime = vechime;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Departamentul este" + departament);
        System.out.println("Firma este" + firma);
        System.out.println("Vechimea este" + vechime);

    }

    public void lucreaza(){
        System.out.println("Angajatul lucreaza");
    }
}
