package com.chumin.streams;

import org.openjdk.jmh.annotations.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
public class StreamsBenchmark {

    @Param({"100", "1000", "10000"})
    private int dataSize;

    private int[] data;

    @Setup
    public void setup() {
        // Инициализация данных перед запуском каждого бенчмарка
        data = new Random().ints(dataSize).toArray();
    }

    @Benchmark
    public void yourBenchmarkMethod() {
        // Ваш код бенчмарка, который будет измерять производительность
        // используя JMH API
    }

    // Другие методы бенчмарков...

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
