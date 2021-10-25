package Lab07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;

        while (isContinuing){
            System.out.println("====MENU====");
            System.out.println("1. To add a new book");
            System.out.println("2. To retrieve book info");
            System.out.println("0. Exit!");

            int userOption = scanner.nextInt();
            switch (userOption){
                case 0:
                    System.out.println("Thank you!");
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    retrieveBookInfo();
                    break;
                default:
                    System.out.println("Wrong option!");
            }

            }
        }
    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book ISBN: ");
        String bookISBN = scanner.nextLine();

        System.out.println("Book Title: ");
        String bookTitle = scanner.nextLine();

        System.out.println("Book's Author': ");
        String bookAuthor = scanner.nextLine();

        bookList.add(new Book(bookISBN, bookTitle, bookAuthor));
        System.out.println(bookList.get(0) + "|" + bookList.get(1) + "|" + bookList.get(2));
    }

    private static void retrieveBookInfo() {
    }




}

