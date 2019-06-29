package prototype;

/**
 * @program: design-pattern-demo
 * @description: 用在节省资源，多次创建重复对象的时候
 * @author: ZHQ
 * @create: 2019-06-29 22:10
 **/
public class PrototypePatternDemo {
    public static void main(String[] args) throws Exception {
        ShapeCache.loadCachedShape();

        Shape circle = ShapeCache.getShape("1");
        System.out.println("shape : " + circle.getType());

        Shape rectangle = ShapeCache.getShape("2");
        System.out.println("rectangle : " + rectangle.getType());
    }
}
