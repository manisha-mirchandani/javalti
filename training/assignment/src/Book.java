

public class Book{
	private String title ;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private Member member;
	
	public Book() {
	}
	
	public Book(String title) {
	this.title=title;
	}
	
	public void setMember(Member mbr) {
		this.member = member;
	}
	
	public void memberDetails() {
		if(member != null)
System.out.println(title +"is issued to" + member.getName());	
		else
			System.out.println(title+ "is not issued to any member");}
	
	public void issueBook(Member mbr) {
		if(member != null)
			System.out.println(title +"is already issued to" + member.getName());	
					else
					{
						mbr.setBook(this);
						this.member=mbr;
						System.out.println(title+ "is issued to " +member.getName());}}
		
	public void returnBook(Member mbr) {
		if(member == null || member.getName().equals(mbr.getName()) || mbr.getBook() == null)
			System.out.println(title + "not issued to" + mbr.getName());
		else {
			mbr.setBook(null);
			this.member = null;
			System.out.println(title + "is returned by"+ mbr.getName());
		}
	}
}
