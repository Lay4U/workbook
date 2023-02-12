package com.example.workbook.ch5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class P111_AbsentPresentInMap {

    public void playground(){
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1");
        map.put("mysql", "192,168.0.50");

        BiFunction<String, String, String> jdbcUrl
                = (k, v) -> "jdbc:" + k + "://" + v + "/customers_db";

        String mySqlJdbcUrl = map.computeIfPresent("mysql", jdbcUrl);

    }
}
