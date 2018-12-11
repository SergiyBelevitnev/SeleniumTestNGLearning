package preset;

import java.util.Optional;

public enum URL {

    TESTURL("https://www.seleniumhq.org/docs/");


    private String address;

    URL(final String address) {
        this.address = address;
    }

    public String toString() {
        return Optional.ofNullable(System.getenv("URL")).orElse(address);
    }




}
