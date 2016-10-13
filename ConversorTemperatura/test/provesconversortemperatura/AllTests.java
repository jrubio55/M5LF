package provesconversortemperatura;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    ProvaConversor.class,
    ProvaExceptionsConversor.class
})
public class AllTests {

    public AllTests() {
    }

}
