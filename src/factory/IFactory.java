/**  
* @Title: IFactory.java
* @Package factory
* @Description: TODO
* @author wangfali  
* @date 2017年4月10日 下午10:21:07
* @version V1.0  
*/ 
package factory;

/**
* @ClassName: IFactory
* @Description: 定义工厂接口
* 要点：将一个对象的创建交给一个工厂来创建，从而使调用者不必关系对象的创建
* @author wangfali
* @date 2017年4月10日 下午10:21:07
*
*/
public interface IFactory {
	/**
	 * 
	* @Title: creatProduct
	* @Description: 创建产品的方法
	* @param @return    
	* @return IProduct   
	* @throws
	 */
	public IProduct creatProduct();
}
