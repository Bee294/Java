//Truyen du lieu la gan gia tri cua mot kieu du lieu nguyen thuy cho mot kieu khac
public class Type_casting {
    public static void main(String[] args) {

    //Widening Casting: chuyen doi loai kich thuoc nho hon sang loai lon hon
    int myInt = 9;
    double myDouble = myInt;//chuyen doi int sang double
    System.out.println(myInt);
    System.out.println(myDouble);

    //Narrowing Casting: chuyen doi loai kich thuoc lon hon sang loai nho hon
    double myDouble2 = 9.78d;
    int myInt2 = (int) myDouble2;// chuyen doi double sang int
    System.out.println(myDouble2);
    System.out.println(myInt2);
    }
}
