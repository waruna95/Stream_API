package lk.waruna.stream;

import java.util.stream.Stream;

public class NotCollectionForStream {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,40,12,35,67).sorted().forEach(System.out::println);

        Integer[] integers = {3,2,5,6,76,2,5,6,2,4,2,};

        Stream<Integer> integerStream=Stream.of(integers);
        integerStream.sorted().forEach(System.out::println);
    }
}
