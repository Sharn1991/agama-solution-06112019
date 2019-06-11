package DAY1;

public class DemoWorkingWithFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkingWithFireFoxDriver wf=new WorkingWithFireFoxDriver();
		wf.invokeBrowser();
		
		wf.getTitleofthepage();
		wf.navigateCommand();
		wf.closeBrowser();

	}

}
