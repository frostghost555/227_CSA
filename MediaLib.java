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

/*Modify toString to show the state
* of the library
* @precondition MediaLib not null
*
*/
  public String toString() 
  {
    String info = "Book added! : \n" + book.toString() + "," + "Movie added! : \n" + movie.toString();
    
    return info;
  }
}
