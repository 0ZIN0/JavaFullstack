package myobj;

public class Animal {
	
	String name;
	String family;
	int height;
	
	public Animal(String name, String family, int height) {
		this.name = name;
		this.family = family;
		this.height = height;
	}
	
	@Override
	public String toString() {
		
		return "이 동물의 이름은 " + name + "입니다." + family + "과이며 " + "신장은 " + height +"cm 입니다." ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Animal)) {
			return false;
		}
		
		Animal a1 = this;
		Animal a2 = (Animal) obj;
		
		return a1.family.equals(a2.family);
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
}

