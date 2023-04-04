package Week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
	public class seleniumintro {
		
		public static void main(String[] args) {
			
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoCsr");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.id("ext-gen499")).sendKeys("TestLeaf");
			driver.findElement(By.id("ext-gen501")).sendKeys("Satyanarayana");
			driver.findElement(By.id("ext-gen503")).sendKeys("Reddy");
			driver.findElement(By.id("ext-gen511")).sendKeys("+91");
			driver.findElement(By.id("ext-gen515")).sendKeys("996");
			driver.findElement(By.id("ext-gen519")).sendKeys("2050516");
			driver.findElement(By.id("ext-gen529")).sendKeys("mallidi.sathya@gmail.com");
			driver.findElement(By.id("ext-gen545")).click();
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			}
	}

