package gupaoedu.vip.pattern.factory.factorymethod;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.JavaCourse;

public class JavaCourseFactory implements  ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
