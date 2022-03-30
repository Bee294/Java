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
                        check= true;
                        break;
                    } else {
                        throw new RuntimeException("Sđt đã tồn tại");
                    }
                }
                if(check){
                    System.out.println("Nhập ten mới: ");
                    String nameNew = scanner.nextLine();
                    int idNew = list.size()+1;
                    PhoneBook  phoneNew = new PhoneBook(idNew,nameNew,newPhone);
                    list.add(phoneNew);
                    System.out.println("Ban vua them sdt moi thanh cong : ");
                    System.out.println("Ten: "+phoneNew.getName()+" Phone: "+ phoneNew.getPhone());

                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập sđt mới: ");
            }
        }
    }

    public void deletedPhoneByName(List<PhoneBook> phoneList){
        Boolean checkphone = false;
        int indexPhone = -1;
        System.out.println("Nhập sđt can xoa: ");
        String newPhone = scanner.nextLine();
        for (int i = 0; i < phoneList.size(); i++) {
            if (newPhone.equals(phoneList.get(i).getPhone())) {
                indexPhone = i;
                break;
            }
        }
        if(indexPhone != -1) phoneList.remove(indexPhone);
        System.out.println("Ban da xoa thanh cong ");
        System.out.println("Danh ba hien tai moi cap nhat: ");
        for (int j = 0; j < phoneList.size(); j++) {
            System.out.println("Name: "+ phoneList.get(j).getName() + "- Phone: "+ phoneList.get(j).getPhone());
        }


    }


}

