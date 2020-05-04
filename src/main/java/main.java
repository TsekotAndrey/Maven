import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\untitled\\src\\main\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
     ChromeDriver chromeDriver = new ChromeDriver();
     chromeDriver.get("http://anreal.by/");
     chromeDriver.close();

    }
}

