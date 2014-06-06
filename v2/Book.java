public class Book {

    private String title;
    private String author;
    private boolean available;
    private LLQueue<String> waitList;

    public Book(String name, String writer) {
	    title = name;
	    author = writer;
	    available = true;
	    waitList = new LLQueue<String>();
    }

    public String getTitle(){
	return title;
    }

    public String getAuthor(){
	return author;
    }

    public boolean getStatus(){
	return available;
    }

    public void add(String name){
	waitList.enqueue(name);
    }

    public String remove(){
	return waitList.dequeue();
    }

    public boolean isEmpty(){
	return waitList.isEmpty();
    }

    public String nextInQ(){
	return waitList.peekFront();
    }
    
    public String toString(){
    	
	return (getTitle() + ",, "+ getAuthor() + ",, " + getStatus() + ",, " +"<>");
    }

    public static void main(String[] args){
	Book Ron = new Book("Looking for Alaska", "John Green");
	System.out.println(Ron.getAuthor()); // returns John Green
	System.out.println(Ron.getStatus()); // returns true
	System.out.println(Ron.getTitle()); // returns Looking for Alaska
	Ron.add("Harry");
	Ron.add("Hermione");
	Ron.add("Sirius");
	System.out.println(Ron.remove()); //returns Harry
	System.out.println(Ron.isEmpty()); // returns false
	System.out.println(Ron.nextInQ()); // returns Hermione
	Ron.remove();
	Ron.remove();
	System.out.println(Ron.isEmpty()); // returns true
    }
}
