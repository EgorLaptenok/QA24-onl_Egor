package lesson8.exercise3;

import lesson8.exercise1.Rectangle;

public class Register {
    private Document[] documents;
    private int count;

    public Register() {
        documents = new Document[10];
        count = 0;
    }
    public void saveDocument(Document document){
        if(count< documents.length){
            documents[count]=document;
            count++;
            System.out.println("Документ с номером: "+ document.getNumber()+" успешно сохранен");
            System.out.println(" ");
        }else {
            System.out.println("Невозможно сохранить документ");
            System.out.println(" ");
        }
    }
    public void getDocumentInfo(int number){
        for (int i = 0; i < count ; i++) {
            if(documents[i].getNumber() == number){
                documents[i].printInfo();
                return;
            }
        }
        System.out.println("Нет документа с номером: "+ number);
        System.out.println(" ");
    }
}
