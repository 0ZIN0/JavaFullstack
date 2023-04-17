package myobj2;

public class MyFactory<T1, T2> {
	
	T1 material;
	T2 product;
	
	public void putMaterial(T1 material) {
		System.out.println("재료가 들어왔습니다: " + material);
		this.material = material;
	}
	
	public T2 getProduct() {
		return product;
	}
}
