package Lab071;

import java.util.Scanner;

public class BookMenu {
    //Controller
    public static void inputBookInfo(Book.Builder bookBuilder) { //Input Parameter: Book.Builder
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input book's ISBN: ");
        bookBuilder.ISBN(scanner.nextLine());                //Input ISBN
        System.out.print("Input book's name: ");
        bookBuilder.name(scanner.nextLine());                //Input Title
        System.out.print("Input book's author: ");
        bookBuilder.author(scanner.nextLine());              //Input author
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book.Builder bookBuilder[] = null;
        int numberOfBooks = 0;
        String searchISBN;
        Boolean isContinuing = true;

        while (isContinuing) {
            System.out.println("\n=========BOOK MENU===========\n");
            System.out.println("1/ Add a new book");
            System.out.println("2/ Show all book information");
            System.out.println("3/ Retrieve book information");
            System.out.println("0/ Exit!");
            System.out.println("\n=============================\n");

            int userOption = scanner.nextInt();
            switch (userOption) {
                case 0:
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Input total numbers of book: ");
                    numberOfBooks = scanner.nextInt();
                    bookBuilder = new Book.Builder[numberOfBooks];
                    System.out.println("\n======== Please input your book info=========");
                    for (int i = 0; i < numberOfBooks; i++) {
                        System.out.println("Book number " + (i + 1) + ": ");
                        bookBuilder[i] = new Book.Builder();
                        BookMenu.inputBookInfo(bookBuilder[i]);
                    }
                    break;
                case 2:
                    System.out.println("=======List of books============\n");
                    for (int i = 0; i < numberOfBooks; i++) {
                        System.out.println("Book number " + (i + 1) + ": ");
                        bookBuilder[i].build().getBookInfo();
                    }
                    break;
                case 3:
                    Scanner scannerSearch = new Scanner(System.in);
                    System.out.print("Input your search by ISBN: ");
                    searchISBN = scannerSearch.nextLine();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Here is your search result: ");
                    for (int i = 0; i < numberOfBooks; i++) {
                        if (searchISBN.equals(bookBuilder[i].build().getISBN())) { //retrieve book
                            System.out.println("Book number " + (i + 1) + ": ");
                            bookBuilder[i].build().getBookInfo();
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong option !");
            }
        }
    }
}
