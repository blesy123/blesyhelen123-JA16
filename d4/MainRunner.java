package d4;

public class MainRunner {

	public static void main(String[] args) {
		Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type B
		
		MusicSystem ms = new MusicSystem();
		ms.setManufacturer("Sony");
		ms.setCost(1000);
		ms.setModelNumber("XAV-AX100");
		ms.setPower(true);
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
		car1.setMusicSystem(ms);
		
		car1.moveCarForward();
		//System.out.println(car1.getEngine().getBasepower());
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		
		car1.moveCarForward();
		//System.out.println(car1.getEngine().getBasepower());
		
		//--- Switch to new component ---
		// --- change engine ---
		car1.setEngine(tataEngine);
		car1.moveCarForward();
		//System.out.println(car1.getEngine().getBasepower());
		
		car1.playMusic();
		
		//ms.setPower(false);
		
		//car1.playMusic();
		
	}
}