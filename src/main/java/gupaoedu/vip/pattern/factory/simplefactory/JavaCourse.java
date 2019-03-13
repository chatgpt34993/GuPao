package gupaoedu.vip.pattern.factory.simplefactory;

public class JavaCourse implements ICourse{
    @Override
    public void read() {
        System.out.println("正在录制java课程");
    }
}
