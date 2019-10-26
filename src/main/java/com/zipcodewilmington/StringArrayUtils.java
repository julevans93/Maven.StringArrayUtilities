package com.zipcodewilmington;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import com.sun.xml.internal.org.jvnet.fastinfoset.RestrictedAlphabet;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
       return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String x : array){
            if(x.equals(value));
        }
        return true;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> reverse1 = Arrays.asList(array);
        Collections.reverse(reverse1);
        return reverse1.toArray(array);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i< array.length; i++){
           if(!array[i].equals(array[(array.length-1)-i]))
               return false;
        }
        return true;
        }




    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {String result = "";
    for (String x : array)
        result += x.toUpperCase();
    for(int i ='A'; i < 'Z'; i++){
        for(int j = 0; j < result.length(); j++){
            if(i == result.charAt(j)){
                break;
            }
            else if (j == result.length() - 1){
                return false;
            }
        }
    }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        list.remove(valueToRemove);
        array = list.toArray(new String[0]);

        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        Set<String> string1 = new TreeSet<String>();
        for(String str: array){
         string1.add(str);
        }
        String [] string2 = string1.toArray(new String[string1.size()]);
        return string2;
    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List removed = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            if(i+1 != array.length) {
                String next = array[i];
                while (array[i].equals(array[i + 1])) {
                    next += array[i];
                    i++;
                    if (i + 1 == array.length) {
                        break;
                    }
                }
                removed.add(next);
            }else {
                removed.add(array[i]);
            }
                }
        return (String[]) removed.toArray(new String [removed.size()]);
            }
        }






