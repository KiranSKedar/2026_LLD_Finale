package org.example.LSP;

public class Main {

    public static void main(String[] args) {
        EditableDocument editable = new EditableDocument("Draft proposal for Q3.");
        ReadOnlyDocument readOnly = new ReadOnlyDocument("Top secret strategy.");

        DocumentProcessor processor = new DocumentProcessor();

        System.out.println("--- Processing Editable Document ---");
        processor.processAndSave(editable, "Reviewed by Alice");

        System.out.println("\n--- Processing Read-Only Document ---");
        processor.process(readOnly); // Works fine

        // processor.processAndSave(readOnly, "Reviewed by Bob");
        // Won't compile! ReadOnlyDocument doesn't implement Editable.
    }
}
