package phonebook.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import phonebook.controller.PhoneBookController;
import phonebook.model.PhoneBook;
import phonebook.repository.PhoneBookRepository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        PhoneBookRepository phoneBookRepository = new PhoneBookRepository();
        PhoneBookController phoneBookController = new PhoneBookController();
        phoneBookRepository.getData();

        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);
        List<PhoneBook> phoneBookList = phoneBookRepository.phoneBookList;

        while (true) {
            menu();
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Tìm số điện thoại theo tên: ");
                    String name = sc.nextLine();
                    phoneBookController.searchPhoneByName(phoneBookList, name);
                    break;
                case 2:
                    System.out.println("Thay đổi sđt: ");
                    long id = sc.nextInt();
                    phoneBookController.insertPhone(phoneBookList, "");

                    break;
                case 3:
                    System.out.println("Xóa số điện thoại: ");
                    phoneBookController.deletedPhonebyId();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }

    private static void menu() {
        System.out.println("Chức năng: ");
        System.out.println("1. Tìm kiếm sđt theo tên");
        System.out.println("2. Thay đổi số điện thoại");
        System.out.println("3. Xóa số điện thoại");
        System.out.println("4. Kết thúc chương trình");
    }

    public static void printResult(List<PhoneBook> list) {
        for (PhoneBook phonebook : list) {
            System.out.println(phonebook);

        }
    }
}
