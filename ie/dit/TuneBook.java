//Hi Bryan,
//I couldn't complete it cause I have been consuming alot of time in the substring bit
//But it would be nice if you have a look at it and tell me
//what were the necessary corrections required for this
//after the test!
package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;


class TuneBook
{
	ArrayList<Tune>tunes = new ArrayList<Tune>();

	TuneBook(String s)
	//s is the name of the abc file
	{
		
	BufferedReader inputStream = null;
	try{
        
        inputStream = new BufferedReader(new FileReader(s + ".txt"));
        String ss = "";
        String l;
		int i = 0;
		int tcount = 0;
		Tune tt = new Tune();
		l = inputStream.readLine();
        if (l != null) {
            //if the line begins with a T
			if(l.substring(0,1)=="T" && tcount == 0)
			{
				tt.setTitle(l.substring(2));
				tcount++;
			}
			else if(l.substring(0,1)=="T" && tcount == 1)
			{
				tt.setaltTitle(l.substring(2));
				tcount++;
			}			
			else if(l.substring(0,1)=="W")
			{
				tt.setX((int)l.substring(2));
			}
			ss + = l + "\n";
		}
		else
		{	
			tt.setNotation(ss);
			if(tcount == 1)
			{
				tt.setaltTitle(null);
			}
			tunes.add(tt);
			ss = "";
			tcount = 0;
		}	
			
            
        
	/*	for(Tune t:tunes)
		{
			
			t.setTitle();
			
		}
		*/
	}
	catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
	
	public string toString()
	{
		StringBuffer sb = new StringBuffer();
        for(Tune t:tunes)
        {
            sb.append(t.getNotation + ", ");
        }

        return sb.toString();
		
	}
	
	public Tune findTune(String title)
	{
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
    }
}
