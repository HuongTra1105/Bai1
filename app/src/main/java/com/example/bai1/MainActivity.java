package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtTuSo1_123, edtMauSo1_123, edtTuSo2_123, edtMauSo2_123;
    Button btnCong_123, btnTru_123, btnNhan_123, btnChia_123;
    TextView txtKetQua_123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTuSo1_123 = findViewById(R.id.edtTuSo1_123);
        edtMauSo1_123 = findViewById(R.id.edtMauSo1_123);
        edtTuSo2_123 = findViewById(R.id.edtTuSo2_123);
        edtMauSo2_123 = findViewById(R.id.edtMauSo2_123);
        btnCong_123 = findViewById(R.id.btnCong_123);
        btnTru_123 = findViewById(R.id.btnTru_123);
        btnNhan_123 = findViewById(R.id.btnNhan_123);
        btnChia_123 = findViewById(R.id.btnChia_123);
        txtKetQua_123 = findViewById(R.id.txtKetQua_123);

        btnCong_123.setOnClickListener(v -> thucHienPhepToan("cong"));
        btnTru_123.setOnClickListener(v -> thucHienPhepToan("tru"));
        btnNhan_123.setOnClickListener(v -> thucHienPhepToan("nhan"));
        btnChia_123.setOnClickListener(v -> thucHienPhepToan("chia"));
    }
    private void thucHienPhepToan(String phep) {
        try {
            int tu1 = Integer.parseInt(edtTuSo1_123.getText().toString());
            int mau1 = Integer.parseInt(edtMauSo1_123.getText().toString());
            int tu2 = Integer.parseInt(edtTuSo2_123.getText().toString());
            int mau2 = Integer.parseInt(edtMauSo2_123.getText().toString());

            PhanSo123 ps1 = new PhanSo123(tu1, mau1);
            PhanSo123 ps2 = new PhanSo123(tu2, mau2);
            PhanSo123 ketQua;

            switch (phep) {
                case "cong":
                    ketQua = ps1.congPS(ps2);
                    break;
                case "tru":
                    ketQua = ps1.truPS(ps2);
                    break;
                case "nhan":
                    ketQua = ps1.nhanPS(ps2);
                    break;
                case "chia":
                    ketQua = ps1.chiaPS(ps2);
                    break;
                default:
                    ketQua = new PhanSo123(0,1);
            }
            ketQua.toiGianPS();
            txtKetQua_123.setText("Kết quả: " + ketQua.getTuSo123() + "/" + ketQua.getMauSo123());
        } catch (Exception e) {
            txtKetQua_123.setText("Vui lòng nhập đầy đủ và đúng định dạng!");
        }
    }
}
