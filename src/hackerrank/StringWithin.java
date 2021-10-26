package hackerrank;

import java.util.Locale;

public class StringWithin {

    public static boolean contains(String string1, String string2){

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        //obvious response:
        if(string1.contains(string2)){
            return true;
        }

//        if(string1.indexOf(string2) >= 0){ //start the search from the beginning
//            return true;
//        }
//
//        if(string1.lastIndexOf(string2) >= 0){ //start the search from the end
//            return true;
//        }

        return false;
    }

}
