package code.stream;

import java.util.stream.Stream;

/**
 * skip(n) 跳过前n个元素
 */

public class StreamSkip01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 3, 4, 6, 8);
        stream.skip(3).forEach(i-> System.out.println(i));
    }
}
