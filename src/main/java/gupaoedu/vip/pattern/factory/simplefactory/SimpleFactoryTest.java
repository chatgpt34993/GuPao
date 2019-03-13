package gupaoedu.vip.pattern.factory.simplefactory;

import gupaoedu.vip.pattern.factory.ICourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
       /* ICourse course=new JavaCourse();
        ICourse course1=new PythonCourse();
        course.read();
        course1.read();*/
       CourseFactory courseFactory=new CourseFactory();
      ICourse course= courseFactory.create("java");
      course.read();


    }
}
