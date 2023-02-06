package com.example.workbook.ch4;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P78_SimpleExample {
    public void playground(){
        Map<Boolean, List<Integer>> evenAndOddMap = new HashMap<>();
        var evenAndOddMap2 = new HashMap<Boolean, List<Integer>>();

    }

    public Object fetchTransferableData(String data) throws IOException, UnsupportedFlavorException {
        StringSelection ss = new StringSelection(data);
        DataFlavor[] df = ss.getTransferDataFlavors();
        Object obj = ss.getTransferData(df[0]);

        return obj;
    }

    public Object fetchTransferableData2(String data) throws IOException, UnsupportedFlavorException {
        var ss = new StringSelection(data);
        var df = ss.getTransferDataFlavors();
        var obj = ss.getTransferData(df[0]);

        return obj;
    }

    public Object fetchTransferableData3(String data) throws IOException, UnsupportedFlavorException {
        var stringSelection = new StringSelection(data);
        var dataFlavorsArray = stringSelection.getTransferDataFlavors();
        var obj = stringSelection.getTransferData(dataFlavorsArray[0]);
        return obj;
    }




}
