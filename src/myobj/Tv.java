package myobj;

public class Tv {
		
	public int channel;
	public int volume;

	public Tv(int channel, int volume) {
		
		this.channel = channel;
		this.volume = volume;
	}
	
	public Tv() {
			
		this(10, 50);
		
	}
	
	public Tv(int channel) {
		
		this(channel, 50);
		
	}

	public void info() {
		
		System.out.printf("현재 채널 : %d\n현재 볼륨 : %d\n",
				this.channel, this.volume);
	}
	
	public void channelUp() {
		
		++channel;
	}
	
	public void channelDown() {
		
		--channel;
	}
	
	public void volumeUp() {
		
		++channel;
	}
	
	public void volumeDown() {
		
		--channel;
	}
}
