package factory;

/**
* @ClassName: Factory1
* @Description: 创建工厂类
* @author wangfali
* @date 2017年4月10日 下午10:23:52
*
*/
public class Factory1 implements IFactory {

	/* 
	* <p>Title: creatProduct</p>
	* <p>Description:实现工厂的方法</p>
	* @return
	* @see factory.IFactory#creatProduct()
	*/
	@Override
	public IProduct creatProduct() {
		return new Product1();
	}

}
