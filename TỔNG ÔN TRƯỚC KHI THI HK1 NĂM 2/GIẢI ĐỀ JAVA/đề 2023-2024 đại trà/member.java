import java.util.Scanner;

public abstract class member {
    public String ten;
    public int loai;
    public String diachi;
    public member(){
        this.ten = "";
        this.loai = 0;
        this.diachi = " ";
    }
    public member(String fullname ,int type, String address){
        this.ten = fullname;
        this.loai = type;
        this.diachi = address; 
    }

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho va ten:");
        ten = sc.nextLine();
        System.out.print("Nhap vao loai:");
        loai= sc.nextInt();
        System.out.print("Nhap vao dia chi:");
        diachi = sc.nextLine();
       
    }

    public abstract int tinhphi();

}
