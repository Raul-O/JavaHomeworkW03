package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello!" );
        Novel book = new Novel();
        Album album = new Album();
        List<String> listNovels = new ArrayList<>();
        List<String> listAlbums = new ArrayList<>();
        //book1.setType("sf");
        String newLine = System.getProperty("line.separator");//line separator

        int option;
        do{
            System.out.println(
                    "Select an option:" + newLine +
                    "0  -   Exit" + newLine +
                    "1  -   List books" + newLine +
                    "2  -   Add a book" + newLine +
                    "3  -   Remove a book");
            option = Input.getInteger();
            switch(option){
                case 0:
                    System.out.println("Bye Bye");
                    break;
                case 1://List existing books in the library
                    System.out.println("Display:" + newLine +
                            "0  -   Return" + newLine +
                            "1  -   Novel's list" + newLine +
                            "2  -   Album's list");
                    int listOption = Input.getInteger();
                    switch(listOption){
                        case 1:
                            if(listNovels.isEmpty()){
                                System.out.println("List is empty");
                            }else {
                                for (String element:listNovels) {
                                    System.out.println(element);
                                }
                            }
                            break;
                        case 2:
                            if(listAlbums.isEmpty()){
                                System.out.println("List is empty");
                            }else {
                                for (String element:listAlbums) {
                                    System.out.println(element);
                                }
                            }
                            break;
                        default:
                            break;
                    }

                    break;
                case 2://Add a book to the library
                    System.out.println("What type of book do you want to add?" + newLine +
                            "0  -   Return" + newLine +
                            "1  -   Novel" + newLine +
                            "2  -   Album");
                    int addOption = Input.getInteger();
                    switch (addOption){
                        case 1:// get data for novel
                            book.setName();
                            book.setPages();
                            book.setType();
                            listNovels.add("|--TITLE--| " + book.getName().toString() + " |--PAGES--| " + book.getPages().toString() + " |--TYPE--| " + book.getType());
                            System.out.println("The book " + book.getName().toString() + " has been added to the list." );

                            break;
                        case 2://get data for album
                            album.setName();
                            album.setPages();
                            album.setPaperQuality();
                            listAlbums.add("|--TITLE--| " + album.getName().toString() + " |--PAGES--| " + album.getPages().toString() + " |--PAPER QUALITY--| " + album.getPaperQuality());
                            System.out.println("The album " + album.getName().toString() + " has been added to the list." );

                            break;
                        default:
                            break;
                    }


                    break;
                case 3://Remove a book from the library
                    ListIterator<String> iterator = null;
                    System.out.println("What type of book do you want to remove?" + newLine +
                            "1  -   Novel" + newLine +
                            "2  -   Album");
                    addOption = Input.getInteger();

                    int max=0;
                    switch(addOption){
                        case 1:
                            iterator = listNovels.listIterator();
                            max = listNovels.size();
                            break;
                        case 2:
                            iterator =listAlbums.listIterator();
                            max = listNovels.size();
                            break;
                    }
                    if(iterator.hasNext()) {
                        while (iterator.hasNext()) {
                            System.out.println(iterator.nextIndex() + " |----| " + iterator.next());
                        }
                        int removeOption;
                        do {
                            System.out.println("Enter the record's index you want to remove:");
                            removeOption = Input.getInteger();
                        }while(removeOption>(max-1));
                        switch (addOption) {
                            case 1:
                                listNovels.remove(removeOption);
                                break;
                            case 2:
                                listAlbums.remove(removeOption);
                                break;
                        }
                    }else{
                        System.out.println("Empty list");
                    }
                    break;
                default:
                    System.out.println("This is not a valid option. Please try again.");
            }


        }while(option!=0);

    }

}
