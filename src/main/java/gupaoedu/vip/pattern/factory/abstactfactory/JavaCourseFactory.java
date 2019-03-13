package gupaoedu.vip.pattern.factory.abstactfactory;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.JavaCourse;

public class JavaCourseFactory  implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createIVideo() {
        return new JavaVideo();
    }
}
