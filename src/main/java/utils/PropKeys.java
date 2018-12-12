package utils;

public enum PropKeys {
    PROD_URL("prod.url.arg"),
    PROD_URL2("prod.url.arg2"),
    LT_URL("lt.url.arg"),
    WAIT_TIME_SEC("wait.time.sec"),
    DEFAULT_TIMEOUT("default.timeout");

    private String propName;

    private PropKeys(String propName) {
        this.propName = propName;
    }

    public String getPropName(String propName) {
        return propName;
    }

}
