package beans.autowire.byname;

public class Categories {

	private Book bk;
	private String name;
	
	
	Categories(Book bk){
		this.bk=bk;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void show(){
		System.out.println("nnnnnnnnnnn=="+name);
		System.out.println("calling the show method==bookname="+bk.getBookname()+"book price=="+bk.getPrice());
	}
	
}
