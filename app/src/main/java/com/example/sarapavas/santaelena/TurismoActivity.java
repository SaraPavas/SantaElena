package com.example.sarapavas.santaelena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TurismoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.mInicio){
            Intent ii = new Intent(this, MainActivity.class);
            startActivity(ii);//intent y codigo para identificar la respuesta
            return true;
        }

        if(id == R.id.mHoteles){
            Intent ih = new Intent(this, HotelesActivity.class);
            startActivity(ih);//intent y codigo para identificar la respuesta
            return true;
        }
        if(id == R.id.mBares){
            Intent ib = new Intent(this, BaresActivity.class);
            startActivity(ib);//intent y codigo para identificar la respuesta
            return true;
        }

        if(id == R.id.mDemo){
            Intent ide = new Intent(this, DemoActivity.class);
            startActivity(ide);//intent y codigo para identificar la respuesta
            return true;
        }
        if(id == R.id.mAcerca){
            Intent ia = new Intent(this, AcercaActivity.class);
            startActivity(ia);//intent y codigo para identificar la respuesta
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
