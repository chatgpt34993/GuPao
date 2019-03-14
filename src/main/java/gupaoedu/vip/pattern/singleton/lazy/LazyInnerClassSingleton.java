package gupaoedu.vip.pattern.singleton.lazy;

/**
 * 静态内部类的实现方式
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
    }
    public   static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazyInnerClassSingleton;
    }

    private  static class LazyHolder {
        private static final LazyInnerClassSingleton lazyInnerClassSingleton=new LazyInnerClassSingleton();

    }
}
