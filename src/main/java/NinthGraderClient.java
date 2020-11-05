import java.util.Scanner;
public class NinthGraderClient {
    public static void main(String[] args) {
        //I was just messing around with some bad code
        Scanner scan = new Scanner(System.in);
        GroceryList list1 = new GroceryList();
        String addSubtractAnswer = "";
        String tempListItem = "";
        while (list1.getList()[99].equals(null)) {
            System.out.print("Would you like to remove or add an item to your grocery list: ");
            addSubtractAnswer = scan.next();
            scan.nextLine();
            if (addSubtractAnswer.toUpperCase().equals("REMOVE")) {
                System.out.print("What item would you like to add to your list: ");
                tempListItem = scan.nextLine();
                list1.remove(tempListItem);        
            }
            else if (addSubtractAnswer.toUpperCase().equals("ADD")) {
                System.out.print("What item would you like to add to your list: ");
                tempListItem = scan.nextLine();
                list1.add(tempListItem);
            }
            else  {
                System.out.println("Invalid Operation try again.");
            }
        }
        scan.next();
    }
}