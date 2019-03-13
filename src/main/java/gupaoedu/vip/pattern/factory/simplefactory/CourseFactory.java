package gupaoedu.vip.pattern.factory.simplefactory;

public class CourseFactory {

   public  ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if ("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    }
/*
    public  ICourse course(Class className){
        try {
            if(("".equals(className) || null==className)){

                return (ICourse) className.newInstance();
            }

        }catch (Exception e){

            e.printStackTrace();

        }
        return  null;
    }*/
}
