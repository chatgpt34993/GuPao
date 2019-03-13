package gupaoedu.vip.pattern.factory.abstactfactory;

import gupaoedu.vip.pattern.factory.ICourse;

//要求所有的子工厂都实现这个工厂
public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createIVideo();

}
