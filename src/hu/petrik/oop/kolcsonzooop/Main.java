package hu.petrik.oop.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Kolcsonozheto> katalogus = new ArrayList<>();
    static List<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("A Gyűrűk Ura", "J. R. R. Tolkein", "AABBCC-121314");
        Dvd dvd1 = new Dvd("Star Wars V. rész - A Birodalom visszavág", 124);
        Dvd dvd2 = new Dvd("Star Wars IV. rész - Egy új remény", 121);
        Dvd dvd3 = new Dvd("Star Wars VI. rész - A jedi visszatér", 131);
        Dvd dvd4 = new Dvd("A Gyűrűk Ura - A gyűrű szövetsége", 178);
        Dvd dvd5 = new Dvd("A Gyűrűk Ura - A király visszatér", 201);
        Dvd dvd6 = new Dvd("A Gyűrűk Ura - A két torony", 179);
        Ujsag ujsag1 = new Ujsag("Képes Sport", 2007, 23);

        //Interface típusú objektum csak úgy hozható létre, ha az megvalósítja az interface minden függvényét
        Kolcsonozheto kolcsonozheto = new Kolcsonozheto() {
            @Override
            public String megjelenitendoNev() {
                return null;
            }

            @Override
            public int meddigKolcsonozheto() {
                return 0;
            }
        };

        System.out.println(konyv1.getIsbn());
        System.out.println(konyv1.megjelenitendoNev());
        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(dvd4);
        katalogus.add(dvd5);
        katalogus.add(dvd6);
        katalogus.add(ujsag1);

        for (Kolcsonozheto k : katalogus){
            System.out.println(k.megjelenitendoNev() + " " + k.meddigKolcsonozheto());
        }

        Collections.sort(dvdk);
        System.out.println();
    }
}
