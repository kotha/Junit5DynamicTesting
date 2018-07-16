package com.mohan;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class Junit4Test {
    private static final TypeService service = new TypeService();
    private Type type;

    @Before
    public void before() {
        type = Type.builder()
                .status("0")
                .build();
    }

    @Test
    public void computeWorstEverLevel0() {
        type.setStatus("0");
        Assertions.assertThat(service.computeType(type)).isEqualTo(0);
        type.setStatus("99");
        Assertions.assertThat(service.computeType(type)).isEqualTo(0);
    }

    @Test
    public void computeWorstEverLevel1() {
        type.setStatus("11");
        Assertions.assertThat(service.computeType(type)).isEqualTo(1);
        type.setStatus("12");
        Assertions.assertThat(service.computeType(type)).isEqualTo(1);
        type.setStatus("13");
        Assertions.assertThat(service.computeType(type)).isEqualTo(1);
        type.setStatus("20");
        Assertions.assertThat(service.computeType(type)).isEqualTo(1);
    }

    @Test
    public void computeWorstEverLevel30() {
        type.setStatus("30");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("31");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("32");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("33");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("44");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("50");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("51");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("52");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("70");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("71");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("72");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("73");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
        type.setStatus("90");
        Assertions.assertThat(service.computeType(type)).isEqualTo(30);
    }

    @Test
    public void computeWorstEverLevel34() {
        type.setStatus("34");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("35");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("36");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("53");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("54");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("55");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("74");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("75");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
        type.setStatus("76");
        Assertions.assertThat(service.computeType(type)).isEqualTo(34);
    }

    @Test
    public void computeWorstEverLevel60() {
        type.setStatus("37");
        Assertions.assertThat(service.computeType(type)).isEqualTo(60);
        type.setStatus("56");
        Assertions.assertThat(service.computeType(type)).isEqualTo(60);
        type.setStatus("77");
        Assertions.assertThat(service.computeType(type)).isEqualTo(60);
        type.setStatus("78");
        Assertions.assertThat(service.computeType(type)).isEqualTo(60);
    }

    @Test
    public void computeWorstEverLevel90() {
        type.setStatus("38");
        Assertions.assertThat(service.computeType(type)).isEqualTo(90);
        type.setStatus("57");
        Assertions.assertThat(service.computeType(type)).isEqualTo(90);
        type.setStatus("79");
        Assertions.assertThat(service.computeType(type)).isEqualTo(90);
        type.setStatus("80");
        Assertions.assertThat(service.computeType(type)).isEqualTo(90);
    }

    @Test
    public void computeWorstEverLevel120() {
        type.setStatus("39");
        Assertions.assertThat(service.computeType(type)).isEqualTo(120);
        type.setStatus("58");
        Assertions.assertThat(service.computeType(type)).isEqualTo(120);
        type.setStatus("81");
        Assertions.assertThat(service.computeType(type)).isEqualTo(120);
        type.setStatus("82");
        Assertions.assertThat(service.computeType(type)).isEqualTo(120);
    }

    @Test
    public void computeWorstEverLevel150() {
        type.setStatus("40");
        Assertions.assertThat(service.computeType(type)).isEqualTo(150);
        type.setStatus("59");
        Assertions.assertThat(service.computeType(type)).isEqualTo(150);
        type.setStatus("83");
        Assertions.assertThat(service.computeType(type)).isEqualTo(150);
    }

    @Test
    public void computeWorstEverLevel180() {
        type.setStatus("41");
        Assertions.assertThat(service.computeType(type)).isEqualTo(180);
        type.setStatus("60");
        Assertions.assertThat(service.computeType(type)).isEqualTo(180);
        type.setStatus("84");
        Assertions.assertThat(service.computeType(type)).isEqualTo(180);
    }

    @Test
    public void computeWorstEverLevel400() {
        type.setStatus("42");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("43");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("45");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("61");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("62");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("63");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("64");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("65");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("66");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("67");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("68");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("69");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("85");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("86");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("87");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("88");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("89");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("91");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("92");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("93");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("94");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("95");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("96");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("97");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
        type.setStatus("98");
        Assertions.assertThat(service.computeType(type)).isEqualTo(400);
    }
}