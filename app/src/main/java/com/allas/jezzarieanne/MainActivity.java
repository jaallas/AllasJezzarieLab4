package com.allas.jezzarieanne;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = (Button) findViewById(R.id.back);
        final Button snack = (Button) findViewById(R.id.next);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "TOAST!";
                int duration = Toast.LENGTH_LONG;
                Toast.makeText(getApplicationContext(), "TOAST!", Toast.LENGTH_SHORT).show();
            }
        });

        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar Message!!!!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });

    }

    public void showSnackbar (View view, String message, int duration){

        Snackbar.make(view, message, duration).show();

    }

    @Override

    protected void onStart(){
        super.onStart();
        Log.d("LAB4", "onStart() has executed");
    }
    protected void onResume(){
        super.onResume();
        Log.d("LAB4", "onResume() has executed");
    }
    protected void onPause(){
        super.onPause();
        Log.d("LAB4", "onPause() has executed");
    }
    protected void onStop(){
        super.onStop();
        Log.d("LAB4", "onStop() has executed");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LAB4", "onDestroy() has executed");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("LAB4", "onRestart() has executed");
    }

}
