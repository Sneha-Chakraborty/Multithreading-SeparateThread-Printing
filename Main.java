public class Main {
    public static void main(String[] args){
        System.out.println("Current Thread from Main method is :- " + Thread.currentThread().getName());
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread thread = new Thread(hwp);
        thread.start();
    }
}
