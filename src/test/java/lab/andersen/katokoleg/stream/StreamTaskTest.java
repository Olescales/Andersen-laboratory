package lab.andersen.katokoleg.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamTaskTest {

    @Test
    public void testFirst() {
        Stream<String> stringStream = Stream.of("1", "-3", "4", "-8", "22");
        StreamTask streamTask = new StreamTask();
        int expFirst = streamTask.first(stringStream);
        Assert.assertEquals(16, expFirst);
    }

    @Test
    public void testSecond() {
        Stream<String> stringStream = Stream.of("1", "-3", "4", "-8", "22");
        StreamTask streamTask = new StreamTask();
        int expSecond = streamTask.second(stringStream);
        Assert.assertEquals(16, expSecond);
    }

    @Test
    public void testThird() {
        Stream<String> stringStream = Stream.of("1", "-3", "4", "-8", "22");
        StreamTask streamTask = new StreamTask();
        int expThird = streamTask.third(stringStream);
        Assert.assertEquals(16, expThird);
    }
}