import java.util.ArrayList;
import java.util.Arrays;
public class U7L4Runner {
    public static void main(String[] args) {
        /*ArrayList<Integer> revise = new ArrayList<Integer>();
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("hi", "bye", "like", "woo"));
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 3) {
                words.add(i, "3");
               i++;
                revise.add(i);
            }
        }

        int counter = 0;
        for (int i = 0; i < revise.size(); i++) {
            words.add(revise.get(i) + counter, "3");
            counter++;
        }
        System.out.println(words);
        */

        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

// before:
        System.out.println(names);

// complete me:
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() == 5) {
                names.remove(i);
                i--;
            }
        }

// after:
        System.out.println(names);

    }
}
