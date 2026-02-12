import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int T = sc.nextInt();

       for(int i=0; i<T; i++){
            try{
                long n = sc.nextLong();
                System.out.println(n + "can be fitted in:");

                if(n >= -128 && n <= 127)
                    System.out.println("* byte");

                if(n >= -32768 && n<= 32767)
                    System.out.println("*short");

                if(n >= -2147483648 && n <= 2147483647);
                    System.out.println("*int");

                System.out.println("*long");
            }catch (Exception e){
                System.out.println(sc.next() + "can't be fitted anywhere");
                }
       }
       sc.close(); 
    }
}