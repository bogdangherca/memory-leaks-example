public class MemoryExampleMain {

    public static void main(String[] args) throws InterruptedException {
        HighAllocationRateExample memoryLeakExample = new HighAllocationRateExample();
        memoryLeakExample.start();
    }
}
