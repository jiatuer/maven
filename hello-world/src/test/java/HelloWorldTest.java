
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jason.mvnbook.helloworld.HelloWorld;

public class HelloWorldTest{
		
	@Test
	public  void testSayHello()
	{
		HelloWorld helloWorld = new HelloWorld();
		
		String result = helloWorld.sayHello();
		
		assertEquals("Hello Maven",result);
				
	}
	
	}
