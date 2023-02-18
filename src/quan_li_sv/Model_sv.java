/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_sv;

/**
 *
 * @author proch
 */
public class Model_sv {
private String MaSv;

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String MaSv) {
        this.MaSv = MaSv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
private String   HoTen;
private String   DiaChi;
private String   Sdt;
private String  Khoa;
private String   Lop;
private String   GioiTinh;
public Model_sv()
    {
        MaSv = HoTen = DiaChi = Sdt = Khoa = Lop = GioiTinh = "";
    }
public Model_sv(String _MaSv, String _HoTen, String _DiaChi, String _Sdt, String _Khoa, String _Lop, String _GioiTinh)
    {
        MaSv = _MaSv;
        HoTen = _HoTen;
        DiaChi = _DiaChi;
        Sdt = _Sdt;
        Khoa = _Khoa;
        Lop = _Lop;
        GioiTinh = _GioiTinh;
    }
}
