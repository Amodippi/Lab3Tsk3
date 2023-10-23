import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double delta, x1,x2;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number a of your equation ");
    int a = scanner.nextInt();
    System.out.println("Enter the number b of your equation ");
    int b = scanner.nextInt();
    System.out.println("Enter the number c of your equation ");
    int c = scanner.nextInt();
    if(a == 0){
        System.out.println("your a = o ");
        System.exit(0);
    }

        delta = (Math.pow(b, 2) - (4 * a * c));
        if (delta >1){

            x1 = (-b+Math.sqrt(delta))/(2*a);
            x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println(x1);
            System.out.print(x2);
        }
        else if (delta<1){
            System.out.println("there are no roots");
        }
        else if (delta == 0){
            System.out.println((-b)/(2*a));
        }
    }
}
