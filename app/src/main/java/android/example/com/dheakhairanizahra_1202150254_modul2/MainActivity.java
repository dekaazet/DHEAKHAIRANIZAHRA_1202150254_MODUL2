package android.example.com.dheakhairanizahra_1202150254_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayToast(String message) { //Method untuk membuat Toast
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    public void onRadioButtonClicked(View view) {           // Method untuk memberikan respon terhadap radio button yang diklik
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {                              //Jika yang dipilih dine in, maka tampilkan toast dan panggil method dineIn()
            case R.id.dine_in:
                if (checked)
                    displayToast(getString(R.string.dinein));   //Panggil method display toast dengan isi message Dine In
                    dineIn();
                break;
            case R.id.take_away:                             //Jika yang dipilih take away, maka tampilkan toast dan panggil method takeAway()
                if (checked)
                    displayToast(getString(R.string.takeaway)); //Panggil method display toast dengan isi message Take Away
                    takeAway();
                break;
        }
    }

    private void dineIn() {
        Intent intent = new Intent(this, dineIn.class);    //Membuat Intent untuk memulai aktivitas baru
        startActivity(intent);      //Menjalankan aktivitas
    }

    private void takeAway() {
        Intent intent = new Intent(this, takeAway.class);   //Membuat Intent untuk memulai aktivitas baru
        startActivity(intent);      //Menjalankan aktivitas
    }


}
