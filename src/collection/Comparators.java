package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {
    public static void main(String... args) {
        ArrayList<Cars> obj = new ArrayList<Cars>();
        obj.add(new Cars("Audi", "q8", "sedan", 101));
        obj.add(new Cars("Maruthi suzuki", "swift", "sedan", 100));
        obj.add(new Cars("Volswogan", "polo", "hatchback", 103));
        obj.add(new Cars("Hundai", "i20", "Hatchback", 105));
        Comparator<Cars> cm1 = Comparator.comparing(Cars::getBrand);
        Collections.sort(obj, cm1);

        for (Cars i : obj) {
            System.out.println(i.brand);
        }
    }
}