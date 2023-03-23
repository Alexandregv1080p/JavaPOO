package dio.questoesjava;

import java.util.HashSet;
import java.util.Set;


public class Solution {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (Integer n: nums) {
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        return set.stream()
                .findFirst()
                .get();
    }
}
