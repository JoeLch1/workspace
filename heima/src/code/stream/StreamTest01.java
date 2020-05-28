package code.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamTest01 {
    public static void main(String[] args) {
        /**
         * 构建流的方法
         */
        //1.数组构建流
//        int[] arr = {1,3,45,6};
        Stream<Integer> stream1 = Stream.of(1,3,45,6);
        //2.集合构建流
        ArrayList<String> alist = new ArrayList<>();
        Stream<String> stream2 = alist.stream();
        //3.Map构建集合
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        Stream<Integer> stream3 = map.keySet().stream();
        Stream<Integer> stream4 = map.values().stream();
        Stream<Map.Entry<Integer, Integer>> stream5 = map.entrySet().stream();
        /**
         * 使用流 fliter
         */
        //1.fliter方法
        stream1.filter(i->i>5).
                filter(i->i<10).
                forEach(i-> System.out.println(i));
    }
}
