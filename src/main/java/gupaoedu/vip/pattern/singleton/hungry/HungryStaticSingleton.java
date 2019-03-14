package gupaoedu.vip.pattern.singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungryStaticSingleton {

    private HungryStaticSingleton() {
    }

    private static final HungryStaticSingleton hungrysingleton ;
    static {
        hungrysingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return hungrysingleton;
    }
}
