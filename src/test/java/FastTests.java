import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        HelloWorldTest.class,
        GameCharacterTest.class
})
public class FastTests {
}
