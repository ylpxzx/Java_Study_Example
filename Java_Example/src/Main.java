import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list_month_31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
//        List<Integer> list_month_30 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
//        Map<String, Object> dict = new HashMap<String, Object>();
//        dict.put("31", list_month_31);
//        dict.put("30", list_month_30);
        // ++++++++++++++++
        // TODO 判断key是否在集合/字典/map内
        HashMap map = new HashMap();
        map.put("1", "value1");
        map.put("2", "value2");

        // 方法1
        Iterator keys = map.keySet().iterator();
        while(keys.hasNext()){
            String key = (String)keys.next();
            if("2".equals(key)){
                System.out.println("存在keys");
            }
        }

        // 方法2
        boolean flag=map.containsKey("2");
        System.out.println(flag);
        // ++++++++++++++++ //


        // TODO 遍历Map集合
        /*
        Map.Entry<K,V>接口方法：
        equals(Object o)  比较指定对象与此项的相等性。
        getKey() 返回与此项对应的键。
        getValue() 返回与此项对应的值。
        hashCode() 返回此映射项的哈希码值。
        setValue(V value) 用指定的值替换与此项对应的值。
        */
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("a", "1");
        map1.put("b", "2");
        map1.put("c", "3");
        for (Map.Entry<String, Object> m : map1.entrySet()) {
            System.out.println("key=" + m.getKey());
            System.out.println("value=" + m.getValue());
        }

        // TODO 创建动态结构数组，判断值是否在数组中
        List<Integer> list_1 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> list_2 = Arrays.asList(4, 6, 9, 11);
        int i = 5;
        boolean result_31 = list_1.contains(i);
        boolean result_30 = list_2.contains(i);
        System.out.println("result_31:" + result_31);
        System.out.println("result_30:" + result_30);
    }

}
