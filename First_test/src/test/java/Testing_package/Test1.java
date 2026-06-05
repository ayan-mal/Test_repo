package Testing_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test1 {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
  }

}
