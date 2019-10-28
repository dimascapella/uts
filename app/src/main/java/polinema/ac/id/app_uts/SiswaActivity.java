package polinema.ac.id.app_uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SiswaActivity extends AppCompatActivity {

    private EditText INnis, INnama, INalamat, INhp, INketerangan;
    private String nis, nama, alamat, hp, keterangan;

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


    public void handlerButtonOk(View view) {
        nis = INnis.getText().toString();
        nama = INnama.getText().toString();
        alamat = INalamat.getText().toString();
        hp = INhp.getText().toString();
        keterangan = INketerangan.getText().toString();

        if(nis.isEmpty() && nama.isEmpty() && alamat.isEmpty() && hp.isEmpty() && keterangan.isEmpty()){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Isi Kembali Form Anda");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            alertDialog.show();
        }else{
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Data Siswa");
            alertDialog.setMessage("NIS : " + nis + "\nNama : " + nama + "\nAlamat : " + alamat + "\nHandphone : " + hp + "\nketerangan : " + keterangan);
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            alertDialog.show();
        }
    }
}
