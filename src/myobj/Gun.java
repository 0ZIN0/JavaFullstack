package myobj;

public class Gun {

	public int damage;
	public int speed;
	public int bullet;
	public int magazine;
	int bulletSize;
	String name;
	
	public Gun(int damage, int speed, int magazine) {
		this.damage = damage;
		this.speed = speed;
		this.magazine = magazine;
	}
	
	public void shoot() {
		
		if(bullet > 0) {
			System.out.println(damage + "피해를 입었다!");	
		} else {
			System.out.println("총알이 부족합니다");	
		}
		bullet--;
	}
	
	public void reload() {
		
		if(bullet < magazine) {
			System.out.println("재장전");
			for(int i = 0; i < magazine; i++) {
				bullet++;
			}

		} else {
			System.out.println("탄창이 꽉 찼습니다");
		}
	}

}

class HandGun extends Gun {
	
	public HandGun() {
		super(2, 5, 10);
	}
}

class rifle extends Gun {
	
	boolean trigger;
	
	public rifle() {
		super(5, 8, 30);
	}	
	
	public void Shoot(boolean trigger) {
		
		while(trigger) {
			if(bullet > 0) {
				System.out.println(damage + "피해를 입었다!");
			} else {
				System.out.println("총알이 부족합니다");	
			}
			bullet--;
		}
			
	}
}
