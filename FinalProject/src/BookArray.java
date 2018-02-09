import java.util.ArrayList;
import java.util.Scanner;

public class BookArray
	{
		static ArrayList <Book> myLibrary = new ArrayList<Book>();
		public static void main(String[] args)
			{
				fillArray();
				printArray();
			}
		public static void fillArray()
			{
				myLibrary.add(new Book("Five Realities", "Contemporary", "Middle Grade", 2014, 19700));	
				myLibrary.add(new Book("The Sailor and the Slave", "Historical Fiction", "YA", 2014, 12300));				
				myLibrary.add(new Book("Summer of the SkyKeepers", "Fantasy", "Middle Grade", 2015, 60101));	
				myLibrary.add(new Book("Fall of the SkyKeepers", "Urban Fantasy", "Middle Grade", 2016, 66091));				
				myLibrary.add(new Book("The Taker", "Fantasy", "YA", 2017, 65829));				
				myLibrary.add(new Book("The Queen of Seas and Sin", "High Fantasy", "YA", 2017, 50067));				
			}
		public static void printArray()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Below are the completed books of Emy McGuire.");
				System.out.println("");
				for (int i = 0; i < myLibrary.size(); i++)
					{
						System.out.println(myLibrary.get(i).getTitle() + ", a " + myLibrary.get(i).getGenre() + " book written for " + myLibrary.get(i).getAudience() + " in " + myLibrary.get(i).getDate() + ", is " + myLibrary.get(i).getWordCount() + " words.");
					}	
			}
		
	}
