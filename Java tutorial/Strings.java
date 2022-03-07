import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
         System.out.println(greeting);

        String txt = "ABCDEFGIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " +txt.length() );//length(): xd chieu dai cua chuoi

        String text = "Hello World";
        System.out.println(text.toUpperCase());//Viet hoa tat ca chu cai
        System.out.println(text.toLowerCase());//Viet thuong tat ca chu cai

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));// indexOf() tim vi tri lan xuat hien dau tien cua tu( bao gom ca khoang trang)

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + "" + lastName);//noi hai chuoi
        System.out.println(firstName.concat(lastName));// concat() cung co the noi hai chuoi

        String txt3 = "We are the so-colled \"Viking\" from the north.";// ki tu \" chen mot dau ngoac kep trong 1 chuoi
        System.out.println(txt3);

        int x= 10;
        int y= 20;
        int z =x+y;
        System.out.println(z);// ket qua la 30

        String a = "10";
        String b = "20";
        String c = a + b;
        System.out.println(c);//Ket qua la 1 chuoi noi a và b

        String m = "10";
        int n = 20;
        String p = m+n;
        System.out.println(p);//Ket qua la 1 chuoi noi 1 so va 1 chuoi




    }
}
