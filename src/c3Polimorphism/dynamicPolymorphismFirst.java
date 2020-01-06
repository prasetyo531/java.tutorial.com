package c3Polimorphism;

public class dynamicPolymorphismFirst {

    public void setIdentity(){

        employee employ = new employee();
        employ.setName("pras");
        employ.setAge(20);
        employ.setTitle("female daily");

        System.out.println(employ.getName());
        System.out.println(employ.getAge());
        System.out.println(employ.getTitle());
    }
}
