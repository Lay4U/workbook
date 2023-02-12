package com.example.workbook.ch5;

import java.util.HashMap;
import java.util.Map;

public class P110_MapDefaultValue {
    public void playground(){
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1:5432");
        map.put("mysql", "192.168.0.50:3306");
        map.put("cassandra", "192.168.1.5:9042");

        String derby = map.get("derby"); // null

        String hp1 = map.getOrDefault("derby", "69:89.31.226:27017");
        String hp2 = map.getOrDefault("mysql", "69:89.31.226:27017");

    }
}
