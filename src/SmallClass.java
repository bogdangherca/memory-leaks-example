/**
 * @author bgherca on 29/05/2018
 */
/* allocations for relatively small objects occure inside TLAB */
public class SmallClass {

    private static final int ARRAY_SIZE = 1024;

    private int[] array;

    public SmallClass() {
        array = new int[ARRAY_SIZE];
    }

    public int[] getArray() {
        return array;
    }
}
