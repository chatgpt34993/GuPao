package gupaoedu.vip.pattern.factory.abstactfactory;

/**
 * 抽象工厂模型
 */
public class AbstactFactoryTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory=new JavaCourseFactory();
        iCourseFactory.createCourse().read();;
        iCourseFactory.createNote();
        iCourseFactory.createIVideo();
    }
}
