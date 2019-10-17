package polinema.ac.id.app_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SiswaActivity extends AppCompatActivity {

    private EditText INnis;
    private EditText INnama;
    private EditText INalamat;
    private EditText INhp;
    private EditText INketerangan;
    private String nis, nama, alamat, hp, keratangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);
        INnis = findViewById(R.id.txt_nis);
        INnama = findViewById(R.id.txt_nama);
        INalamat = findViewById(R.id.txt_alamat);
        INhp = findViewById(R.id.txt_hp);
        INketerangan = findViewById(R.id.txt_keterangan);
    }
}
