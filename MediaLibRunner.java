/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    String title = "Mr Baez";//String a
    Book myBook = new Book(title, "Cormack McCarthy");
    System.out.println(myBook);
    myLib.addBook(myBook);
    System.out.println(myLib);

    int rating = 10;
    myBook.setRating(rating);
    rating = 100;
    //if rating is changed what will
    //print out on the next line?
    title = "Blood Meridian";//Stringb
    System.out.println(myBook);

    Book newBook = new Book("The Martian", "Andy Weir");//booka
    MediaLib newLib = new MediaLib();
    newLib.addBook(newBook);//booka gets added to newLib
    System.out.println(newLib);
    //newBook.setAuthor("Miguel Baez");//booka gets changed on the author attribute
    newBook = new Book("New", "title");//bookb
    //What will print on 32?
    System.out.println(newLib);
  }
}
