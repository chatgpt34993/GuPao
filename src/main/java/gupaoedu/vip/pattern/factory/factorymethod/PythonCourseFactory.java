package gupaoedu.vip.pattern.factory.factorymethod;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
