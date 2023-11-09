public class HelloWorldPrinter implements Runnable{
    public void run(){
        System.out.println("<<<<Hello World>>>> from separate thread!\nCurrent Thread from custom class is : " + Thread.currentThread().getName());
    }
}
