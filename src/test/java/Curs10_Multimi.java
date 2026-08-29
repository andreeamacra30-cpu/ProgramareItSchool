import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Curs10_Multimi {

    @Test
    public void metodaTest(){
    // exempluArray();
       // metodaListe();
      //  exempleHashMap();
        exempluHashMap2();
    }

   public void exempluArray() {
        String[] colegi = new String[5];
        colegi[0] = "Catalin";
        colegi [1]= "Ionut";
        colegi [2] = "Elena";
        colegi[3]="Bianca";
        colegi[4]= "Catalin";

      //  for(String coleg : colegi){
      //      System.out.println(coleg);{
       // }

   // }
        Arrays.sort(colegi);
        for(int i = 0; i < colegi.length;i++)
        {

        System.out.println(colegi[i]);
}
    }


    public void metodaListe(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Catalin");
        colegi.add("Ionut");
        colegi.add("Elena");
        colegi.add("Bianca");
        colegi.add("Aurelian");

        int i = 0;
        while (i < colegi.size());
        {
            System.out.println(colegi.get(i));
            i++;
        }
    }
    public void exempleHashMap(){
        HashMap<String , String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct","mar");
        obiecte.put("floare", "trandafir");
        for(String Key: obiecte.keySet())
        {
         System.out.println("Cheia este " + Key);
         System.out.println("Valoarea este " + obiecte.get(Key));
        }
    }

    public void exempluHashMap2(){
        HashMap<String , List<String>> organizare = new HashMap<>();
        List<String> oraseDinRomania = new ArrayList<>();
        oraseDinRomania.add("Timisoara");
        oraseDinRomania.add("Constanta");
        oraseDinRomania.add("Brasov");

        List<String> oraseDinSpania =  new ArrayList<>();
        oraseDinSpania.add("Madrid");
        oraseDinSpania.add("Barcelona");
        oraseDinSpania.add("Valencia");

        List<String>oraseDinItalia = new ArrayList<>();
        oraseDinItalia.add("Roma");
        oraseDinItalia.add("Napoli");
        oraseDinItalia.add("Catania");

        organizare.put("Romania", oraseDinRomania);
        organizare.put("Spania", oraseDinSpania);
        organizare.put("Italia", oraseDinItalia);

        for (String Key : organizare.keySet())
        {
            System.out.println("Cheia este " + Key);
            System.out.println("Valoarea este "+  organizare.get(Key));
        }
    }
}
