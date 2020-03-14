package c3Polimorphism;

public class dynamicPolymorphismFirst {

    public void setIdentity(){

        person orang = new person();
        employee employ = new employee();

        employ.setName("pras");
        employ.setAge(20);
        orang.setGender("laki");
        employ.setTitle("female daily");

        System.out.println(employ.getName());
        System.out.println(employ.getAge());
        System.out.println(orang.getGender());
        System.out.println(employ.getTitle());
    }
}
