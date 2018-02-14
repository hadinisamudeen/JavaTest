//Please read the note on TuneBook.java
package ie.dit;

public class Tune{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int a)
	{
		 x = a;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String s)
	{
		title = s;
	}
	public String getaltTitle()
	{
		return altTitle;
	}
	public String setaltTitle(String s)
	{
		altTitle = s;
	}
	public String getNotation()
	{
		return notation;
	}
	public String setNotation(String s)
	{
		notation = s;
	}
	
	public String toString()
	{
		string s = "";
		if(altTitle != null)
		{	
			s = x + "," + title + "," + altTitle;
		}
		else
		{
			s = x + "," + title;
		}
		return s;
	}
}