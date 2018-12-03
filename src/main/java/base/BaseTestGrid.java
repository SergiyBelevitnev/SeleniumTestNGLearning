//package base;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Optional;
//import org.testng.annotations.Parameters;
//import com.grid.shedule.core.WebDriverInstansiator;
//
//public class BaseTestGrid {  @Parameters({"browserName", "browserVersion"})
//@BeforeClass
//public void setUp(@Optional String browserName, String browserVersion){
//    WebDriverInstansiator.setDriver(browserName, browserVersion);
//}
//
//    @AfterClass
//    public void tearDown() throws Exception{
//        WebDriverInstansiator.getDriver().quit();
//    }
//}
