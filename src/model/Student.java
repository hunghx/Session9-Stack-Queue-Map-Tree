package model;

public class Student {
//    @Override
//    public int compareTo(Student o) {
//        return  this.maSv.compareTo(o.maSv); // Hung-Huy
//        // String có sẵn phương thức compareTo để so sánh 2 chuỗi và trả về hiệu 2 chuỗi đó theo kiểu int
//    }

    private String maSv;
    private String hoTen;
    private int age;
    private String address;
    private double dtb;

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public Student() {
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String maSv, String hoTen, int age, String address) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.age = age;
        this.address = address;
    }


}
