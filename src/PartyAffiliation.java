import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        String User = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a capital letter for your political party affiliation[R D I O]");
        User = in.nextLine();
        if (User.equals("R")) {
            System.out.println("Your logo is Elephant");
        }
        if (User.equals("D")) {
            System.out.println("Your logo is Donkey");
        }
        if (User.equals("I")) {
            System.out.println("Your logo is Person");
        }
        if (User.equals("O")) {
            System.out.println("Your logo is Other");
        }

    }
    }