package org.example;

public class Novel extends Book{
    private String type;

    public void setType() {
        System.out.println("Enter book's type");
        type = Input.getString().toUpperCase();
    }

    public String getType() {
        return type;
    }

}
