import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        System.out.println( i  + "es tu numero");
        System.out.println("hola");
    }
}