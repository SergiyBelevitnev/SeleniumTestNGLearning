java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub
http://localhost:4444/grid/register -port 5558 -browser browserName=chrome

java -jar  C:\Users\belevitnev\selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.1.81:4444/grid/register/