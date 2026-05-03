package org.example.LSP;

public class EditableDocument implements  Editable{

    private String data;

    public EditableDocument(String data){
        this.data=data;
    }

    @Override
    public void save(String newData) {
        this.data=newData;
        System.out.println("Document Saved");
    }

    @Override
    public void open() {
        System.out.println("Editable document opened. Dat: "+preview());
    }

    @Override
    public String getData() {
        return "";
    }

    private String preview(){
        return data.substring(0,Math.min(data.length(),20))+ "....";
    }
}
