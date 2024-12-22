public class seniormember extends member{
    public seniormember(){
        super();

    }
    public seniormember(String fullname, int type , String address){
        super(fullname,type,address);
    }
    @Override public int tinhphi(){
        if(loai<=2){
            return 200000;
        }else return 400000;
    }
    
}
