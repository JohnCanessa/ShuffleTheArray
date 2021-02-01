import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * LeetCode 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {


    /**
     * 
     */
    static int[] shuffle(int[] nums, int n) {

        // **** sanity check(s) ****
        if (n == 1)
            return nums;

        // **** initialization ****
        int[] arr = new int[n * 2];

        // **** ****
        for (int i = 0, j = n, k = 0; i < n; i++, j++, k += 2) {

            // ???? ????
            // System.out.println("<<< i: " + i + " j: " + j + " k: " + k);

            arr[k]      = nums[i];
            arr[k + 1]  = nums[j];
        }

        // **** ****
        return arr;
    }


    /**
     * Test scaffolding
     * 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read int[] ****
        int[] nums = Arrays.stream(br.readLine().trim().split(","))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        // **** read number of pairs ****
        int n = Integer.parseInt(br.readLine().trim());

        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< nums: " + Arrays.toString(nums));
        System.out.println("main <<<    n: " + n);

        // **** process int[] and display result ****
        System.out.println("main <<< output: " + Arrays.toString(shuffle(nums, n)));
    }
}