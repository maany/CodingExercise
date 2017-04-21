package org.cern.problem2;

import org.cern.problem2.impl.SpreadsheetImpl;

/**
 * Created by Mayank on 4/21/2017.
 */
public class Office{
    public static SpreadsheetImpl newSpreadsheet(int rows, int columns){
        SpreadsheetImpl sheet= new SpreadsheetImpl(rows,columns);
        initalizeSheet(sheet);
        return sheet;
    }
    private static void initalizeSheet(SpreadsheetImpl sheet){
        sheet.put(0,0,"");
        sheet.put(3,4,"");
    }
}