package phonebook.controller;


import phonebook.model.PhoneBook;
import phonebook.repository.PhoneBookRepository;

import java.util.List;
import java.util.Scanner;

public class PhoneBookController {


    Scanner scanner = new Scanner(System.in);

    public void searchPhoneByName(List<PhoneBook> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)) {
                System.out.println(list.get(i));
            }
        }
    }

    public void insertPhone(List<PhoneBook> list, String phone) {
        boolean check = false;

        while (!check) {
            try {
                System.out.println("Nhập sđt mới: ");
                String newPhone = scanner.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (!newPhone.equals(list.get(i).getPhone())) {
                        list.get(i).setPhone(newPhone);
                        phone = newPhone;
                        System.out.println("Thay đổi sđt thành công");
                        check = true;
                    } else {
                        throw new RuntimeException("Sđt đã tồn tại");
                    }
                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập sđt mới: ");
            }
        }
    }

    public void deletedPhonebyId() {

    }
}

