package com.wonu606;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;

public class StringBuilderStringBufferExample {
    public static final int COUNT = 100000000;

    public static void main(String[] args) {
//        testString();
        testStringBuilder();
        testStringBuffer();
    }


    private static void testString() {
        String str = "";

        long startTime = System.currentTimeMillis();
        MemoryUsage startHeapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        long startUsedMemory = startHeapMemoryUsage.getUsed();
        for (int i = 0; i < COUNT; i++) {
            str += "hello";
        }
        MemoryUsage endHeapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        long endUsedMemory = endHeapMemoryUsage.getUsed();
        long endTime = System.currentTimeMillis();

        System.out.println("String");
        System.out.println("연산 시간: " + (endTime - startTime) + "ms");
        System.out.println("사용된 메모리: " + (endUsedMemory - startUsedMemory) + " bytes");
        System.out.println();
    }

    private static void testStringBuilder() {
        StringBuilder sb = new StringBuilder();

        long startTime = System.currentTimeMillis();
        MemoryUsage startHeapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        long startUsedMemory = startHeapMemoryUsage.getUsed();
        for (int i = 0; i < COUNT; i++) {
            sb.append("hello");
        }
        MemoryUsage endHeapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        long endUsedMemory = endHeapMemoryUsage.getUsed();
        long endTime = System.currentTimeMillis();

        System.out.println("StringBuilder");
        System.out.println("연산 시간: " + (endTime - startTime) + "ms");
        System.out.println("사용된 메모리: " + (endUsedMemory - startUsedMemory) + " bytes");
        System.out.println();
    }

    private static void testStringBuffer() {
        StringBuffer sb = new StringBuffer();

        long startTime = System.currentTimeMillis();
        MemoryUsage startHeapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        long startUsedMemory = startHeapMemoryUsage.getUsed();
        for (int i = 0; i < COUNT; i++) {
            sb.append("hello");
        }
        MemoryUsage endHeapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        long endUsedMemory = endHeapMemoryUsage.getUsed();
        long endTime = System.currentTimeMillis();

        System.out.println("StringBuffer");
        System.out.println("연산 시간: " + (endTime - startTime) + "ms");
        System.out.println("사용된 메모리: " + (endUsedMemory - startUsedMemory) + " bytes");
        System.out.println();
    }
}
