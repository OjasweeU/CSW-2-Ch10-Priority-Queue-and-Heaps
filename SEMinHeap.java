//Kth smallest element in min heap
package Practice;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
public class SEMinHeap 
{
	public static int findKthSmallest(List<Integer> input, int k)
    {
        if (input==null||input.size()<k) 
        {
            System.exit(-1);
        }
 
        PriorityQueue<Integer> pq = new PriorityQueue<>(input);
 

        while (--k>0) 
        {
            pq.poll();
        }
        return pq.peek();
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> input = Arrays.asList(5, 9, 7, 2, 3, 6, 8);
        int k = 3;
        System.out.println("k'th smallest array element is " + findKthSmallest(input, k));
	}
}
