import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        Scanner results = new Scanner(System.in);
        int number = results.nextInt();
        int total = 0 ;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i ;

            }
        }
        if(total == number){
            System.out.println("number is perfect number");
        }else{
            System.out.println("number is not perfect number");
        }
    }
}