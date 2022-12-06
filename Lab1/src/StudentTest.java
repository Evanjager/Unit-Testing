import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * TODO: complete the following test, base the tests off of what was shown earlier test classes
 */
public class StudentTest {

    static Student bill, ben, bob;

    @BeforeAll
    static void initialize(){
        bob = new Student(18, "Bob Maher", new String []{"COSC 222","COSC 311", "MATH 200", "MATH 220"});
        bill = new Student(19, "Bill Cosby", new String []{"COSC 222", "COSC 404", "ENGL 112"});
        ben = new Student(24, "Ben Mckenny", new String []{"COSC 222", "COSC 111", "MATH 200", "PHYS 101"});
    }
    
	@Test
	void testGetClasses() {
		 //TODO: test that the classes array returned is correct
		 String[] bobclassestest = {"COSC 222","COSC 311", "MATH 200", "MATH 220"};
		 String[] billclassestest = {"COSC 222", "COSC 404", "ENGL 112"};
		 String[] benclassestest = {"COSC 222", "COSC 111", "MATH 200", "PHYS 101"};

		 assertArrayEquals(bobclassestest, bob.getClasses());
		 assertArrayEquals(billclassestest, bill.getClasses());
		 assertArrayEquals(benclassestest, ben.getClasses());

	}

	@Test
	void testGetAge() {
		//TODO: test that the age returned is correct
		assertEquals(18, bob.getAge());
		assertEquals(19, bill.getAge());
		assertEquals(24, ben.getAge());
	}
}