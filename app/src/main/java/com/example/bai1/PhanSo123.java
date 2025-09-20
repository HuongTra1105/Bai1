package com.example.bai1;

import java.util.Scanner;

public class PhanSo123 {
    private int tuSo123;
    private int mauSo123;

    public PhanSo123() {
        tuSo123 = 0;
        mauSo123 = 1;
    }
    public PhanSo123(int tuSo123, int mauSo123) {
        this.tuSo123 = tuSo123;
        this.mauSo123 = mauSo123;
    }
    public void nhapPS(Scanner sc) {
        int a;
        int b;

        do {
            System.out.print("\tNhap vao tu so: ");
            a = sc.nextInt();

            System.out.print("\tNhap vao mau so: ");
            b = sc.nextInt();

            // kiem tra
            if (b == 0) {
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            } else {
                tuSo123 = a;
                mauSo123 = b;
            }
        } while (b == 0);
    }
    public void hienThiPS() {
        if (tuSo123 * mauSo123 < 0) {
            System.out.println("\t-" + Math.abs(tuSo123) + "/" + Math.abs(mauSo123));
        } else {
            System.out.println("\t" + Math.abs(tuSo123) + "/" + Math.abs(mauSo123));
        }
    }
    public PhanSo123 congPS(PhanSo123 ps2) {
        int a = tuSo123 * ps2.mauSo123 + ps2.tuSo123 * mauSo123;
        int b = mauSo123 * ps2.mauSo123;

        return new PhanSo123(a, b);
    }
    public PhanSo123 truPS(PhanSo123 ps2) {
        int a = tuSo123 * ps2.mauSo123 - ps2.tuSo123 * mauSo123;
        int b = mauSo123 * ps2.mauSo123;

        return new PhanSo123(a, b);
    }
    public PhanSo123 nhanPS(PhanSo123 ps2) {
        int a = tuSo123 * ps2.tuSo123;
        int b = mauSo123 * ps2.mauSo123;

        return new PhanSo123(a, b);
    }
    public PhanSo123 chiaPS(PhanSo123 ps2) {
        int a = tuSo123 * ps2.mauSo123;
        int b = mauSo123 * ps2.tuSo123;

        return new PhanSo123(a, b);
    }
    private int timUSCLN(int a, int b) {
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }
    public boolean kiemTraToiGian() {
        if (timUSCLN(tuSo123, mauSo123) == 1) {
            return true;
        }
        return false;
    }
    public void toiGianPS() {
        int x = timUSCLN(tuSo123, mauSo123);

        tuSo123 /= x;
        mauSo123 /= x;
    }
    public int getTuSo123() {
        return tuSo123;
    }
    public int getMauSo123() {
        return mauSo123;
    }
}
