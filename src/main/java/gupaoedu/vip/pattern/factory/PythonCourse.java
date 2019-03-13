package gupaoedu.vip.pattern.factory;

import gupaoedu.vip.pattern.factory.ICourse;

public class PythonCourse implements ICourse {

    @Override
    public void read() {
        System.out.println("正在录制python课程");
    }
}
