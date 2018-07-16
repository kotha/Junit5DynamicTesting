package com.mohan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5DynamicTest {
    private static final TypeService service = new TypeService();
    private static Type type;

    @Disabled
    @TestFactory
    public Collection<DynamicTest> worstEverDynamicTest() {
        List<String> inTypes = new ArrayList<>(Arrays.asList("0", "99"));
        List<Integer> outTypes = new ArrayList<>(Arrays.asList(0, 0));

        Collection<DynamicTest> dynamicTests = new ArrayList<>();
        for (int i = 0; i < inTypes.size(); i++) {
            String inType = inTypes.get(i);
            Integer outType = outTypes.get(i);
            type.setStatus(inType);
            // create an test execution
            Executable exec = () -> assertEquals(outType, Integer.valueOf(service.computeType(type)));
            // create a test display name
            String testName = "Test Type " + inType;
            // create dynamic test
            DynamicTest dTest = DynamicTest.dynamicTest(testName, exec);
            dynamicTests.add(dTest);
        }
        return dynamicTests;
    }

    @TestFactory
    public Stream<DynamicTest> worstEverDynamicTestFromStream() {
        List<String> inTypes = new ArrayList<>(Arrays.asList("0", "99"));
        List<Integer> outTypes = new ArrayList<>(Arrays.asList(0, 0));
        return inTypes.stream()
                .map(types -> DynamicTest.dynamicTest("Test Type " + types, () -> {
                    int index = inTypes.indexOf(types);
                    assertEquals(outTypes.get(index), Integer.valueOf(service.computeType(type)));
                }));
    }

    @BeforeEach
    public void beforeAll() {
        type = Type.builder()
                .status("0")
                .build();
    }
}