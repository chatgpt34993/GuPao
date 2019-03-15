package gupaoedu.vip.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式
 */
public class PrototypeTest {
    public static void main(String[] args) {

        ConcreateprototypeA concreateprototypeA=new ConcreateprototypeA();
        concreateprototypeA.setAge(20);
        concreateprototypeA.setName("toms");
        List hobbies=new ArrayList<String>();
        concreateprototypeA.setHobbies(hobbies);
        Client client=new Client();
        ConcreateprototypeA copy=(ConcreateprototypeA)client.startClone(concreateprototypeA);

        System.out.println(copy);
        System.out.println("克隆对象中引用类型地址的值"+copy.getHobbies());
        System.out.println("原对象中引用类型地址的值"+concreateprototypeA.getHobbies());
        System.out.println(copy.getHobbies()==concreateprototypeA.getHobbies());
    }
}
