import java.util.*;
public class danhsachsinhvien {
    public ArrayList<sinhvien> danhsachsinhvien;
    public danhsachsinhvien(){
        danhsachsinhvien = new ArrayList<>();
    }

    public void themsinhvien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma sinh vien:");
        String masv = sc.nextLine();
        System.out.println("Nhap vao ho ten :");
        String hoten = sc.nextLine();
        System.out.println("Nhap vao ngay sinh:");
        String ngaysinh = sc.nextLine();
        System.out.println("Nhap vao chuyen nganh:");
        String nganh = sc.nextLine();
        System.out.println("Nhap vao diem trung binh:");
        float average = sc.nextFloat();
        sinhvien sv = new sinhvien(masv,hoten,ngaysinh,nganh,average);
        danhsachsinhvien.add(sv);
    }

    public void timkiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten sinh vien can tim:");
        String fullname = sc.nextLine();
        for(sinhvien sv : danhsachsinhvien){
            if(sv.hoten.equals(fullname)){
                System.out.println("MaSV: "+sv.masv+" FullName: "+sv.hoten+" Ngay sinh: "+sv.ngaysinh+" Chuyen nganh:"+sv.nganh+" Average: "+sv.average);
                return;
            }
        }
        
        System.out.println("Khong tim thay sinh vien nay trong danh sach");
    }

    public void hiendanhsach(){
        for(sinhvien sv : danhsachsinhvien){
            System.out.println("MaSV: "+sv.masv+" FullName: "+sv.hoten+" Ngay sinh: "+sv.ngaysinh+" Chuyen nganh:"+sv.nganh+" Average: "+sv.average);
        }
    }

    public void capnhatdiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten sinh vien can tim:");
        String fullname = sc.nextLine();
        for(sinhvien sv : danhsachsinhvien){
            if(sv.hoten.equals(fullname)){
                System.out.println("Nhap vao diem trung binh moi:");
                float newaverage = sc.nextFloat();
                sc.nextLine();
                sv.diemtrungbinh(newaverage);
                System.out.println("MaSV: "+sv.masv+" FullName: "+sv.hoten+" Ngay sinh: "+sv.ngaysinh+" Chuyen nganh:"+sv.nganh+" Average: "+sv.average);
                return;
            }
        }
        
        System.out.println("Khong tim thay sinh vien nay trong danh sach");
    }

    
}
