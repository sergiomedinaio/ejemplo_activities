package ar.edu.davinci.ejemplo_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view) {
        Intent intent = new Intent(this, ActivityName.class);
        // acá debería agregar el dato
        intent.putExtra("nuevoDato", "Soy un dato");
        startActivity(intent);
    }
}