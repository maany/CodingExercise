package org.cern.problem2;

import org.cern.problem2.impl.SpreadsheetImpl;

/**
 * Has to be implemented by any class that exports the data from ${@link SpreadsheetImpl}
 * Created by Mayank on 4/21/2017.
 */
public interface SheetExporter {
    /**
     * Converts ${@link SpreadsheetImpl} into a exportable format like JSON, CSV etc.
     * @return String representation
     */
    String export();
}
