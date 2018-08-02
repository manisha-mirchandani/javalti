public class Member{
	

private String name;
private Book book;

public Member() {
}

public Member (String name)
{
	this.name = name;
}

public String getName()
{
	return name;
}

public Book getBook()
{
	return book;
}
public void setBook(Book book) {
	this.Book=book;
}


}