package c3Polimorphism;

public class dynamicPolymorphismSecond extends dynamicPolymorphismFirst {

    @Override
    public void setIdentity(){

        employee employ = new employee();

        employ.setName("putra");
        employ.setEmployeeId("210");
        employ.setAge(21);
        employ.setTitle("mommies daily");

        System.out.println(employ.getName());
        System.out.println(employ.getEmployeeId());
        System.out.println(employ.getAge());
        System.out.println(employ.getTitle());
    }
}
