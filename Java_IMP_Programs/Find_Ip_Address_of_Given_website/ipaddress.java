package Java_IMP_Programs.Find_Ip_Address_of_Given_website;
/*
 * Java program to find the IP Address of the given website
 */
import java.net.InetAddress;
import java.util.Scanner;

public class ipaddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the website :");

        String str=sc.nextLine();

        try {
            InetAddress ip = InetAddress.getByName(str);
            System.out.println("Ip Address of the given website : "+ip);
        } catch (Exception e) {
            System.out.println("Website not found");
        }

        sc.close();
    }
}
