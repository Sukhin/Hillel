import java.util.Scanner;
import java.util.Locale;

public class App {

    static int number_Order=1;
    static String name_Customer;
    static String product;
    static float price;
    static String name_Street;
    static int number_Building;
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        while (number_Order<=2) {
            System.out.print("Enter your name:"+" ");
            name_Customer=in.nextLine();
            System.out.println("Order No"+" "+number_Order+" "+"Client:"+" "+name_Customer+".");
            System.out.print("Enter name product:"+" ");
            product=in.nextLine();
            System.out.println("Product:"+" "+product+",");
            System.out.print("Enter price:"+" ");
            price=in.nextFloat();
            System.out.println("price EUR"+" "+price+".");
            in.nextLine();
            System.out.print("Enter address:"+" ");
            name_Street=in.nextLine();
            System.out.print("Number building:"+" ");
            number_Building=in.nextInt();
            System.out.println("Address:"+" "+name_Street+","+" "+ number_Building);
            in.nextLine();
            number_Order+=1;
        }

    }
}