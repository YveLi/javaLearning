/*
 * 设计模式：单例模式
 * 饿汉式
 * 使得一个类只能创建一个对象
 * */
public class TestSingleton {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getASingleton();
		Singleton singleton2 = Singleton.getASingleton();
		System.out.println(singleton1.equals(singleton2));			
	}

}

//饿汉式
class Singleton{
	private Singleton(){
		//私有化构造器，使得外部无法调用构造器
	}
	private static Singleton singleton = new Singleton();
	public static Singleton getASingleton(){
		return singleton;
	}
}


//懒汉式（不再写测试类）
class Singleton2{
	private Singleton2(){
		
	}
	private static Singleton2 sin = null;
	public static Singleton2 getSin(){
		if(sin == null){
			sin = new Singleton2();
		}
		return sin;
	}
}