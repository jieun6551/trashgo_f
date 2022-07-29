package kr.hs.buil.trashgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void builStart(View v ){

        switch (v.getId()){

            case R.id.btnMainCall:
                Intent Intent = new Intent(this, reportActivity.class);
                startActivity(Intent);
                break;

        }

    }

}