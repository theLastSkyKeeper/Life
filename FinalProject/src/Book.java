
public class Book
	{
		String title;
		String genre;
		String audience;
		int date;
		int wordCount;
		
	public Book (String t, String g, String a, int d, int w)
		{
			title = t;
			genre = g;
			audience = a;
			date = d;
			wordCount = w;
		}

	public String getAudience()
		{
			return audience;
		}

	public void setAudience(String audience)
		{
			this.audience = audience;
		}

	public String getTitle()
		{
			return title;
		}

	public void setTitle(String title)
		{
			this.title = title;
		}

	public String getGenre()
		{
			return genre;
		}

	public void setGenre(String genre)
		{
			this.genre = genre;
		}

	public int getDate()
		{
			return date;
		}

	public void setDate(int date)
		{
			this.date = date;
		}

	public int getWordCount()
		{
			return wordCount;
		}

	public void setWordCount(int wordCount)
		{
			this.wordCount = wordCount;
		}
	}
