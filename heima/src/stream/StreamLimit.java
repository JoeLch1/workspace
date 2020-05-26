package stream;

import java.util.stream.Stream;

/**
 *
 * Stream limit 是流的截取方法 获取流中的前x个元素
 * count 统计元素个数，终极方法long 类型
 *
 */
public class StreamLimit {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 34, 5, 6, 7);
        stream.limit(5).forEach(i-> System.out.println(i));
        //stream.count();//错误，因为forEach是终极方法，流已经终止
    }
}
