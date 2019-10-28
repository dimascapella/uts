package polinema.ac.id.app_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t = new Thread(){
            @Override
            public void run(){
                try{
                    while(!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tHari = findViewById(R.id.hari);
                                TextView tJam = findViewById(R.id.jam);
                                TextView tTgl = findViewById(R.id.tgl);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat day = new SimpleDateFormat("E");
                                SimpleDateFormat tgl = new SimpleDateFormat(", dd-MMMM-yyyy");
                                SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
                                time.setTimeZone(TimeZone.getTimeZone("GMT+7"));
                                String Sday = day.format(date);
                                String Stime = time.format(date);
                                String Stgl = tgl.format(date);
                                if(Sday.equalsIgnoreCase("Sun")){
                                    Sday = "Minggu";
                                }else if(Sday.equalsIgnoreCase("Mon")){
                                    Sday = "Senin";
                                }else if(Sday.equalsIgnoreCase("Tue")){
                                    Sday = "Selasa";
                                }else if(Sday.equalsIgnoreCase("Wed")){
                                    Sday = "Rabu";
                                }else if(Sday.equalsIgnoreCase("Thu")){
                                    Sday = "Kamis";
                                }else if(Sday.equalsIgnoreCase("Fri")){
                                    Sday = "Jumat";
                                }else if(Sday.equalsIgnoreCase("Sat")){
                                    Sday = "Sabtu";
                                }
                                tHari.setText(Sday);
                                tTgl.setText(Stgl);
                                tJam.setText(Stime);
                            }
                        });
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }

    public void handlerButtonSiswa(View view) {
        startActivity(new Intent(this, SiswaActivity.class));
    }

    @Override
    public void onBackPressed(){
        finish();
    }
}
