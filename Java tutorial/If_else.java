public class If_else {
    public static void main(String[] args) {
        //if phai viet thuong neu viet IF hoac If se tao ra loi
        //Sử dụng if để chỉ định một khối mã sẽ được thực thi, nếu một điều kiện được chỉ định là đúng
        if (20>18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x>y) {
            System.out.println("x is greater than y");
        }


        //Sử dụng else để chỉ định một khối mã sẽ được thực thi, nếu điều kiện tương tự là sai
        int time =20;
        if(time <18) {
            System.out.println("Good day.");
        }else {
            System.out.println("Good evening");
        }
        //Man hinh se tra ve "Good evening"
        // Toan tu bac ba co the thay the nhieu  dong bang 1 dong duy nhat se tra ve ket qua tuong tu
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int timee = 20;
        String result = (time<18) ? "Good day." : "Good evening";
        System.out.println(result);


        //Sử dụng else-if để chỉ định một điều kiện mới để kiểm tra, nếu điều kiện đầu tiên là sai
        int thoigian=20;
        if (thoigian <10) {
            System.out.println("Good morning.");
        }else if(thoigian <20){
            System.out.println("Good day.");
        }else {
            System.out.println("Good evening.");
        }
        //Man hinh se tra ve"Good evening."


    }
}
