package preset;

import utils.PropKeys;
import utils.PropertiesUtils;

import java.util.Optional;

public enum URL {


//    TESTURL(PropertiesUtils.getProp(PropKeys.PROD_URL.getPropName()));


    TESTURL1("https://github.com/SergiyBelevitnev/SeleniumTestNGLearning/pulls");
//    TESTURL(PropertiesUtils.getProp(PropKeys.PROD_URL.getPropName()));


    private String address;

    URL(final String address) {
        this.address = address;
    }

    public String toString() {
        return Optional.ofNullable(System.getenv("URL")).orElse(address);
    }




}
