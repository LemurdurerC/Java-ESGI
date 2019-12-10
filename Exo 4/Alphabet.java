import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {
    ArrayList<String> al = new ArrayList<String>();

    Alphabet(String letters) {
        String[] alphabets = letters.split("");
        splitLetters(alphabets);
    }

    public void makeAlphabet(String element) {
        al.add(element);
    }

    public void verifyAlphabet(String arg1) {
        String[] alphabets = arg1.split("");
        for (String alphabet : alphabets) {
            if (al.contains(alphabet) == false && al.contains(alphabet.toUpperCase()) == false && al.contains(alphabet.toLowerCase()) == false) {
                System.out.println("Mot non présent dans le dico");
                break;
            }
        }
    }

    public void splitLetters(String[] l) {
        for (String letters : l) {
            al.add(letters);
        }
    }

    public void checkAnagramme(String one, String two) {
        char[] oneTab=one.toCharArray();
        char[] twoTab = two.toCharArray();
        if (one.length() != two.length()) {
            System.out.println(two + " n'est pas un anagramme");
        }
        Arrays.sort(oneTab);
        Arrays.sort(twoTab);
        Boolean test = true;
        for (int i=0; i<oneTab.length; i++){
            if (oneTab[i]!=twoTab[i]){
                test = false;
            }
        }
        if (test==true){
            System.out.println("Est un anagramme");
        }
        else{
            System.out.println("N'est pas un anagramme");
        }

    }
    public void deleteString(String one, String two){
        String newStr = one.replaceAll(two,"");
        System.out.println(newStr);
    }

    public void leftRotate(String s, int nbr){
        char[] tab = s.toCharArray();
        System.out.println(s);
        int sLen = s.length();
        char temp;
        for (int i = 0; i < nbr; i++) {
            int j = sLen-1;
            while (j > 0) {
                temp = tab[j];
                tab[j] = tab[j-1];
                tab[j-1] = temp;
                j--;
            }
        }
        System.out.println(String.copyValueOf(tab));
    }
}
