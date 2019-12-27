package com.jqc.jmh;

import org.openjdk.jmh.annotations.*;

import static org.junit.jupiter.api.Assertions.*;

public class PSTest {

    @Benchmark //测试那一段代码
    @Warmup(iterations = 1,time = 3)    // 预热，由于JVM中对于特定代码会存在优化（本地化），预热对于测试结果很重要
                                        // 预热多少次，预热多少时间（s）
    @Fork(5)  //用多少线程执行程序
    @BenchmarkMode(Mode.Throughput) //基准测试模式 //Throughput,每秒执行多少次
    @Measurement(iterations = 1,time = 3) //总共执行多少次测试
    public void foreach() {
        PS.foreach();
    }

    @org.junit.jupiter.api.Test
    public void parallel() {
    }
}