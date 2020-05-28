package code.stream;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TestDemo01 {
    public static void main(String[] args) {
        String[] ss = {"郭靖","张一鸣","张远山","张翠山","赵敏","郭德纲"};
        Set<Person> personSet = new HashSet<>();
        Set<String> nameSet = new HashSet<>();
        //1.第一个队伍名字为三个字的成员 ，只要前三个
        Stream<String> stream1 = Stream.of(ss).filter(s->s.length()==3).limit(3);
        //2.姓张的 不要前两个
        Stream<String> stream2 = Stream.of(ss).filter(s -> s.startsWith("张")).skip(2);
        //3.存储到集合中
        Stream.concat(stream1,stream2).forEach((s)->{
            System.out.println(s);
            nameSet.add(s);
        });
        System.out.println("================================");
        nameSet.stream().forEach(s->personSet.add(new Person(s)));
        personSet.forEach(s-> System.out.println(s.getName()));
    }
}
