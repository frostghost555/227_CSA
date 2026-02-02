/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
    book = b;
  }

/*Modify toString to show the state
* of the library
* @precondition MediaLib not null
*
*/
  public String toString() 
  {
    String info = "Book added! : \n" + book.toString();
    
    return info;
  }
}
