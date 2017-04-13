package yuanxing;

/**
* @ClassName: Prototype
* @Description: 原型模式
* @author wangfali
* @date 2017年4月13日 下午8:39:55
*
*/
public class Prototype implements Cloneable {
	public Prototype clone(){
		Prototype prototype=null;
		try {
			//不能保证父类含有克隆的方法，加上错误的防范
			//调用父类的clone方法，如果其他特殊情况，在super.clone()之后加上
			prototype=(Prototype) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prototype;
	}
}
