package OOP.Polymorfism;


public class Student extends Persoana {
   private String facultate;
   private String grupa;
   private Integer restante;

    public Student(String nume, String prenume, Integer varsta, Double inaltime, String facultate, String grupa, Integer restante) {
        super(nume, prenume, varsta, inaltime);
        this.facultate = facultate;
        this.grupa = grupa;
        this.restante = restante;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Facultatea este" + facultate);
        System.out.println("Grupa este" + grupa);
        System.out.println("Numarul de restante este" + restante);
    }

    @Override
    public void lucreaza(){
        System.out.println("Studentul lucreaza");
    }

    public String getFacultate() {
        return facultate;
    }

    public String getGrupa() {
        return grupa;
    }

    public Integer getRestante() {
        return restante;
    }
}
