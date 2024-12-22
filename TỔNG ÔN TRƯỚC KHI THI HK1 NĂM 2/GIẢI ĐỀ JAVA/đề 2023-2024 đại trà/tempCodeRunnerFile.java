
import java.util.*;

public class memberlist {
    public int soluongthanhvien;
    public ArrayList<member> danhsach = new ArrayList<>();
    public void themthanhvien(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao ho va ten: ");
        String fullname = sc.nextLine();
        System.out.println("Nhap vao loai:");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao dia chi:");
        String address = sc.nextLine();
        System.out.println("Nhap loai khach hang: Standard Member hoac Senior Member");
        String loaikh = sc.nextLine();
        member mb;
        switch(loaikh){
            case "Standard Member":
             mb = new standardmember(fullname,type,address);
            break;
            case "Senior Member":
             mb = new seniormember(fullname,type,address);
            break;
            default:
            System.out.println("Vui long nhap dung format form: Standard Member hoac Senior Member");
            return;
        }
        danhsach.add(mb);
        soluongthanhvien++;

    }
    public void tongtien(){
        int total=0;
        for(member mb : danhsach){
            total = total + mb.tinhphi();
        }
        System.out.println("Tong tien: "+total);
    }
    public static void main(String[] args) {
        memberlist qlds = new memberlist();
        qlds.themthanhvien();
        qlds.themthanhvien();
        qlds.tongtien();
    }
}
