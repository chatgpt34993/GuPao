package gupaoedu.vip.pattern.singleton.lazy;

/**
 * 双重检查锁
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton() {
    }
    private static  LazyDoubleCheckSingleton lazySimpleSingleton=null;

    public static  LazyDoubleCheckSingleton getInstance(){
        if(lazySimpleSingleton==null){
            synchronized (LazySimpleSingleton.class){
                if(lazySimpleSingleton==null){
                    lazySimpleSingleton=new LazyDoubleCheckSingleton();
                }
            }
        }
        return  lazySimpleSingleton;
    }
}
