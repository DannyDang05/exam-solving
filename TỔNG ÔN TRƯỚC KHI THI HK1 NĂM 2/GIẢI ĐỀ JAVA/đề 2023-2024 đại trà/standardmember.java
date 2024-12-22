public class standardmember extends member {
    public int fee;
    public standardmember(){
        super();
    }
    public standardmember(String fullname , int type , String address){
        super(fullname,type,address);
        
    }
    @Override public int tinhphi(){
        return 100000;
    }
}
