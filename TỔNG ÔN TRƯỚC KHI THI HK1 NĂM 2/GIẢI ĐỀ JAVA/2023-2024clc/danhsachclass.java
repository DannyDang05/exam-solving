import java.util.*;
public class danhsachclass{
    public ArrayList<lophoc> dslh;
    public danhsachclass(){
        dslh = new ArrayList<>();
    }
    public void themlophoc(danhsachsinhvien dssv){
        Scanner sc=  new Scanner(System.in);
        System.out.print("Nhap vao ma lop can them:");
        String malop = sc.nextLine();
        lophoc lophoc = new lophoc(malop,dssv);
        dslh.add(lophoc);
    }
    public void hienlophoc(){
        for(lophoc lh : dslh){
            System.out.println("Ma lop:"+lh.malop);
            for(sinhvien sv : lh.dssv.danhsachsinhvien){
                System.out.println("MaSV: "+sv.masv+" FullName: "+sv.hoten+" Ngay sinh: "+sv.ngaysinh+" Chuyen nganh:"+sv.nganh+" Average: "+sv.average);

            }
        }
    }
}