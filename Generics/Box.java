package Generics;

public class Box<T> {

	T data;
	
	Box(T data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "Box [data=" + data + "]";
	}
	
	
	
	
}
