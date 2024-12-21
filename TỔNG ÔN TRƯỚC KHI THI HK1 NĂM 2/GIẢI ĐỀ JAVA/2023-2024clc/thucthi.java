public class thucthi {
    public static void main(String[] args){
        danhsachsinhvien dssv = new danhsachsinhvien();
        dssv.themsinhvien();
        dssv.themsinhvien();
        dssv.themsinhvien();
        dssv.themsinhvien();
        dssv.themsinhvien();
        dssv.hiendanhsach(); // ket thuc cau 4a
        danhsachsinhvien dssv1 = new danhsachsinhvien();
        dssv1.themsinhvien();
        dssv1.themsinhvien();
        danhsachsinhvien dssv2 = new danhsachsinhvien();
        dssv2.themsinhvien();
        dssv2.themsinhvien();
        danhsachclass dslh = new danhsachclass();
        dslh.themlophoc(dssv1);
        dslh.themlophoc(dssv2);
        dslh.hienlophoc(); // ket thuc cau 4b
        dssv.capnhatdiem();// ket thuc cau 4c

    }
}
