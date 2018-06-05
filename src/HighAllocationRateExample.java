/**
 * @author bgherca on 29/05/2018
 */
public class HighAllocationRateExample {

    public void start() throws InterruptedException {
        long count = 0;

        while(true) {
            // allocate a lot of objects in this scope, they will be gc'ed
            SmallClass smallClass = new SmallClass();
            System.out.println("Allocated " + ++count + " objects");
            Thread.sleep(1);
        }
    }

}
