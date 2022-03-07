public class While_loop {
    public static void main(String[] args) {
        //Vong lap while lap qua mot khoi ma khi dieu kien la dung

        int i =0;
        while (i<5) {
            System.out.println(i);
            i++;// Không quên tăng biến nếu không vòng lặp sẽ không kết thúc
        }

        // Vong do/while se kiem tra dieu kien do truoc co dung khong

        int a = 0;
        do {
            System.out.println(a);
            a++;
        }
        while (a<5);
    }
}
