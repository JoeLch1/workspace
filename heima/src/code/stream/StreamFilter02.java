package code.stream;

import java.util.stream.Stream;

public class StreamFilter02 {
    public static void main(String[] args) {
        Stream<String> string = Stream.of("ds34","w345","d309","e002");
        Stream<Integer> integers = string.map(((s)->{
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if('0'<=ch&&ch<='9')
                    sb.append(ch);
            }
            return Integer.parseInt(sb.toString());
        }));
        integers.forEach((i)-> System.out.println(i));
    }
}
