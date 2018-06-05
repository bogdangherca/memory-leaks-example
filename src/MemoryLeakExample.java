import java.util.ArrayList;
import java.util.List;

/**
 * @author bgherca on 29/05/2018
 */
public class MemoryLeakExample {

    private List<SmallClass> container;

    public MemoryLeakExample() {
        this.container = new ArrayList<>();
    }

    public void start() throws InterruptedException {
        while(true) {
            // add elements to container in order to keep them referenced
            container.add(new SmallClass());
            System.out.println("Container size got to " + container.size());
            Thread.sleep(10);
        }
    }

}
