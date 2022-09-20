package com.example.mybio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mybio.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding binding;

//    private Button btn;
//    private EditText etn;
//    private TextView ttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        btn=findViewById(R.id.button);
//        etn=findViewById(R.id.hobbies);
//        ttn=findViewById(R.id.view);
//       btn.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               ttn.setText(String.format("Hobbies : %s",etn.getText().toString().trim()));
//               ttn.setVisibility(View.VISIBLE);
//           }
//       });


        //dataBinding concept-----
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              binding.view.setText(String.format("Hobbies : %s",binding.hobbies.getText().toString().trim()));
              binding.view.setVisibility(View.VISIBLE);
            }
        });

    }
}