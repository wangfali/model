package made;

/**
* @ClassName: IBuilder
* @Description: 定义建造的方法
* @author wangfali
* @date 2017年4月13日 下午8:13:16
*
*/
public interface IBuilder {
	//声明部分建造的方法
	public void buildStep1();
	public void buildStep2();
	public Product getResult();
}
