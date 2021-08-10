package id.kotlin.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextNama=(EditText)findViewById(R.id.InputNama);
        Hasil=(TextView)findViewById(R.id.LblNama);
    }
    public void TampilNama(View v){
        Hasil.setText("Kamu pasti, "+TextNama.getText()+" ya!");
    }
}