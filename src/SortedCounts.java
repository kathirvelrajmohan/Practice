import java.util.*;
public class SortedCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Get the integer array from the user
        int[] arr = new int[]{1, 1, 3, 3, 9, 1, 3, 3, 9};
        int[] ans = Max(arr);
        for(int i : ans) System.out.println(i);
    }
    static int[] Max(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> sorted = new ArrayList<>(map.entrySet());
        sorted.sort((a,b) -> b.getValue().compareTo(a.getValue()));
        int[] ans = new int[sorted.size()];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : sorted) {
            ans[i] = entry.getKey();
            i++;
        }
        return ans;
    }

}
