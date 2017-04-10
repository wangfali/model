/**  
* @Title: Factory2.java
* @Package factory
* @Description: TODO
* @author wangfali  
* @date 2017年4月10日 下午10:27:06
* @version V1.0  
*/ 
package factory;

/**
* @ClassName: Factory2
* @Description: 创建工厂类二
* @author wangfali
* @date 2017年4月10日 下午10:27:06
*
*/
public class Factory2 implements IFactory {

	/* 
	* <p>Title: creatProduct</p>
	* <p>Description: 实现工厂接口</p>
	* @return
	* @see factory.IFactory#creatProduct()
	*/
	@Override
	public IProduct creatProduct() {
		return new Product2();
	}

}
