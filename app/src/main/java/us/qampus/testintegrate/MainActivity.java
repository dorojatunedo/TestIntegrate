package us.qampus.testintegrate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    TextView hello;
    Button pencetButton;
    EditText input_nama;
    Button button_submit;
    TextView text_nama;

    String welcome = "Welcome to my life again";
    int nomor = 155;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (TextView) findViewById(R.id.hello_world);
        hello.setText(welcome + "Nomer rumahku adalah " + String.valueOf(nomor));
        pencetButton = (Button) findViewById(R.id.pencet);

        pencetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello.setText("Hasan");
            }
        });

        input_nama = (EditText)findViewById(R.id.input_nama);
        button_submit = (Button)findViewById(R.id.button_submit);
        text_nama = (TextView)findViewById(R.id.text_nama);

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_nama.setText("Namaku adalah "+ input_nama.getText().toString());
            }
        });


    }

    public void ayo_pencet(View v) {
        Toast.makeText(this, "Aku dipencet", Toast.LENGTH_SHORT).show();
    }

}
