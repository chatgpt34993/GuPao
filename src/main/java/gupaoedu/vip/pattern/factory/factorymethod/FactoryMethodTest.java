package gupaoedu.vip.pattern.factory.factorymethod;

import gupaoedu.vip.pattern.factory.ICourse;

/**
 * 工厂方法的实现
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory=new JavaCourseFactory();
        ICourse iCourse=iCourseFactory.create();
        iCourse.read();

    }
}
