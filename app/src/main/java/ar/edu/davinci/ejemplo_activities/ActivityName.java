package ar.edu.davinci.ejemplo_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ActivityName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Intent intent = this.getIntent();
        if(intent.hasExtra("nuevoDato")) {
            Log.i("mensaje", "Llegó el dato bien");
        }
    }
}