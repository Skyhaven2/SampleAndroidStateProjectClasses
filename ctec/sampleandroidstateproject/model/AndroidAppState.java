package ctec.sampleandroidstateproject.model;

import android.app.Application;

public class AndroidAppState extends Application
{
	private String name;
	private String phrase;
	private String age;
	private String stuff;
	
	public void onCreate()
	{
		super.onCreate();
		
		name = "";
		phrase = "";
		age = "";
		stuff = "";
	}
	
	public String getName()
	{
		return name;
	}
	public String getPhrase()
	{
		return phrase;
	}
	public String getAge()
	{
		return age;
	}
	public String getStuff()
	{
		return stuff;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public void setStuff(String stuff)
	{
		this.stuff = stuff;
	}
}
