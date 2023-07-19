

class Bittlogic {
        public static void maim(String[] args){
                String binary[] = { "0000" ,"0001","0011","0100","0101","0110","0111","1000","1001","1010" };
                int a = 3;
                int b = 6;
                int c = a | b;
                int d = a & b;
                int e = a ^ b;
                // int f = a || b;
                // boolean g = a && b;

                System.out.println( "a = " +binary[a]);
                System.out.println( "b = " +binary[b]);
                System.out.println( "a|b = " +binary[c]);
                System.out.println( "a&b = " +binary[d]);
                System.out.println( "a^b = " +binary[e]);
                // System.out.println(binary[f]);
                // System.out.println(binary[g]);
              
        }
        
}
