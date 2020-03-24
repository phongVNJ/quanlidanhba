import java.io.IOException;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        menu();
    }

    private static void menu() throws IOException {

        Add add = new Add();
        Information information = new Information();
        EditList editList = new EditList();
        Remove remove = new Remove();
        Read read = new Read();
        Write write =new Write();
        Delete delete = new Delete();
        do {
            System.out.println("\n");
            System.out.println("--------Menu-------");
            System.out.println("1.ShowListcontact");
            System.out.println("2.add new");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("5.Search");
            System.out.println("6.Read to file");
            System.out.println("7.Write to file");
            System.out.println("8.Exit");
            System.out.println("Chose a number");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    Showlist.Menu();
                    break;
                case 2:
                    Add.Menu();
                    break;
                case 3:
                    Update.Menu();
                    break;
                case 4:
                    Delete.Menu();
                    break;
                case 5:
                    Search.Menu();
                    break;
                case 6:
                    Read.Menu();
                    break;
                case 7:
                    Write.Menu();
                    break;
                case 8:
                    System.exit(8);
                    break;

            }


        } while (true);
    }
}


