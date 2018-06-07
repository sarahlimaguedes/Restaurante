package br.com.example.restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setIcon( R.drawable.ic_action_name );
    }
}
