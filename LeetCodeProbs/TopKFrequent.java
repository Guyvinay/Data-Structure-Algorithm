package LeetCodeProbs;
import java.util.*;
class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer > map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            List<Integer> li = new ArrayList<>();
            li.add(ent.getValue());
            li.add(ent.getKey());
            list.add(li);
        }
        Collections.sort(
            list,
            new Comparator<List<Integer>>() {
                public int compare(List<Integer>a, List<Integer>b){
                    return b.get(0).compareTo(a.get(0));
                }
            }
        );
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i]=list.get(i).get(1);
        }
        // System.out.println(list);
        return arr;
    }
}