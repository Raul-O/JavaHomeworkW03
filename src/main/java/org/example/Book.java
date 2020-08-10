package org.example;


public class Book {
    private String name = " ";
    private Integer pages;

    public void setName() {
        boolean space = true;
        System.out.println("Enter title");
        for(char character:Input.getString().toCharArray()){
            if(space){
                name +=Character.toUpperCase(character);
                space = false;
            }else{
                name +=character;
            }
            if(character==' '){
                space = true;
            }



        }
        name = name.trim();
    }

    public void setPages() {
        System.out.println("Enter number of pages");
        pages = Input.getInteger();
    }

    public Integer getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

}
