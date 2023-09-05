//package Aapna_College_DSA.Recursion;
//
//public class First_Last_Occurance {
//    // Find the 1st and Last occurance of an element in string "abaacdaefaah"
//
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void findOccurance(String str , int idx , char element){
//        if(idx == str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//
//        char currChar = str.charAt(idx);
//        if(currChar == element) {
//            if(first == -1){
//                first = idx;
//            }
//            else {
//                last = idx;
//            }
//        }
//        findOccurance(str,idx+1,element);
//    }
//
//    public static void main(String[] args) {
//        String str = "abaacdaefaah";
//        findOccurance(str , 0,'a');
//    }
// }
