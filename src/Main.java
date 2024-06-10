import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //(This task uses Strings:) A program that prompts the user for their party affiliation (Democrat, Republican, or Independent) and responds accordingly with a Donkey, Elephant, Person, or Other.  (i.e. “You get a Democratic Donkey.”)  Notes: create a menu so the user chooses D, R, or I and assume that any other choice will be Other.  Tests: just the four options D, R, I, Other. Use as cascaded if structure not separate if statements!
        String party;
        System.out.print("Enter your party affiliation (Democrat, Republican, or Independent [D/R/I]: ");

        Scanner in = new Scanner(System.in);
        party = in.nextLine().toUpperCase();

        switch (party) {
            case "D":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "I":
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get Other.");
                break;
        }
    }
}