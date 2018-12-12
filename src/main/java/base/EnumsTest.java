package base;

public class EnumsTest {

    public enum UrlUrl {
        PROD("https://metanit.com/java/tutorial/3.8.php"), QA("https://www.guru99.com/parameterization-using-xml-and-dataproviders-selenium.html");
        private String _urlUrl;
        private UrlUrl(String urlUrl) {
            _urlUrl = urlUrl;
        }
        public String getValue() {
            return _urlUrl;
        }

    }
}
