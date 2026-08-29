package OOP.Polymorfism;

public class Angajat extends Persoana {

    private String departament;
    private String firma;
    private Integer vechime;

    public Angajat(String nume, String prenume, Integer varsta, Double inaltime, String departament, String firma, Integer vechime) {
        super(nume, prenume, varsta, inaltime);
        this.departament = departament;
        this.firma = firma;
        this.vechime = vechime;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Departamentul este" + departament);
        System.out.println("Firma este" + firma);
        System.out.println("Vechimea este" + vechime);

    }

    public void lucreaza() {
        System.out.println("Angajatul lucreaza");
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getVechime() {
        return vechime;
    }

    public void setVechime(Integer vechime) {
        this.vechime = vechime;
    }


    public void facePrezentariPowerPoint() {
        System.out.println("Prezentare1" + "Prezentare2");

    }
    public String  facePrezentariPowerPoint(String rezultat) {
        System.out.println("Prezentare1" + "Prezentare2");
        return "Prezentarea este gata";

    }

    public void facePrezentariPowerPoint(int numar) {
        System.out.println("Prezentare" + numar);
    }

    public void facePrezentariPowerPoint(double numar) {
        System.out.println("Prezentare" + numar);
    }

    public double facePrezentariPowerPoint(double numar, String titlu) {
        System.out.println("Prezentare" + numar + titlu);
        return numar;
    }

}
