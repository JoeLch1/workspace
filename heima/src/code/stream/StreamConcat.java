package code.stream;

import java.util.stream.Stream;

/**
 * 同流合污
 * 把两个流合为一个流
 */
public class StreamConcat {
    public static void main(String[] args) {
        Stream<Double> stream1 = Stream.of(1.3d,2.3d,23d,4.3d);
        Stream<Double> stream2 = Stream.of(1.0d,3.4d,45d);
        Stream<Double> concat = Stream.concat(stream1,stream2);
        concat.forEach(d-> System.out.println(d));

    }
}
