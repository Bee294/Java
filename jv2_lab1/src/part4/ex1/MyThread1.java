package part4.ex1;

public class MyThread1 extends Thread{
    MyThread1(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread running....");
        int i = 0;
        int count = 0;
        while (true){
            if(i %2 ==0){
                System.out.println(i);
                count++;
            }
            i++;
            if(count == 10){
                break;
            }
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}