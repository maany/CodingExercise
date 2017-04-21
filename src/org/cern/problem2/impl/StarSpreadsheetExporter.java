package org.cern.problem2.impl;

import org.cern.problem2.SheetExporter;

/**
 * Exports sheet data of ${@link SpreadsheetImpl} in star format
 * Created by Mayank on 4/21/2017.
 */
public class StarSpreadsheetExporter implements SheetExporter{
    private SpreadsheetImpl sheet;
    public StarSpreadsheetExporter(SpreadsheetImpl sheet){
        this.sheet=sheet;
    }
    @Override
    public String export(){
        StringBuilder data = new StringBuilder("");
        data.append(sheet.getRows()+ "," + sheet.getColumns() + "#");
        for(int i=0;i<sheet.getRows();i++)
            for(int j=0;j<sheet.getColumns();j++){
                String str = sheet.get(i,j);
                if(str==null || str.equals("")){
                    data.append("*");
                }else{
                    data.append(str + "*");
                }
            }
        return data.toString();
    }
}
