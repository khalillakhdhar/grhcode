package com.grh;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
