package tij.chapter2.exercise6;

/*Exercise 6: (2) Write a program that includes and calls the storage( ) method defined
as a code fragment in this chapter. 
*/
public class StringStorage {
	private String content;
	
	public StringStorage(String s) {
		this.content = s;
	}
	int storage(String s) {
		return s.length() * 2;
	}

	public int getBytesNeeded() {
		return storage(this.content);
	}
	
	public static void main(String[] args) {
		StringStorage stringStorage = new StringStorage("Stringy String");
		System.out.println("The Bytes Needed For This Storage Is " + stringStorage.getBytesNeeded() + " Bytes.");
	}
}
