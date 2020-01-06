package c3Polimorphism;

public class employee extends person {

     /*
    getter setter
     */

    private String employeeId;
    private String title;

    protected String umur;

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
