public class For_loop {
    public static void main(String[] args) {

        for (int i = 0; i<5; i++) {
            System.out.println(i);
        }
        // cau lenh 1 dat mot bien truoc khi vong lap bat dau(int i = 0)
        // cau lenh 2 xac dinh dieu kien chay vong lap, neu sai thi vong lap ket thuc
        // cau lenh 3 tang gia tri (i ++) moi khi vong lap duoc thuc hien

        for (int i=0; i<10; i = i+2){
            System.out.println(i);
        }

        //for-each loop

        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for (String i: cars) {
            System.out.println(i);
        }



    }
}
