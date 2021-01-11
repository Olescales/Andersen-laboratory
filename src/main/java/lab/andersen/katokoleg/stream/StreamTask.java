package lab.andersen.katokoleg.stream;

import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {

    public int first(Stream<String> stringStream) {
        return stringStream.map(Integer::parseInt).reduce(0, (subtotal, integer) -> subtotal + integer);
    }

    public int second (Stream<String> stringStream) {
     return (int)stringStream.map(Integer::parseInt).collect(Collectors.summarizingInt(Integer::intValue)).getSum();
    }

    public int third (Stream<String> stringStream) {
        return stringStream.mapToInt(Integer::parseInt).sum();
    }
}
