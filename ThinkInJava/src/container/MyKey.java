package container;

public class MyKey {
	
	private String name = null;
	private int age = 0;
	
	public MyKey(String name, int age) {
		this.name = name;
		this.age = age;
	}


	/*
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof MyKey) {
			MyKey objTemp = (MyKey) obj;
			if(name.equals(objTemp.name)&&age==(objTemp.age))
				return true;
			else
				return false;
		}else
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}
	*/
	
	public String toString() {
		// TODO Auto-generated method stub
		return name+age;
	}

}
