package Aapna_College_DSA.Recursion;

import java.util.HashSet;

public class Unique_Subsequences {
    // Print all Unique subsequences of a string
    // "aaa" -> aaa,aa,a

    public static void subsequences(String str, int idx, String newString, HashSet<String> allsubseq){
        if (idx == str.length()){
            if(allsubseq.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                allsubseq.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        // to be
        subsequences(str,idx+1,newString+currChar,allsubseq);
        // or not to be
        subsequences(str,idx+1, newString,allsubseq);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> allsubseq = new HashSet<>();
        subsequences (str, 0," ",allsubseq );
    }
}


