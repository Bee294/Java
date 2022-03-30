package phonebook.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import phonebook.model.PhoneBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class PhoneBookRepository {
    public List<PhoneBook> phoneBookList;

    public void getData() {
        try {
            FileReader reader = new FileReader("Phonebook.json");
            Type objectType = new TypeToken<List<PhoneBook>>() {
            }.getType();
            phoneBookList = new Gson().fromJson(reader, objectType);

            for (PhoneBook phonebook : phoneBookList) {
                System.out.println(phonebook);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

