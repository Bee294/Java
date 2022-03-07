public class Break_continue {
    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            if (i == 4) {
                break;  //break duoc su dung de nhay ra khoi vong lap
            }
            System.out.println(i);
        }

        for (int i =0; i<10; i++) {
            if (i==4) {
                continue;  // continue ngat 1 lan trong vong lap neu dk cu the xay ra ( vi du khi i =4  thi se tiep tuc voi lan lap tiep theo)
            }
            System.out.println(i);
        }


        // break va continue trong vong lap while
        int i =0;
        while (i<10) {
            System.out.println(i);
            i++;
            if (i==4) {
                break;
            }
        }

        int a=0;
        while (a<10) {
            if(a == 4) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }



    }
}
