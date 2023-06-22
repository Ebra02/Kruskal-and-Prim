
import java.io.FileNotFoundException;

/*
 Abdulaziz Kheder Alghamdi 2035244
 Ebrahim Mansour Sharka 2036339
 Mansour Ahmed Aldhahri 2036538
mdhiabaldahri@stu.kau.edu.sa
 */

/**
 *
 * @author Abdulaziz
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Prim.run_MinHeap_Prim();
        System.out.println("");
        Prim_Unorder_Array.run_UnorderArray_Prim();
        System.out.println("");
        Kruskal.run_Kruskal();
        
        
        
        
    }
}
