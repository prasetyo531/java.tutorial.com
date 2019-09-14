package chapter9b;

public class person {

    /*
    person --> employee
     */

    private String name;
    private int age;
    private String gender;

    //same name with class
    public person(String name){
        System.out.println("in person 1nd constructor");
    }

    /*
      overloading methods = ketika method bisa punya banyak nama yg sama tapi berbeda paramater dalama 1 class
    */

    public person(int age){
        System.out.println("in umur 2nd constructor");
    }

    //get name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //get gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
