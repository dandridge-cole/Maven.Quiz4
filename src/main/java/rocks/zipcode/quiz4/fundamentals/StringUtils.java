package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0,str.length()/2)+
                Character.toUpperCase(getMiddleCharacter(str))+
                str.substring(str.length()/2+1);
    }

    public static String lowerCaseMiddleCharacter(String str) {

        return str.substring(0,str.length()/2)+
                Character.toLowerCase(getMiddleCharacter(str))+
                str.substring(str.length()/2+1);
    }

    public static Boolean isIsogram(String str) {
        List<Character> list = new ArrayList<>();
        for (char c:str.toCharArray()) {
            if(list.contains(c))return false;
            list.add(c);
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i =0; i<str.length()-1;i++)
            if(str.charAt(i)==str.charAt(i+1))return true;
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder answer = new StringBuilder();
        Integer last=str.length()-1;
        if(str.charAt(0)!=str.charAt(1))answer.append(str.charAt(0));
        for(int i=1;i<last;i++) if(str.charAt(i-1)!=str.charAt(i)&&str.charAt(i)!=str.charAt(i+1))answer.append(str.charAt(i));
        if(str.charAt(last)!=str.charAt(last-1))answer.append(str.charAt(last));
        return answer.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder answer = new StringBuilder();
        for(Character c:str.toCharArray()){
            if(Character.isAlphabetic(c)){
                if(Character.isUpperCase(c))answer.append(Character.toLowerCase(c));
                else answer.append(Character.toUpperCase(c));
            } else answer.append(c);
        }
        return answer.toString();
    }
}