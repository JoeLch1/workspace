package code.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 构建Stream流有两种方式
 * 1.Collections构建流
 * 2.数组构建流 (通过函数接口的of方法构建)
 * 3.如果是Map 可以通过keySet()和values() 以及entrySet()构建流
 *
 * 流的常用终极方法
 * forEach()
 * count()
 *
 * 常用的函数接口
 * Consumer accept()处理数据
 * Predicate test()
 *
 * 常用的方法
 * fliter()
 */
public class StreamArray01 {
    //1.Collections 构建流
    Stream<String> steam1 = new ArrayList<String>().stream();
    Stream<Integer> stream2 = new HashSet<Integer>().stream();
    //2.数组构建流 通过静态方法构建
    Stream<String> stream3 =Stream.of("1","2","ds");
    //3.map构建流
    HashMap<Integer,String> map = new HashMap<>();
    Stream<Integer> stream4 = map.keySet().stream();//获取所有键构建流
    Stream<String> stream5 = map.values().stream();//获取所有值构建流
    Stream<Map.Entry<Integer,String>> stream6 = map.entrySet().stream();//获取键值对流

}
