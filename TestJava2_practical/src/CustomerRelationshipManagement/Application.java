package CustomerRelationshipManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerController controller = new CustomerController();

        while (true) {
            menu();
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    sc.nextLine();
                    System.out.print("Nhập tên customer: ");
                    String nameAdd = sc.nextLine();
                    System.out.print("Nhập email customer: ");
                    String email = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = sc.nextLine();
                    CustomerController.addCustomer(nameAdd,email,phone);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Nhập tên Customer bạn muốn tìm: ");
                    String name = sc.nextLine();
                    CustomerController.findCustomerByName(name);
                    break;
                case 3:
                    CustomerController.displayAll();
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập đúng");
                    new CustomerController();
                    break;

            }

        }

    }
    private static void menu() {
        System.out.println("=====Menu=====");
        System.out.println("1. Add new customer");
        System.out.println("2. Find by name");
        System.out.println("3. Display all");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");

    }
}
