import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        menu_DAL mdal = new menu_DAL();
        customer_DAL cdal = new customer_DAL();
        restaurantStaff_DAL rdal = new restaurantStaff_DAL();
        MainMenu MainMenu = new MainMenu();

        int selection = 0;
        while (selection != 4) {
            MainMenu.showMainMenu();
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    mdal.ListToConsole();
                    break;
                case 2:
                    cdal.ListToConsole();
                    break;
                case 3:
                    rdal.ListToConsole();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
        scanner.close();
    }
        }

