import java.util.Scanner;

public class Main {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
    public static void main(String[] args){
        System.out.println("Here we go...");
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review coce");
        announceDeveloperTeaTime();

        System.out.println("Get promoted");
    }
}
