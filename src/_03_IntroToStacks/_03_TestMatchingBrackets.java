package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		String pusher = "i";
		char letter = 0;
		
		Stack<String> Brackets = new Stack<String>();
		
		for (int i = 0; i < b.length(); i++) {
			letter = b.charAt(i);
			
			
			if(letter == '{') {
			Brackets.push(pusher);
		}
			else{
				if(Brackets.isEmpty()) {
					return false;
				}
				Brackets.pop();
		}
			
			
			
		}
		
		if(Brackets.isEmpty()) {
			return true;
		}
		
		
		
		
		
		return false;
	}

}