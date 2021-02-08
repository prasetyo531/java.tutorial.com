package getterSetter;

public class Category {

    //should private, java should private attributes
    private int id;
    private String nama;
    private String info;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        if(info != null){
            this.info=info;
        }
    }
}
