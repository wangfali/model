package made;

/**
* @ClassName: ConcrateBuilder
* @Description: 定义建造接口的实现类
* @author wangfali
* @date 2017年4月13日 下午8:17:48
*
*/
public class ConcrateBuilder implements IBuilder {
	//创建一个产品类的实例对象
	private Product product1=new Product();

	/* 
	* <p>Title: buildStep1</p>
	* <p>Description: 实现创建的方法</p>
	* @see made.IBuilder#buildStep1()
	*/
	@Override
	public void buildStep1() {
		product1.productMethod1();
	}

	/* 
	* <p>Title: buildStep2</p>
	* <p>Description:实现创建的方法</p>
	* @see made.IBuilder#buildStep2()
	*/
	@Override
	public void buildStep2() {
		product1.productMethod2();
	}

	/* 
	* <p>Title: getResult</p>
	* <p>Description:返回创建的对象</p>
	* @return
	* @see made.IBuilder#getResult()
	*/
	@Override
	public Product getResult() {
		return product1;
	}
	

}
