package model;
/**
 * 
* @ClassName: SingleTon
* @Description: 单列模式
* @author wangfali
* @date 2017年4月10日 下午9:20:34
*
 */
public class SingleTon {
	//声明一个静态私有对象
	private static SingleTon instance=null;
	//声明一个公共静态函数获取或创建私有对象，其他类使用单列类的入口
	public static SingleTon getInstance() {
		if(instance==null){
			synchronized (SingleTon.class) {
				if(instance==null){
					instance=new SingleTon();
				}
			}
		}
		return instance;
	}
	private SingleTon(){
		System.out.println("调用单列模式！");
	}
}
