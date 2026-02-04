/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m)
  {
    movie = m;
  }

  public Book getBook()
  {
  return book;
  }


/*Modify toString to show the state
* of the library
* @precondition MediaLib not null
*
*/
public String toString()
{
  String info = "";

  if (book == null) {
    info += "Book: none\n";
  } 
  else {
    info += "Book: " + book + "\n";
  }

  if (movie == null) {
    info += "Movie: none";
  } 
  else {
    info += "Movie: " + movie;
  }

  return info;
}

public void testBook(Book tester)
{
  tester.setTitle("TEST TITLE");
  System.out.println("Inside testBook: " + tester);
}


}
