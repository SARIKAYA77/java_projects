import java.util.Scanner;

public class prime_number {
    public static void main(String [] args){

        Scanner results = new Scanner(System.in);
        boolean is_Prime = true;
        int result = results.nextInt();
        if (result<0){
            System.out.println("please enter positive number");
        }
        if (result == 1){
            System.out.println("number is not prime number");
        }else{
            for(int i=2;i<result;i++){
                if(result%i==0){
                    is_Prime = false;
                }
            }
            if(is_Prime){
                System.out.println("number is prime number");
            }else{
                System.out.println("number is not prime number");
            }
        }
    }

}
