package com.sid.validation;

import javax.swing.*;
import javax.swing.text.PlainDocument;

public final class Validation {

    public static void setNumberOnly(JTextField field) {
        PlainDocument doc = (PlainDocument) field.getDocument();
        doc.setDocumentFilter(new NumberFieldFilter());
    }
}
