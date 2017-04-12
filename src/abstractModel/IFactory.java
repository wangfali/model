package abstractModel;

/**
* @ClassName: IFactory
* @Description: 抽象工厂模式
* 1.为创建一组相关的或相互依赖的对象提供一个接口，而且无需指定他们的具体类，
* 2.抽象工厂模式的每一个产品是来自不同的产品结构，但是它们都属于同一个族
* 3.模式工厂只能生产同一个产品（抽象工厂可以生产多个产品）
* @author wangfali
* @date 2017年4月12日 上午8:35:12
*
*/
public interface IFactory {
public IProductA createProductA();
public IProductB createProductB();
}
