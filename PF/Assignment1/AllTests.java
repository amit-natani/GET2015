import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ BinaryToOctalTest.class, JobSchedulingTest.class,
		LongestSequence1Test.class, MergeSortTest.class,
		RemoveDuplicatesTest.class, SortedTest.class })
public class AllTests {

}
