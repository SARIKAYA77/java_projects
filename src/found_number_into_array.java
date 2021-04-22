import java.util.Scanner;

public class found_number_into_array {
    public static void main(String[] args) {
        int n;
        Scanner results = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        n=results.nextInt();
//creates an array in the memory of length 10
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            array[i]=results.nextInt();

        }
        int found_number = 5;
        boolean isFound = false;
        for (int number: array) {
            if (number == found_number) {
                isFound = true;

            }
        }
        if (isFound==true){
            System.out.println("founded");
        }else{
            System.out.println("not found");
        }


    }}
