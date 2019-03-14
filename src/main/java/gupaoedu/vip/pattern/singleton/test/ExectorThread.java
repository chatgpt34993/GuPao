package gupaoedu.vip.pattern.singleton.test;

import gupaoedu.vip.pattern.singleton.hungry.HungrySingleton;
import gupaoedu.vip.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import gupaoedu.vip.pattern.singleton.lazy.LazyInnerClassSingleton;
import gupaoedu.vip.pattern.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazyInnerClassSingleton lazyInnerClassSingleton=LazyInnerClassSingleton.getInstance();
        //LazyDoubleCheckSingleton lazyDoubleCheckSingleton=LazyDoubleCheckSingleton.getInstance();
       // LazySimpleSingleton lazySimpleSingleton=LazySimpleSingleton.getInstance();
       // HungrySingleton hungrySingleton=HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazyInnerClassSingleton);
        //System.out.println(Thread.currentThread()+":"+hungrySingleton);
    }
}
