package designPattern.facade;

public class Home {
	private Audio audio;
	private Light light;
	private TV tv;
	
	public Home(Audio audio, Light light, TV tv){
		this.audio = audio;
		this.light = light;
		this.tv = tv;
	}

	public void enjoyTv() {
		// TODO Auto-generated method stub
		System.out.println("==불을 밝게하고 TV보기==");
		light.setLightness(2);
		tv.turnOn();
	}

	public void enjoyMusic() {
		// TODO Auto-generated method stub
		System.out.println("==불을 약간 어둡게하고 음악듣기");
		light.setLightness(1);
		audio.play();
	}

	public void goOut() {
		// TODO Auto-generated method stub
		System.out.println("==TV끄고, 음악도 끄고, 불도 끄고 외출하기.");
		if(tv.isTurnedOn()){
			tv.turnOff();
		}
		if(audio.isPlaying()){
			audio.stop();
		}
		light.setLightness(0);
	}
	
	
}
