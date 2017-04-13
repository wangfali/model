package made;

/**
 * @ClassName: Director
 * @Description: 定义导演类
 * @author wangfali
 * @date 2017年4月13日 下午8:26:52
 *
 */
public class Director {
	private IBuilder builder = new ConcrateBuilder();

	public Product createProduct() {
		builder.buildStep1();
		builder.buildStep2();
		return builder.getResult();
	}
}
