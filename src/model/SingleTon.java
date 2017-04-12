package model;
/**
 * 
* @ClassName: SingleTon
* @Description: 单列模式
* 要点：1 将类构造函数的访问控制为私有
* 2 在类内部定义一个该类的静态私有对象
* 3 在类的内部定义一个静态公有函数用于创建或获取它本身的静态私有对象
* @author wangfali
* @date 2017年4月10日 下午9:20:34
*
 */
public class SingleTon {
	//声明一个静态私有对象
	private static SingleTon instance=null;
	//声明一个公共静态函数获取或创建私有对象，其他类使用单列类的入口
	public static SingleTon getInstance() {
		//如果静态私有对象还没有创建，则创建这个对象
		if(instance==null){
			//因为类的字节码在内存中的唯一，可以来当锁
			synchronized (SingleTon.class) {
				//创建对象的进程必须是互斥的
				if(instance==null){
					instance=new SingleTon();//创建对象的实例化
				}
			}
		}
		return instance;
	}
	//用于测试单例模式
	private SingleTon(){
		System.out.println("调用单列模式！");
	}
	//用于测试单列模式
	public void say(){
		System.out.println("单列模式的调用！");
	}
	public void delete(){
		
	}
}
