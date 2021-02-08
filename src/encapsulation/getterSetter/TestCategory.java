package getterSetter;

public class TestCategory {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(5);
        System.out.println(category.getId());

        category.setInfo("private");
        //prevent below case so getter setter is private
        //category.info=null;
        System.out.println(category.getInfo());
    }
}
