package com.grh;


public class GlobaleTest {
public void conversible(String ch) throws NumberFormatException
{
Integer.parseInt(ch);	
}
public boolean verifNonNull(String ch)
{
	if(ch.isEmpty())
		return true;
	else 
		return false;
	// return ch.isEmpty();
}
}
