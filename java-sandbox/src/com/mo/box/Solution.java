package com.mo.box;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        char[] c = scan.nextLine().toLowerCase().toCharArray();
        HashSet set = new HashSet();

        for(int i = (c.length-1); i>=0; i--){

        	set.add(c[i]);            
        }
       
        if(set.size()==27) {System.out.print("pangram");}  else System.out.print("not pangram");
    
    
    }
}