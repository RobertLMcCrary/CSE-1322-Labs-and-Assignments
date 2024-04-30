import java.util.Random;

public class Baby implements Runnable {
    private int time;
    private String name;
    
    public Baby(String name) {
        this.name = name;
        Random random = new Random();
        this.time = random.nextInt(5000);
    }

    @Override
    public void run() {
        System.out.println("My name is " + name + ". I am going to sleep for " + time + "ms");
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException error) {
            error.printStackTrace();
        }
        System.out.println("My name is " + name + ", I am awake, feed me!!!");
    }
}
