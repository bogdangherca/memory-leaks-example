import java.nio.ByteBuffer;

/**
 * @author bgherca on 29/05/2018
 */
public class OffHeapLeakExample {

    public void start() {

        while(true) {
            // heap dumps will not help you with this
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
        }
    }

}
