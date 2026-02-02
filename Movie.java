/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Movie
{
  //Objects, therefore mutated if ref changes
  private String title;
  private String author;
  //Can only mutate by value
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }
}
