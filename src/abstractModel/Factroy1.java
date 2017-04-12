/**  
* @Title: Factroy1.java
* @Package abstractModel
* @Description: TODO
* @author wangfali  
* @date 2017年4月12日 上午8:47:12
* @version V1.0  
*/ 
package abstractModel;

/**
* @ClassName: Factroy1
* @Description: TODO
* @author wangfali
* @date 2017年4月12日 上午8:47:12
*
*/
public class Factroy1 implements IFactory{

	/* 
	* <p>Title: createProductA</p>
	* <p>Description:实现创建产品接口的方法</p>
	* @return
	* @see abstractModel.IFactory#createProductA()
	*/ 
	@Override
	public IProductA createProductA() {
		return new ProductA1();
	}

	/* 
	* <p>Title: createProductB</p>
	* <p>Description:实现创建产品B的方法</p>
	* @return
	* @see abstractModel.IFactory#createProductB()
	*/ 
	@Override
	public IProductB createProductB() {
		return new ProductB1();
	}

}
