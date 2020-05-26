package stream;

import java.util.stream.Stream;

public class StreamFliter01 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(-5,9,7,15,-3,24);
        integerStream.filter(i->i>0).
                filter(i->i<10).
                forEach(i-> System.out.println(i));
    }
}
