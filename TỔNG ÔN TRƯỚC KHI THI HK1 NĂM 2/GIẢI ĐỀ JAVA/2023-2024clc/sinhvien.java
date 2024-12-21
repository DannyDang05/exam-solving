public class sinhvien implements giaodien{
    String masv;
    String hoten;
    String ngaysinh;
    String nganh;
    float average;
    public sinhvien(){
        this.masv = "";
        this.hoten = "";
        this.ngaysinh = "";
        this.nganh = "";
        this.average = 0;
    }
    public sinhvien(String masv , String hoten, String ngaysinh , String nganh , float average ){
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.nganh = nganh;
        this.average = average;
    }

    @Override public void diemtrungbinh(float newaverage){
        this.average = newaverage;

    }
}
