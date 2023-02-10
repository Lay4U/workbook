package com.example.workbook.ch4;

import java.util.Date;

public class P92_VarAndMethodReturnAndArgumentsType {
//    public var fetchReport(Player player, Date timestamp){
//        return new Report();
//    }

    public Report checkPlayer(){
        var player = new Player();
        var timestamp = new Date();
        var report = fetchReport(player, timestamp);

        return report;
    }

    private Report fetchReport(Player player, Date timestamp) {
        return new Report();
    }

    private class Player {
    }

    private class Report {
    }
}
