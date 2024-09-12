import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ CircleTest.class, EmployeeTest.class, MatrixTest.class,
		PersonTest.class, SquareTest.class, StudentTest.class })
public class AllTests {

}
