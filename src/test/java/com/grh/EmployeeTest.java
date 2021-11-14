	package com.grh;

public class EmployeeTest {
public boolean emailValid(String mail)
{
if(mail.length()<10)
	return false;
else
	if(mail.contains("@")&&mail.lastIndexOf("@")<mail.length()-2)
	{
		return true;
		
	}
	else
		return false;


}
}
