import java.util.Scanner;

class star{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number for Printing the Table  : " );
        int num = scanner.nextInt();

        for(int i=1; i <= 10; i++){
            // System.out.println(num + " * " + i  +" = "+i * num);
            System.out.println(i * num);
        }
    }
}