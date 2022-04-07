package part4.ex1;

public class RunThread {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1("MyJavaThread");

        System.out.println("MyThread renamed: "+myThread.getName());

        myThread.start();
    }
}
