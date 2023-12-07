package OJProbs.Arrays;
import java.util.*;
class Main{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0; t<test; t++){
            int num = sc.nextInt();
            String[] strArr = new String[num];
            for(int i=0; i<num; i++){
                strArr[i] = sc.next();
            }
            pashaGrpupsAnagrams(num, strArr);
        }
        sc.close();
    }
    public static void pashaGrpupsAnagrams(int num, String[] arr){
        
        Map<String,List<String>> map = new HashMap<>();
        for(String str: arr ){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = String.valueOf(charArr);
            // System.out.println(sortedString);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(str);
            }else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(sortedString,strList);
            }
        }
        // System.out.println(map);
        for( Map.Entry<String, List<String>> ent : map.entrySet() ){
            // System.out.println(ent.getValue());
            List<String> list = ent.getValue();
            System.out.println(list.size());
            for(String s : list){
                System.out.println(s);
            }
        }
    }
}