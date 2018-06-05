/**
 * @author bgherca on 29/05/2018
 */
/* allocations for large objects occur outside TLAB */
public class LargeClass {

    private static final int ARRAY_SIZE = 1024 * 1024;

    // long array should allocate sizeof(type) * size(array)
    private long[] largeArray;

    public LargeClass() {
        largeArray = new long[ARRAY_SIZE];
    }

    public long[] getLargeArray() {
        return largeArray;
    }
}
