package com.example.raghul.implicitsearchs7a1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = (Button)findViewById(R.id.button);
        final EditText et = (EditText)findViewById(R.id.editText);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jj = et.getText().toString();
                String url = "https://www.google.co.in/search?q="+jj;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
