/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
	private int pages;
	private String refNumber;
	private int borrowed;
	final private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
		pages = bookPages;
		refNumber = "";
    }
	
	public String getAuthor()
	{
		return author;
	}

	public String getTitle()
	{
		return title;
	}

	public int getPages()
	{
		return pages;
	}
	
	public String getRefNumber()
	{
		return refNumber;
	}

    public void printAuthor()
	{
		System.out.println(author);
	}

	public void printTitle()
	{
		System.out.println(title);
	}
	
	public void printDetails()
	{
		System.out.print("Title: " + title + ", Author: " +
							author + ", Pages: " + pages +
							", Reference Number: ");
		if (refNumber.length() == 0) 
		{
			System.out.print("ZZZ");
		} else {
			System.out.print(refNumber);
		}
		System.out.println("\nThis book has been borrowed " + borrowed + " time(s).");
	}
	
	
	public void setRefNumber(String ref)
	{
		if (ref.length() >= 3)
		{
			refNumber = ref;
		} else {
			System.out.println("A reference number must be at least three characters long.");
		}
	}
	
	public void borrowed()
	{
		borrowed++;
	}
	
	public boolean isCourseText()
	{
		return courseText;
	}
}
