package HashMaps;

import java.util.HashMap;

public class FindIteraryFromTickets {

    public static void main(String[] args) {

        HashMap<String, String> inp = new HashMap<>();
        inp.put("Chennai","Bangalore");
        inp.put("Bombay","Delhi");
        inp.put("Goa","Chennai");
        inp.put("Delhi","Goa");

        HashMap<String, Boolean> psrc = new HashMap<>();

        for (String src : inp.keySet()) {
            String dest = inp.get(src);                   // put all destination all false as they cant be starting point
            psrc.put(dest, false);

            if (psrc.containsKey(src) == false) {
                psrc.put(src, true);                      // if key is not present in psrc, the put as true
            }
        }

        String originalSrc = "";                          // find original src
        for (String s : psrc.keySet()) {
            if (psrc.get(s) == true) {
                originalSrc = s;
            }
         }

        while (true) {
            if (inp.containsKey(originalSrc)) {           // print originalsrc and make next dest as originalsrc
                System.out.print(originalSrc + "->");
                originalSrc = inp.get(originalSrc);
            } else {
                System.out.print(originalSrc);
                break;
            }
        }

    }

}

/*
    src -> dest
    Chennai -> Bangalore
    Bombay -> Delhi
    Goa -> Chennai
    Delhi  -> Goa

    O/P - Bombay -> Delhi -> Goa -> Chennai -> Bangalore

    find the starting point, iterate hashmap put all dest all false which cant be src, then check which src is

*/
