package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String s="carerac";
        System.out.println(canPermutePalindrome(s));
    }
    //Given a string, determine if a permutation of the string could form a palindrome.
    public static boolean canPermutePalindrome(String s){
        if(s==null||s.length()==0) return false;
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!set.add(s.charAt(i))){
                set.remove(s.charAt(i));
            }
        }
        return set.size()<=1;
    }
}
