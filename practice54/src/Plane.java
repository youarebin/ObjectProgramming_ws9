//컴퓨터학과_20220740_가유빈
public class Plane {

	int id;
	String model;
	int capacity;
	private static int planes = 0;
	
	public String toString() {
		String rslt = "";
		
		rslt += "식별번호: " + id + "편";
		rslt += "\n모델: " + model;
		rslt += "\n승객수: " + capacity + "명";
		rslt += "\n현재까지 추가된 비행기는 모두 "+ getPlanes(planes) + "대 입니다.\n";
		
		return rslt;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Plane() {
		this(0,"모름",0);

	}
	public Plane(int id, String model, int capacity) {
		planes++;
		getPlanes(planes);
		setId(id);
		setModel(model);
		setCapacity(capacity);
	}
	public static int getPlanes(int p) {
		return p;
	}

}
