/**  
* @Title: Factroy2.java
* @Package abstractModel
* @Description: TODO
* @author wangfali  
* @date 2017年4月12日 上午8:50:07
* @version V1.0  
*/ 
package abstractModel;

/**
* @ClassName: Factroy2
* @Description: 实现工厂接口
* @author wangfali
* @date 2017年4月12日 上午8:50:07
*
*/
public class Factroy2 implements IFactroy2{

	/* 
	* <p>Title: createProductA2</p>
	* <p>Description: </p>
	* @return
	* @see abstractModel.IFactroy2#createProductA2()
	*/ 
	@Override
	public IProductA createProductA2() {
		return new ProductA2();
	}

	/* 
	* <p>Title: createProductB2</p>
	* <p>Description: </p>
	* @return
	* @see abstractModel.IFactroy2#createProductB2()
	*/ 
	@Override
	public IProductB createProductB2() {
		return new ProductB2();
	}

}
