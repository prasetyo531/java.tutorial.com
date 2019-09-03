package chapter9b;

public class employee extends person {

    private String employeeId;
    private String title;

    /*
    getter setter
     */
     public employee(){
         super(20);
         System.out.println("in employee default cons");
     }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
