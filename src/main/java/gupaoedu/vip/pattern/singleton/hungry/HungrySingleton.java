package gupaoedu.vip.pattern.singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungrySingleton {

    private HungrySingleton() {
    }

    private static final HungrySingleton hungrysingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrysingleton;
    }
}
