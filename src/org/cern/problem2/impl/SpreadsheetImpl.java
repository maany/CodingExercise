package org.cern.problem2.impl;

import org.cern.problem2.ValueType;

/**
 * Implementation of a SpreadSheet
 * Created by Mayank on 4/21/2017.
 */
public class SpreadsheetImpl {
    private int rows = 0;
    private int columns = 0;
    private String[][] sheet = null;
    private ValueType[][] valueTypes = null;

    public SpreadsheetImpl(int rows, int columns) {
        this.rows = rows;
        this.columns = columns; // rows = 10, cols = 5 in test setup
        sheet = new String[rows][columns];
        valueTypes = new ValueType[rows][columns];
    }

    // utility methods
    public void put(int rowIndex, int columnIndex, String data) {
        if (rowIndex >= rows || columnIndex >= columns) {
            throw new IndexOutOfBoundsException("cannot put value out of limits");
        }
        ValueType type = findValueType(data);
        if (type == ValueType.INTEGER) {
            data = data.trim();
        }
        valueTypes[rowIndex][columnIndex] = type;
        sheet[rowIndex][columnIndex] = data;
    }

    public String get(int rowIndex, int columnIndex) {
        if (rowIndex >= rows || columnIndex >= columns) {
            throw new IndexOutOfBoundsException("cannot get value out of limits");
        }
        return sheet[rowIndex][columnIndex];
    }

    public ValueType getValueType(int rowIndex, int columnIndex) {
        if (rowIndex >= rows || columnIndex >= columns) {
            throw new IndexOutOfBoundsException("cannot get ValueType out of limits");
        }
        return valueTypes[rowIndex][columnIndex];
    }

    /**
     * Associates a ${@link ValueType} for given @param data.
     *
     * @param data The string that needs to be analyzed
     * @return the ${@link ValueType} associated with @param data
     */
    private ValueType findValueType(String data) {
        if (data.length() < 1) {
            return null;
        }
        try {
            int number = Integer.parseInt(data.trim());
            return ValueType.INTEGER;
        } catch (Exception ex) {
            // NaN
        }
        if (data.charAt(0) == '=') {
            return ValueType.FORMULA;
        } else {
            return ValueType.STRING;
        }
    }


    // Getters and Setters
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;

    }
}
