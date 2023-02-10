package com.example.workbook.ch4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class P90_VarAndStreams {
    public void playground() throws IOException {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        numbers.filter(t -> t % 2 == 0).forEach(System.out::println);

        var numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream.filter(t -> t % 2 == 0).forEach(System.out::println);

        Stream<String> paths = Files.lines(Path.of("file.txt"));
        List<File> files = paths.map(p -> new File(p)).toList();

        var pathStream = Files.lines(Path.of("file.txt"));
        var fileList = pathStream.map(p -> new File(p)).toList();

    }
}
