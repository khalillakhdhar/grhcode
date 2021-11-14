package com.grh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GrhcodeApplicationTests {

	@Test
	void contextLoads() {
	}
@Test
void compareStrings()
{
String ch="bonjour";
assertEquals(ch, "bonjour");

}
@Test
void comparetoZero()
{
assertTrue(5>0);	
}
@Test
public void whenExceptionThrown_thenAssertionSucceeds() {
Exception exception = assertThrows(Exception.class, () -> {
Integer.parseInt("1a");
});
String expectedMessage = "For input string";
String actualMessage = exception.getMessage();
assertTrue(actualMessage.contains(expectedMessage));
}
}
