
public class Computer implements ComputerOperastions{

	private String className= "";

	public Computer() {
		this.className = "Computer";
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getClassName() {
		return className;
	}
	
	
	public void turnOn() {
		System.out.println(getClassName() + " is now turned on!");
		
		
	}

	
	public void turnOff() {
		System.out.println(getClassName() + " is now turned off!");
		
	}

	
	public void perfomDownload() {
		System.out.println(getClassName() + " is now downloding a file!");
		
	}

	
	public void performUpload() {	
		System.out.println(getClassName() + " is now upploding a file!");
	
	}

	
	public void playVideo() {
		System.out.println(getClassName() + " is now playing a vudeo!");
		
	}

	
	public void playMusic() {
		System.out.println(getClassName() + " is now playing a song!");
		
	}


	
}
