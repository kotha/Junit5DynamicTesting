package com.mohan;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@Component
public class TypeService {

    private static final Map<Integer, Pattern> LEVEL_MAP = new HashMap<>();

    private static final Pattern LEVEL1 = Pattern.compile("(42|43|45)|(6[1-9])|(8[5-9])|(9[1-8])");
    private static final Pattern LEVEL2 = Pattern.compile("(41|60|84)");
    private static final Pattern LEVEL3 = Pattern.compile("(40|59|83)");
    private static final Pattern LEVEL4 = Pattern.compile("(39|58|81|82)");
    private static final Pattern LEVEL5 = Pattern.compile("(38|57|79|80)");
    private static final Pattern LEVEL6 = Pattern.compile("(37|56|77|78)");
    private static final Pattern LEVEL7 = Pattern.compile("(3[4-6])|(5[3-5])|(7[4-6])");
    private static final Pattern LEVEL8 = Pattern.compile("(3[0-3])|(44)|(5[0-2])|(7[0-3])|(90)");
    private static final Pattern LEVEL9 = Pattern.compile("(11|12|13|20)");

    static {
        LEVEL_MAP.put(400, LEVEL1);
        LEVEL_MAP.put(180, LEVEL2);
        LEVEL_MAP.put(150, LEVEL3);
        LEVEL_MAP.put(120, LEVEL4);
        LEVEL_MAP.put(90, LEVEL5);
        LEVEL_MAP.put(60, LEVEL6);
        LEVEL_MAP.put(34, LEVEL7);
        LEVEL_MAP.put(30, LEVEL8);
        LEVEL_MAP.put(1, LEVEL9);
    }

    public int computeType(Type type) {
        return LEVEL_MAP.entrySet().stream()
                .filter(e -> e.getValue().matcher(type.getStatus()).find())
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(0);
    }
}