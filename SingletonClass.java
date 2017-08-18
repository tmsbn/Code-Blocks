public class SingletonClass{
	private SingletonClass = null;

	// Private constructor to avoid instantiation
	private SingletonClass(){

	}

	public SingletonClass getInstance(){
		if(singletonClass == null){
			singletonClass = new SingletonClass;
		}
		return SingletonClass;
	}
}