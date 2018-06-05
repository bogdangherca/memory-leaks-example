import java.util.ArrayList;
import java.util.List;

/**
 * @author bgherca on 29/05/2018
 */
public class MemoryLeakOutsideTLABExample {

    private List<LargeClass> container;

    public MemoryLeakOutsideTLABExample() {
        this.container = new ArrayList<>();
    }

    public void start() throws InterruptedException {
        while(true) {
            // add elements to container in order to keep them referenced
            container.add(new LargeClass());
            System.out.println("Container size got to " + container.size());
            Thread.sleep(1000 * 5);
        }
    }

}
