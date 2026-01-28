import java.util.Scanner;

class table{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = 15;
        System.out.print("Enter any number for Printing the Table  : ");
        // int num = scanner.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(num + " * " + i  +" = "+i * num);
        }
    }
}
