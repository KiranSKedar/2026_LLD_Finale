package org.example.LSP;

public class DocumentProcessor {

    public void process(Document doc){
        doc.open();
        System.out.println("Document processed");
    }

    public void processAndSave(Editable doc,String additionalInfo){
        doc.open();
        String currentData=doc.getData();
        String newData=currentData+" | Processed: "+additionalInfo;
        doc.save(newData);
        System.out.println("Editable document processed and saved");
    }
}
