package hackerrank;

import java.util.ArrayList;

public class Palindromo {

    public static boolean isPalindromo(String palindromo) {

        palindromo = palindromo.toLowerCase(); //making sure the chars are the same regardless of the string I receive
        int length = (palindromo.length())-1;
        int count = 0;

        //optimized

        for (int i = 0; i < length; i++) {          //O(n)
            if (palindromo.charAt(i) == palindromo.charAt(length - i)) {  //a[0] = a[n] ... a[1] = a[n-1]...
                count++;
            }
        }
        //my solution in case the user adds phrases
//        int length = palindromo.length();
//        ArrayList<Character> charList = new ArrayList<Character>();
//
//        for (int i = 0; i < length; i++) {          //O(n)
//            char stringChars = palindromo.charAt(i);
//
//            if (stringChars != ' ') { //cleaning blank spaces in case of sentences
//                charList.add(stringChars);
//            }
//        }
//        int listSize = (charList.size()) - 1;
//        for (int j = 0; j < listSize; j++) {  //O(n)
//            if (charList.get(j) == charList.get(listSize - j)) { //a[0] = a[n] ... a[1] = a[n-1]...
//                count++;
//            }
//        }
//        System.out.println(count);
//        System.out.println(charList.toString());

        if (count == length) {
            return true;
        } else {
            return false;
        }
   }
}
