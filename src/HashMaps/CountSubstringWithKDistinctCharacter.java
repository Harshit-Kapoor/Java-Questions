package HashMaps;

import java.util.HashMap;

public class CountSubstringWithKDistinctCharacter {

    public static void main(String[] args) {

        String str = "abcabdabbcfa";
        int k = 3;

        int ans = 0;

        int is = -1;
        int ib = -1;
        int j = -1;

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> bmap = new HashMap<>();

        while (true) {
            boolean f1 = false;
            boolean f2 = false;
            boolean f3 = false;

            while (ib < str.length() - 1) {
                ib++;
                char ch = str.charAt(ib);
                bmap.put(ch, bmap.getOrDefault(ch, 0) + 1);
                if (bmap.size() == k+1) {
                    removeInMap(bmap, ch);
                    ib--;
                    break;
                }
                f1 = true;
            }

            while (is < ib) {
                is++;
                char ch = str.charAt(is);
                smap.put(ch, smap.getOrDefault(ch, 0) + 1);
                if (smap.size() == k) {
                    removeInMap(smap, ch);
                    is--;
                    break;
                }
                f2 = true;
            }

            while (j < is) {
                if (bmap.size() == k && smap.size() == k-1) {
                    ans += ib - is;
                }

                j++;
                char ch = str.charAt(j);
                removeInMap(smap, ch);
                removeInMap(bmap, ch);

                if (smap.size() < k-1 || bmap.size() < k) {
                    break;
                }
                f3 = true;
            }

            if (f1 == false && f2 == false && f3 == false) {
                break;
            }

        }

        System.out.println(ans);

    }

    public static void removeInMap(HashMap<Character, Integer> map, char ch) {
        if (map.get(ch) == 1) {
            map.remove(ch);
        } else {
            map.put(ch, map.get(ch) - 1);
        }
    }
}


// ?v=CBSeilNvZHs&list=PL-Jc9J83PIiEp9DKNiaQyjuDeg3XSoVMR&index=13
