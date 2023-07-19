class ArithmeticDemo {
        public static void main (String[] args){
                int result = 1+2;
                System.out.println("1 + 2 = "+ result);

                int original_result = result;
                result = result - 1;
                System.out.println(original_result +" - 1 = " + result);

                original_result = result;
                result = result * 2;
                System.out.println(original_result + " * 2 = "+ result);
                 
                System.out.println(result);
                result = result *3;
                System.out.println(result);
              

                
        }
}