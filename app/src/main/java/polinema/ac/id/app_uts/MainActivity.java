package polinema.ac.id.app_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerButtonSiswa(View view) {
        startActivity(new Intent(this, SiswaActivity.class));
    }

    @Override
    public void onBackPressed(){
        finish();
    }
}
