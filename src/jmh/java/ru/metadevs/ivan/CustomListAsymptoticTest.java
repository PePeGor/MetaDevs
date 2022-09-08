package ru.metadevs.ivan;

import CustomList.CustomListImplementation;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class CustomListAsymptoticTest {

    CustomListImplementation<String> myList;
    String book = "1984";

    @Param({"1001", "10001", "100001"})
    public int iterations;

    @Benchmark
    public void add() {
         myList = new CustomListImplementation<String>(iterations);

        for (int i = 0; i < iterations - 1; i++) {
            myList.add(book);
        }
    }
}
